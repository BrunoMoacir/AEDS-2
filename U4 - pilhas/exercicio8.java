public class exercicio8 {
    // percorrer o array da pilha de tras para frente
    // cada elemento inseri-lo no fim da nova lista
    // retornar a lista

    public ListaLinear toLista() throws Exception{
        ListaLinear lista= new ListaLinear();

        for(int i = this.topo -1; i >=0; i++){
            // insere cada elemento da pilha no fim da lista
            // usa a funcao ja criada antes 
            lista.inserirFim(this.array[i]);
        }
        return lista;
    }
}
