class No<T> {
    T dado;
    No<T> prox;
    No<T> ant;

    public No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

class ListaEncadeadaDupla {
    No<T> inicio;
    No<T> fim;
    int length;

    public ListaEncadeadaDupla() {
        this.inicio = null;
        this.fim = null;
        this.length = 0;
    }

    public void inverter() {}

    public void printar() {}
}

public class Exercise2 {

    public static void main(String[] args) {
        
    }
}

