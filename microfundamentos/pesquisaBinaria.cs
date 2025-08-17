// iterativa 

bool PesquisaBinaria(int [] vetor, int x)
{
    bool resp = false;
    int dir = n - 1, esq = 0, meio;//esquerda é o inicio do vetor, direita o final, e o meio é o teste
    while (esq <= dir)
    {
        meio = (esq + dir) / 2;
        if (x == vetor[meio])
        {
            resp = true;
            esq = n;
        }
        else if (x > vetor[meio])
        {
            esq = meio + 1;// exploro a metade de cima
        }
        else
        {
            dir = meio - 1;// exploro a metade de baixo
        }
    }
    return resp;
}
// melhor caso: elemento na metade inicial
// pior caso: esta da ultima posicao de procura(lg(n) ou nao ta no vetor