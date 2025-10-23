class No<T>{
    T dado;
    No<T> prox;

    public No(T dado) {
        this.dado = dado;
        this.prox = null;
    }
}

class Pilha<T> {
    No<T> topo;
    int length;

    public Pilha(){
        this.topo = null;
        this.length = 0;
    }

    public T topo() {
        if (this.topo != null) {
            return this.topo.dado;
        }
        return null;
    }

    public void empilha(T dado) {
        No<T> novoNo = new No<>(dado);
        novoNo.prox = this.topo;
        this.topo = novoNo;
        this.length++;
    }

    public void desempilha() {
        if (this.topo != null) {
            this.topo = this.topo.prox;
            this.length--;
        }
    }
}

public class Exercise4 {

    public static void main(String[] args){
        Pilha<Integer> pilha = new Pilha<>();

        pilha.empilha(1);
        pilha.empilha(2);
        pilha.empilha(3);

        System.out.println("Topo da pilha: " + pilha.topo());

        pilha.desempilha();
        System.out.println("Topo da pilha após desempilhar: " + pilha.topo());
    }
}