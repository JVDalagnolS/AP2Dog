public class Main {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("pipoca");
        lista.adicionar("lucky");
        lista.adicionar("puuts");
        lista.adicionar("pituca");

        System.out.println("tem: " + lista.getTamanho() + " cachorros");
        System.out.println("\nprimeiro dog: " + lista.getPrimeiro().getNome());
        System.out.println("\núltimo dog: " + lista.getUltimo().getNome());

        System.out.println("\n"+lista.get(0).getNome());
        System.out.println("\n"+lista.get(1).getNome());
        System.out.println("\n"+lista.get(2).getNome());
        System.out.println("\n"+lista.get(3).getNome());

        //lista.removerPosicao(1);
        //System.out.println("\nRemoveu o cachorro pipoca");

        lista.remover("pipoca");
        System.out.println("\nRemoveu o cachorro pipoca");

        System.out.println("Tamanho: " + lista.getTamanho());
        for(int i=0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getNome());
        }

    }
}