public class Dog {
    private String valor;
    private Dog proximo;

    public Dog(String novoDog){
        this.valor = novoDog;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public Dog getProximo() {
        return proximo;
    }

    public void setProximo(Dog proximo) {
        this.proximo = proximo;
    }


}

