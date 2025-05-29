public class Funcionario extends Pessoa implements IPessoa {

    private String cargo;

    public Funcionario(String nome, double idade, String cpf, int cep, String endereco, String cargo) {
        super(nome, idade, cpf, cep, endereco);
        this.cargo = cargo;
    }

    @Override
    public void exibir() {
        System.out.println("\n===========================\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("CEP: " + cep);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cargo: " + cargo);
    }
}
