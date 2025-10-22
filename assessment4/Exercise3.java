class No<T> {
    T dado;
    No<T> prox;

    public No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

class ListaEncadeadaOrdenada<T extends Comparable<T>> {
    private No<T> inicio;
    private int length;

    public ListaEncadeadaOrdenada() {
        this.inicio = null;
        this.length = 0;
    }

    public void inserir(T dado) {
        No<T> novo = new No<>(dado);

        if (inicio == null || dado.compareTo(inicio.dado) < 0) {
            novo.prox = inicio;
            inicio = novo;
        } else {
            No<T> atual = inicio;
            while (atual.prox != null && dado.compareTo(atual.prox.dado) > 0) {
                atual = atual.prox;
            }
            novo.prox = atual.prox;
            atual.prox = novo;
        }

        length++;
    }

    public void apresentarLista() {
        No<T> no = this.inicio;
        while (no != null) {
            System.out.print("[" + no.dado + "] -> ");
            no = no.prox;
        }
        System.out.println("null");
    }

    public int tamanho() {
        return length;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        ListaEncadeadaOrdenada<Integer> lista = new ListaEncadeadaOrdenada<>();
        lista.inserir(5);
        lista.inserir(2);
        lista.inserir(8);
        lista.inserir(1);
        lista.inserir(4);

        lista.apresentarLista();
    }
}
