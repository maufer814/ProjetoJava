public abstract class Pessoa {
    protected String nome;
    protected double idade;
    protected String cpf;
    protected int cep;
    protected String endereco;


    public Pessoa(String nome, double idade, String cpf, int cep, String endereco) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.cep = cep;
        this.endereco = endereco;
    }

    public abstract void exibir();
}
