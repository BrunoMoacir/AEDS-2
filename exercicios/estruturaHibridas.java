class Contato{
    String nome;
    String telefone;
    String email;
    int CPF;
}

class Celula{
    Contato contato;
    Celula prox;
}

class No {
    char letra;
    No esq;
    No dir;
    Celula primeiro;
    Celula ultimo;
}

class Agenda{
    private No raiz;

    public Contato pesquisar(String nome){
        char primeiraLetra = nome.charAt(0);
        No no = pesquisarArvore(primeiraLetra, raiz);
        Contato contato = null;
        if(no != null){
            contato = pesquisaLista(nome, no primeiro);
        }
        // a foto q eu tava copiando cortou aqui
    }

    public No pesquisarArvore(char letra, No i){
        No no;
        if(i == null) no = null;
        else if(i.letra == letra) no = i;
        else if(letra < i.letra) no = pesquisarArvore(letra, i.esq);
        else no = pesquisarArvore(letra, i.dir);
        return no;
    }

    private Contato pesquisarLista(String nome, Celula primeiro){
        Contato contato = null;
        Celula i = primeiro.prox;
        while(i != null){
            if(i.contato.getNome().equals(nome)){
                contato = i.contato; i = null;
            } else 
                i = i.prox;
        }
        return contato;
    }

}