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

    public void inverter() {
        No<T> prev = null;
        No<T> curr = inicio;
        No<T> next = null;

        while (curr != null) {
            next = curr.prox;  
            curr.prox = prev;   
            prev = curr;       
            curr = next;        
        }
        inicio = prev;
    }

    public void apresentarLista(){
        No<T> no = this.inicio;
        while(no != null){
            System.out.print("[" + no.dado + "] -> ");
            no = no.prox;
        }
        System.out.println("null");
    }


}

public class Exercise1 {

    public static void main(String[] args){
        ListaEncadeadaSimples<Integer> lista = new ListaEncadeadaSimples<>();

        lista.inicio = new No<>(1);
        lista.inicio.prox = new No<>(2);
        lista.inicio.prox.prox = new No<>(3);

        System.out.println("Lista original:");
        lista.apresentarLista();

        lista.inverter();

        System.out.println("Lista invertida:");
        lista.apresentarLista();
    }
}
