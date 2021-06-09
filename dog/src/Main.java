public class Main {

    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();
        lista.adicionar("pipoca " + "da raça cane corso " + "8 anos");
        lista.adicionar("lucky " + "da raça Pastor alemão " + "5 anos");
        lista.adicionar("puuts " + "da raça Dachshund " + "4 anos");
        lista.adicionar("pituca " + "Spitz " + "2 anos ");

        System.out.println("tem: " + lista.getTamanho() + " cachorros");
        System.out.println("\nprimeiro dog: " + lista.getPrimeiro().getValor());
        System.out.println("\núltimo dog: " + lista.getUltimo().getValor());

        System.out.println("\n"+lista.get(0).getValor());
        System.out.println("\n"+lista.get(1).getValor());
        System.out.println("\n"+lista.get(2).getValor());
        System.out.println("\n"+lista.get(3).getValor());

        lista.removerPosicao(1);
        System.out.println("\nRemoveu o cachorro pipoca");

        //lista.remover("pipoca");
        //System.out.println("\nRemoveu o cachorro pipoca");

        System.out.println("Tamanho: " + lista.getTamanho());
        for(int i=0; i < lista.getTamanho(); i++) {
            System.out.println(lista.get(i).getValor());
        }

    }
}