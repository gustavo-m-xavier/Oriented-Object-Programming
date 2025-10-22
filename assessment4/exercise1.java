class No<T>{
    T dado;
    No<T> prox;

    public No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

class ListaEncadeadaSimples<T> {
    No<T> inicio;
    int length;

    public ListaEncadeadaSimples(){
        this.inicio = null;
        this.length = 0;
    }

    public inverter(){}
}