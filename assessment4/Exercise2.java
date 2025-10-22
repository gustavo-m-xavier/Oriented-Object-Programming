class No<T> {
    T dado;
    No<T> prox;
    No<T> ant;

    public No(T dado) {
        this.dado = dado;
        this.prox = null;
        this.ant = null;
    }
}

class ListaEncadeadaDupla<T> {
    No<T> inicio;
    No<T> fim;
    int length;

    public ListaEncadeadaDupla() {
        this.inicio = null;
        this.fim = null;
        this.length = 0;
    }

    public void inverter() {
        No<T> atual = inicio;
        No<T> temp = null;

        while (atual != null) {
            temp = atual.ant;
            atual.ant = atual.prox;
            atual.prox = temp;
            atual = atual.ant;
        }

        if (temp != null) {
            inicio = temp.ant;
        }
    }

    public void printar() {
        System.out.print("null <-> ");

        No<T> atual = inicio;
        while (atual != null) {
            System.out.print("[" + atual.dado + "] <-> ");
            atual = atual.prox;
        }

        System.out.println("null");
    }

}

public class Exercise2 {
    public static void main(String[] args) {
        No<Integer> n1 = new No<>(10);
        No<Integer> n2 = new No<>(20);
        No<Integer> n3 = new No<>(30);
        No<Integer> n4 = new No<>(40);

        n1.prox = n2;
        n2.ant = n1;
        n2.prox = n3;
        n3.ant = n2;
        n3.prox = n4;
        n4.ant = n3;

        ListaEncadeadaDupla<Integer> lista = new ListaEncadeadaDupla<>();
        lista.inicio = n1;
        lista.fim = n4;
        lista.length = 4;

        System.out.println("Lista original:");
        lista.printar();

        lista.inverter();

        System.out.println("Lista invertida:");
        lista.printar();
    }
}
