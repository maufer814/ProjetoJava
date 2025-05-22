import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Cliente extends Pessoa implements IPessoa {

    public Cliente(String nome, double idade, String cpf, int cep, String endereco) {
        super(nome, idade, cpf, cep, endereco);
    }

    @Override
    public void exibir() {
        System.out.println("\n===========================\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("CEP: " + cep);
        System.out.println("Endereço: " + endereco);
    }
}
