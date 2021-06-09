public class ListaLigada {
    private Dog primeiro;
    private Dog ultimo;
    private int tamanho;

    public ListaLigada(){
        this.tamanho = 0;
    }

    public Dog getPrimeiro() {
        return primeiro;
    }

    public void setPrimeiro(Dog primeiro) {
        this.primeiro = primeiro;
    }

    public Dog getUltimo() {
        return ultimo;
    }

    public void setUltimo(Dog ultimo) {
        this.ultimo = ultimo;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public void adicionar(String novoValor){
        Dog novoDog = new Dog(novoValor);
        if (this.primeiro == null && this.ultimo == null){
            this.primeiro = novoDog;
            this.ultimo = novoDog;
        }else{
            this.ultimo.setProximo(novoDog);
            this.ultimo = novoDog;
        }
        this.tamanho++;
    }
    public void remover(String valorProcurado){
        Dog anterior = null;
        Dog atual = this.primeiro;
        for(int i=0; i < this.getTamanho(); i++){
            if (atual.getNome().equalsIgnoreCase(valorProcurado)){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    public void removerPosicao(int posicaoProcurada){
        Dog anterior = null;
        Dog atual = this.primeiro;
        for(int i=0; i < this.getTamanho(); i++){
            if (atual.getNome().equalsIgnoreCase(String.valueOf(posicaoProcurada))){
                if (this.tamanho == 1){
                    this.primeiro = null;
                    this.ultimo = null;
                }else if (atual == primeiro){
                    this.primeiro = atual.getProximo();
                    atual.setProximo(null);
                }else if (atual == ultimo){
                    this.ultimo = anterior;
                    anterior.setProximo(null);
                }else{
                    anterior.setProximo(atual.getProximo());
                    atual = null;
                }
                this.tamanho--;
                break;
            }
            anterior = atual;
            atual = atual.getProximo();
        }
    }
    public Dog get(int posicao){
        Dog atual = this.primeiro;
        for(int i=0; i < posicao; i++){
            if (atual.getProximo() != null){
                atual = atual.getProximo();
            }
        }
        return atual;
    }

}
