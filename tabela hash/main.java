// Hash com Area de Reserva

private class TabelaHashComReserva{
    private String[] tabela;// tamanho m + r
    private int m; // tamanho da area principal
    private int r; // tamanho da area de reserva
    private int nItensReserva;// quantos itens ja na reserva


    public TabelaHashComReserva(int m, int r){
        if(m <=0 || r < 0) throw new Exception illegalArgumentException("Tamanho invalido");
        this.m = m;
        this.r = r;
        this.tabela = new String [ m + r];
        this.nItensReserva = 0;
    }

    public int hash(String chave){
        if(chave == null) return -1;
        int soma = 0;
        for(int i = 0; i < chave.length(); i++){
            soma += chave.charAt(i);
        }
        return soma % m;
    }

    public boolean isPosicaoLivre(int pos){
        if(pos < 0 || pos >=m + r)throw new indexOutOfBoundsException("Posicao invalida");
        return tabela[pos] == null;
    }

    
}