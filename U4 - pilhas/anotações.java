Pilha -> tipo de dado que funciona com a regra FILO(first in last out)
Possui duas principais operações:
    EMPILHAR (push): Adiciona um item no topo
    DESEMPILHAR(pop): Remove um item do topo
EMPILHAR
    // melhor solucao, nela, decidimos que o topo da pilha será o fim da lista
    empilhar(push) = inserirFim
    desempilhar(pop) = removerFim
        Inserir: 
            push(1): Chama InserirFim(1). O 1 é adicionado no fim lista:[1]
            push(3): chama InserirFim(3). O 3 é adicionado no fim ; lista[1,3] // e assim sucessitivamente
            pop(): Chama removerFim().O ultimo elemento (3) é removido. lista[1]
            pop(): chama removerFim. O ultimo elemento(1) é removido. lista[]