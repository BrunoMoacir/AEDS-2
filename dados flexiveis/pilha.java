package dados flexiveis;
// explicacao .prox:
// cada pessoa na fila é uma celula, a primeira pessoa da fila, que esta na frente de todo mundo, é o TOPO da pilha, a mão que a pessoa da frente está segurando, é o .prox, que aponta para a proxima pessoa na fila
//quando eu insiro um novo elemento, é como se uma nova pessoa entrasse na frente(o antigo topo) e a segura.Isso é o tmp.prox = topo no codigo, agora a fila tem uma nova pessoa na frente, então o topo da fila se torna essa nova pessoa. Isso é o topo = tmp.
// quando voce remove um elemento, é como se a primeira pessoa da fila saísse,o topo é removido, a segunda pessoa da fila (aquela que estava sendo referenciada pelo antigo topo.prox) agora se torna a primeira pessoa, ou seja, o novo topo.
// resumao: .prox é a referencia que conecta cada elemento ao seu vizinho, formando a corrente da pilha. Sem ele, a pilha nao existiria como uma estrutura ligada


class Celula{
    public int elemento;
    public Celula prox;

    public Celula(int x){
        this.elemento = x;
        this.prox = null;
    }
}


class pilha {
    private Celula topo;
    public Pilha(){
        topo = null;
    }
    public void inserir(int x){
        Celula tmp = new Celula(x);
        tmp.prox = topo;
        topo = tmp;
        tmp = null;
    }
    public int remover() throws Exception{
        if(topo == null){
            throw new Exception("Erro!");
        }
        int elemento = topo.elemento;
        Celula tmp = topo;
        topo = topo.prox;
        tmp.prox = null;
        tmp = null;
        return elemento;
    }
    public void mostrar(){
        System.out.print("[");
        for(Celula i = topo; i != null; i = i.prox){
            System.out.println(i.elemento + " ");
        }
        System.out.print("]");
    }

    // retornar a soma dos elementos 
    public int somaElementos(){
        int soma = 0;
        for(Celula i = topo; i != null; i = i.prox){
            soma += i.elemento;
        }
        return soma;
    }
    // retornar a soma dos elementos recursivamente
    public int somar(){
        return somarRecursivo(topo)
    }
    public int somarRecursivo(Celula i){
        if(i == null){
            return 0;
        }
        return i.elemento + somarRecursivo(i.prox);
    }

    // retornar o maior elemento dela
    public int maiorElemento(){
        int maior = 0;
        if(topo != null){// se a pilha nao estiver vazia, o maior elemento é o primeiro
            maior = topo.elemento;// primeiro elemento é o maior
            for(Celula i = topo; i != null; i = i.prox){// a cada passo, i se move para o proximo elemento da pilha i = i.prox,
                if(i.elemento > maior){// comparamos o valor do elemento atual com o maior que ja encontramos
                maior = i.elemento;
                }
            }
        }
        return maior;
    }
    // agora recursivamente
    public int maiorElementoRecursivo(){
        return maiorElementoRec(topo);
    }

    public int maiorElementoRec(Celula i){
        if(i.prox == null){// se a celula atual for a ultima da pilha (i.prox == null), o maior elemento é o atual
            return elemento;
        }

        int maiorRestoPilha = maiorElementoRec(i.prox);

        if(i.elemento > maiorRestoPilha){// compara o elemento atual com o maior elemento encontrado no resto da pilha, retorna o maior
            return i.elemento;
        } else{
            return maiorRestoPilha;
        }
    }

    // mostrar os elementos recursivamente
    void mostrar(Celula i){
        Celula i = topo;
        if(i != null){
            System.out.println(i.elemento);
            mostrar(i.prox);
        }
    }
    // mostrar os elementos iterativamente
    void mostrar(Celula i){
        System.out.print("[");
        for(Celula i = topo; i != null; i = i.prox){
            System.out.println(i.elemento + " ");
        }
        System.out.print("]");
    }

    public int countMaiorX(int x){
        int count = 0;
        Celula tmp = new Celula(x);
        for(Celula i = topo; i != null; i = i.prox){
            if(i.elemento > x.elemento){
                count ++;
            }
        }
    }

    public int countMaiorX(){
        return countMaiorXRec(topo, x);
    }

    public int countMaiorXRec(Celula i, int x){
        if(i == null){
            return 0; // caso base
        }
        if(i.elemento > x){
            return 1 + countMaiorXRec(i.prox, x);
        } else{
            return countMaiorXRec(i.prox, x);
        }
    }

    public int menorElemento()throws Exception{
        if(topo == null){
            throw new Exception("Erro");
        }
        int menor = topo.elemento;
        for(Celula i = topo.prox; i != null; i = i.prox){
            if(i.elemento < menor){
                menor = i.elemento;
            }
        }
        return menor;
    }

    


    
}
