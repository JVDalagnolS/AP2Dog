public class Dog {
    private String nome;
    private String raca;
    private String idade;
    private Dog proximo;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public Dog(String novoDog){
        this.nome = novoDog;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Dog getProximo() {
        return proximo;
    }

    public void setProximo(Dog proximo) {
        this.proximo = proximo;
    }


}

