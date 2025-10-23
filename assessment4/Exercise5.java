class No<T>{
    T dado;
    No<T> prox;

    public No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

class Fila<T> {
    No<T> inicio;
    No<T> fim;
    int length;

    public Fila(){
        this.inicio = null;
        this.fim = null;
        this.length = 0;
    }

    public void enfileirar(T dado) {
        No<T> novoNo = new No<>(dado);
        if (this.fim != null) {
            this.fim.prox = novoNo;
        }
        this.fim = novoNo;
        if (this.inicio == null) {
            this.inicio = novoNo;
        }
        this.length++;
    }

    public void desenfileirar() {
        if (this.inicio != null) {
            this.inicio = this.inicio.prox;
            if (this.inicio == null) {
                this.fim = null;
            }
            this.length--;
        }
    }

    public int tamanho() {
        return this.length;
    }
}

public class Exercise5 {

    public static void main(String[] args){
        Fila<Integer> fila = new Fila<>();

        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);

        System.out.println("Tamanho da fila: " + fila.tamanho());

        fila.desenfileirar();
        System.out.println("Tamanho da fila após desenfileirar: " + fila.tamanho());
    }
}