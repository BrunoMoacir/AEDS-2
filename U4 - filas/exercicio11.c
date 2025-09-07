#include <stdio.h>
#include <stdlib.h> // Para malloc, free e exit

// --- Estrutura e Protótipos ---

// Define a estrutura da nossa Fila Linear
typedef struct {
    int* array; // Ponteiro para o array de inteiros
    int n;      // Quantidade de elementos atualmente na fila
    int max;    // Capacidade máxima da fila
} FilaLinear;

// Protótipos das funções
FilaLinear* newFilaLinear(int max);
void delFilaLinear(FilaLinear* fila);
void enfileirar(FilaLinear* fila, int elem);
int desenfileirar(FilaLinear* fila);
void mostrar(FilaLinear* fila);
int pesquisar(FilaLinear* fila, int elem);


// --- Função Principal (Teste) ---

int main() {
    printf("Criando uma fila com capacidade 5.\n");
    FilaLinear* fila = newFilaLinear(5);

    printf("Enfileirando 10, 20, 30...\n");
    enfileirar(fila, 10);
    enfileirar(fila, 20);
    enfileirar(fila, 30);
    printf("Fila atual: ");
    mostrar(fila); // Esperado: [ 10 20 30 ]

    int removido = desenfileirar(fila);
    printf("Elemento desenfileirado: %d\n", removido); // Esperado: 10
    
    printf("Fila atual (após o deslocamento): ");
    mostrar(fila); // Esperado: [ 20 30 ]

    printf("Enfileirando 40...\n");
    enfileirar(fila, 40);
    printf("Fila final: ");
    mostrar(fila); // Esperado: [ 20 30 40 ]

    printf("Pesquisando pelo elemento 30: %s\n", pesquisar(fila, 30) ? "SIM" : "NAO"); // Esperado: SIM
    printf("Pesquisando pelo elemento 99: %s\n", pesquisar(fila, 99) ? "SIM" : "NAO"); // Esperado: NAO

    // Libera a memória alocada no final do programa
    delFilaLinear(fila);

    return 0;
}


// --- Implementação das Funções ---

/**
 * Aloca dinamicamente e inicializa uma nova fila.
 */
FilaLinear* newFilaLinear(int max) {
    FilaLinear* fila = (FilaLinear*) malloc(sizeof(FilaLinear));
    fila->array = (int*) malloc(max * sizeof(int));
    fila->n = 0;
    fila->max = max;
    return fila;
}

/**
 * Desaloca a memória da fila e de seu array.
 */
void delFilaLinear(FilaLinear* fila) {
    free(fila->array);
    free(fila);
}

/**
 * Insere um elemento no fim da fila (operação rápida O(1)).
 */
void enfileirar(FilaLinear* fila, int elem) {
    if (fila->n >= fila->max) {
        printf("Erro: Fila cheia (overflow)!\n");
        exit(1);
    }
    fila->array[fila->n] = elem;
    fila->n++;
}

/**
 * Remove e retorna o elemento do início da fila (operação LENTA O(n)).
 */
int desenfileirar(FilaLinear* fila) {
    if (fila->n == 0) {
        printf("Erro: Fila vazia (underflow)!\n");
        exit(1);
    }
    
    int resp = fila->array[0];
    fila->n--;

    // --- A PARTE LENTA (O(n)) ---
    // Desloca todos os elementos uma posição para a esquerda.
    for (int i = 0; i < fila->n; i++) {
        fila->array[i] = fila->array[i + 1];
    }

    return resp;
}

/**
 * Imprime os elementos da fila na ordem em que foram inseridos (FIFO).
 */
void mostrar(FilaLinear* fila) {
    printf("[ ");
    for (int i = 0; i < fila->n; i++) {
        printf("%d ", fila->array[i]);
    }
    printf("]\n");
}

/**
 * Pesquisa por um elemento na fila.
 * @return 1 se encontrar (verdadeiro), 0 caso contrário (falso).
 */
int pesquisar(FilaLinear* fila, int elem) {
    int resp = 0; // 0 == false
    for (int i = 0; i < fila->n && resp == 0; i++) {
        if (fila->array[i] == elem) {
            resp = 1; // 1 == true
        }
    }
    return resp;
}