#include <stdio.h>
#include <stdlib.h> // Para malloc, free e exit

// --- Estrutura e Protótipos ---

/**
 * Estrutura da Fila Circular.
 */
typedef struct {
    int* array;    // Ponteiro para o array de inteiros
    int primeiro; // Índice do primeiro elemento
    int ultimo;   // Índice da próxima posição livre
    int max;      // Capacidade LÓGICA da fila
} FilaCircular;

// Protótipos das funções
FilaCircular* newFilaCircular(int max);
void delFilaCircular(FilaCircular* fila);
void enfileirar(FilaCircular* fila, int elem);
int desenfileirar(FilaCircular* fila);
void mostrar(FilaCircular* fila);
int pesquisar(FilaCircular* fila, int elem);


// --- Função Principal (Teste) ---

int main() {
    printf("Criando uma fila circular com capacidade 5.\n");
    FilaCircular* fila = newFilaCircular(5);

    printf("\nEnfileirando 10, 20, 30...\n");
    enfileirar(fila, 10);
    enfileirar(fila, 20);
    enfileirar(fila, 30);
    printf("Fila -> ");
    mostrar(fila); // Esperado: [ 10 20 30 ]

    printf("\nDesenfileirando duas vezes...\n");
    printf("Saiu: %d\n", desenfileirar(fila)); // Saiu: 10
    printf("Saiu: %d\n", desenfileirar(fila)); // Saiu: 20
    printf("Fila -> ");
    mostrar(fila); // Esperado: [ 30 ]

    printf("\nEnfileirando 40, 50, 60, 70 para forçar o 'wrap-around'...\n");
    enfileirar(fila, 40);
    enfileirar(fila, 50);
    enfileirar(fila, 60);
    enfileirar(fila, 70);
    printf("Fila -> ");
    mostrar(fila); // Esperado: [ 30 40 50 60 70 ]

    printf("\nPesquisando por 50: %s\n", pesquisar(fila, 50) ? "SIM" : "NAO"); // Esperado: SIM
    printf("Pesquisando por 10: %s\n", pesquisar(fila, 10) ? "SIM" : "NAO"); // Esperado: NAO

    // Libera a memória alocada no final do programa
    delFilaCircular(fila);

    return 0;
}


// --- Implementação das Funções ---

/**
 * Aloca dinamicamente e inicializa uma nova fila circular.
 */
FilaCircular* newFilaCircular(int max) {
    FilaCircular* fila = (FilaCircular*) malloc(sizeof(FilaCircular));
    // O TRUQUE DO +1: Alocamos um espaço extra no array para simplificar
    // a lógica de diferenciar uma fila cheia de uma vazia.
    fila->array = (int*) malloc((max + 1) * sizeof(int));
    fila->max = max;
    fila->primeiro = 0;
    fila->ultimo = 0;
    return fila;
}

/**
 * Desaloca a memória da fila e de seu array.
 */
void delFilaCircular(FilaCircular* fila) {
    free(fila->array);
    free(fila);
}

/**
 * Insere um elemento no fim da fila (Enqueue).
 */
void enfileirar(FilaCircular* fila, int elem) {
    // Validação de overflow (fila cheia)
    if (((fila->ultimo + 1) % (fila->max + 1)) == fila->primeiro) {
        printf("Erro: Fila cheia (overflow)!\n");
        exit(1);
    }
    
    fila->array[fila->ultimo] = elem;
    // Move o ponteiro 'ultimo' de forma circular
    fila->ultimo = (fila->ultimo + 1) % (fila->max + 1);
}

/**
 * Remove e retorna o elemento do início da fila (Dequeue).
 */
int desenfileirar(FilaCircular* fila) {
    // Validação de underflow (fila vazia)
    if (fila->primeiro == fila->ultimo) {
        printf("Erro: Fila vazia (underflow)!\n");
        exit(1);
    }

    int resp = fila->array[fila->primeiro];
    // Move o ponteiro 'primeiro' de forma circular
    fila->primeiro = (fila->primeiro + 1) % (fila->max + 1);
    return resp;
}

/**
 * Imprime os elementos da fila na ordem de inserção (FIFO).
 */
void mostrar(FilaCircular* fila) {
    printf("[ ");
    // O 'i' temporário percorre a fila de forma circular
    for (int i = fila->primeiro; i != fila->ultimo; i = (i + 1) % (fila->max + 1)) {
        printf("%d ", fila->array[i]);
    }
    printf("]\n");
}

/**
 * Pesquisa por um elemento na fila.
 * @return 1 se encontrar (verdadeiro), 0 caso contrário (falso).
 */
int pesquisar(FilaCircular* fila, int elem) {
    int resp = 0; // 0 == false
    for (int i = fila->primeiro; i != fila->ultimo && resp == 0; i = (i + 1) % (fila->max + 1)) {
        if (fila->array[i] == elem) {
            resp = 1; // 1 == true
        }
    }
    return resp;
}