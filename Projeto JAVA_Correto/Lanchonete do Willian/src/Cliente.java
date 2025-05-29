import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Cliente extends Pessoa implements IPessoa {

    public Cliente(String nome, int idade, String cpf, int cep, String endereco) {
        super(nome, idade, cpf, cep, endereco);
    }

    @Override
    public void exibir() {
        System.out.println("\n==== Cliente ====\n");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("CPF: " + cpf);
        System.out.println("CEP: " + cep);
        System.out.println("Endereço: " + endereco);
    }
}
