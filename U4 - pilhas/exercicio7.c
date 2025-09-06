#include <stdio.h>
#include <stdlib.h> // Para malloc e free

// --- Estrutura e Protótipos ---

// Define a estrutura da nossa Pilha Linear
typedef struct {
    int* array; // Ponteiro para o array de inteiros
    int topo;   // Posição do topo (e quantidade de elementos)
    int max;    // Capacidade máxima da pilha
} PilhaLinear;

// Protótipos das funções (boas práticas em C)
PilhaLinear* newPilhaLinear(int max);
void delPilhaLinear(PilhaLinear* pilha);
void empilhar(PilhaLinear* pilha, int elem);
int desempilhar(PilhaLinear* pilha);
void mostrar(PilhaLinear* pilha);
int pesquisar(PilhaLinear* pilha, int elem);


// --- Função Principal (Teste) ---

int main() {
    printf("Criando uma pilha com capacidade 5.\n");
    PilhaLinear* pilha = newPilhaLinear(5);

    printf("Empilhando 10, 20, 30...\n");
    empilhar(pilha, 10);
    empilhar(pilha, 20);
    empilhar(pilha, 30);

    printf("Estado da pilha (ordem de remoção): ");
    mostrar(pilha); // Esperado: [ 30 20 10 ]

    int removido = desempilhar(pilha);
    printf("Elemento desempilhado: %d\n", removido); // Esperado: 30
    
    printf("Estado da pilha agora: ");
    mostrar(pilha); // Esperado: [ 20 10 ]

    printf("Empilhando 40...\n");
    empilhar(pilha, 40);
    printf("Estado final da pilha: ");
    mostrar(pilha); // Esperado: [ 40 20 10 ]
    
    printf("Pesquisando pelo elemento 20: %s\n", pesquisar(pilha, 20) ? "SIM" : "NAO"); // Esperado: SIM
    printf("Pesquisando pelo elemento 99: %s\n", pesquisar(pilha, 99) ? "SIM" : "NAO"); // Esperado: NAO

    // Libera a memória alocada no final do programa
    delPilhaLinear(pilha);

    return 0;
}


// --- Implementação das Funções ---

/**
 * Aloca dinamicamente e inicializa uma nova pilha.
 * @param max Capacidade máxima da pilha.
 * @return Ponteiro para a nova pilha.
 */
PilhaLinear* newPilhaLinear(int max) {
    PilhaLinear* pilha = (PilhaLinear*) malloc(sizeof(PilhaLinear));
    pilha->array = (int*) malloc(max * sizeof(int));
    pilha->topo = 0;
    pilha->max = max;
    return pilha;
}

/**
 * Desaloca a memória da pilha e de seu array.
 * @param pilha Ponteiro para a pilha a ser deletada.
 */
void delPilhaLinear(PilhaLinear* pilha) {
    free(pilha->array);
    free(pilha);
}

/**
 * Insere um elemento no topo da pilha.
 * @param pilha Ponteiro para a pilha.
 * @param elem Elemento a ser inserido.
 */
void empilhar(PilhaLinear* pilha, int elem) {
    if (pilha->topo >= pilha->max) {
        printf("Erro: Pilha cheia (overflow)!\n");
        exit(1);
    }
    pilha->array[pilha->topo] = elem;
    pilha->topo++;
}

/**
 * Remove e retorna o elemento do topo da pilha.
 * @param pilha Ponteiro para a pilha.
 * @return O elemento removido.
 */
int desempilhar(PilhaLinear* pilha) {
    if (pilha->topo == 0) {
        printf("Erro: Pilha vazia (underflow)!\n");
        exit(1);
    }
    return pilha->array[--pilha->topo];
}

/**
 * Imprime os elementos da pilha na ordem em que serão removidos (LIFO).
 * @param pilha Ponteiro para a pilha.
 */
void mostrar(PilhaLinear* pilha) {
    printf("[ ");
    for (int i = pilha->topo - 1; i >= 0; i--) {
        printf("%d ", pilha->array[i]);
    }
    printf("]\n");
}

/**
 * Pesquisa por um elemento na pilha.
 * @param pilha Ponteiro para a pilha.
 * @param elem Elemento a ser procurado.
 * @return 1 se encontrar (verdadeiro), 0 caso contrário (falso).
 */
int pesquisar(PilhaLinear* pilha, int elem) {
    int resp = 0; // 0 == false
    for (int i = 0; i < pilha->topo && resp == 0; i++) {
        if (pilha->array[i] == elem) {
            resp = 1; // 1 == true
        }
    }
    return resp;
}