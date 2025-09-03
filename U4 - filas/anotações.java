Fila segue a regra FIFO( first in, first out), ou seja, o primeiro a entrar é o primeiro a sair
. Enfileirar(enqueue) -> uma nova pessoa sempre chega no fim da fila - muito eficiente (O(1)), ele apenas adiciona o novo elemento na posicao n e incrementa o contador, nao precisa mover nenhum outro elemento 
. Desenfileirar(dequeue) -> a pessoa atendida é sempre a que está no início da fila - muito ineficiente (O(n)), pois ela deixa um buraco que precisa ser fechado, exigindo que todos os outros n-1 elementos sejam deslocados para esquerca, quanto maior a fila mais lento fica 
**como implementar uma fila sem que uma das operacoes desloque todos os elementos?
-> Fila circular -> Ao inves de a fila começar na posicao 0 e terminar na n, uma fila circular o inicio e fim da fila "flutuam" pelo array. 
-> Para isso usamos dois ponteiros:
 1. primeiro: indica o indice do primeiro elemento da fila(quem será o proximo a sair). 
 2. ultimo: indica o indice de posicao vazia onde o proximo elemento será inserido
 . A magica acontece quando um dos ponteiros chega ao final do array, ele volta para o inicio(posicao 0). Isso é feito usando o operador de modulo (%)
 A regra para avançar um ponteiro é: ponteiro = (ponteiro + 1) % tamanho do array
 Analogia: pense em um relogio, depois das 12 horas, voce nao para, voce volta para a 1 hora. O array funcionara assim
 FIXAÇÃO
 . 0 % 5 = 0
 . 1 % 5 = 1
 . 2 % 5 = 2
 . 3 % 5 = 3 
 . 4 % 5 = 4
 N = 0;
 N = (N + 1) % 5;