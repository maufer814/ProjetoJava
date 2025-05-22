import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Cliente("Willian", 18, "294.469.498-74",13607266, "Rua das Palmeiras, 601");
        Pessoa p2 = new Funcionario("Maurício", 18, "59053266-4", 13607471, "Rua das Flores, 236", "Atendente");
        Pessoa p3 = new Funcionario("Carlos", 18, "432.023.948-27", 13602879, "Avenida Dona Renata, 541", "Atendente");
        Pessoa p4 = new Funcionario("Maria", 19, "187.254.396-15", 13600153, "Rua do Carpinteiro, 101", "Atendente");
        Pessoa p5 = new Cliente("Frederico", 42, "546.325.744-29",13607874, "Rua Adoniran Barbosa, 250");
        Pessoa p6 = new Funcionario("Fernanda", 35, "874.164.953-14", 13602654, "Rua Zumbi dos Palmares, 541", "Gerente");
        Pessoa p7 = new Funcionario("Paulo", 33, "624.248.329-54", 14578655, "Residencial Lírio do Campo -  Bloco J, apartamento 196","Cozinheiro");
        Pessoa p8 = new Cliente("Odair", 62,"951.357.846-50", 13602887, "Rua Tico Tico, 58");
        Pessoa p9 = new Cliente("Vanda", 53,"265.715.314-99", 13605488, "Rua João Grilo, 727");
        Pessoa p10 = new Cliente("Salmazo", 35,"123.321.222-11", 13605488, "Rua Mussum, 22");

        ArrayList <Pessoa> Pessoas = new ArrayList();
        Pessoas.add(p1);
        Pessoas.add(p2);
        Pessoas.add(p3);
        Pessoas.add(p4);
        Pessoas.add(p5);
        Pessoas.add(p6);
        Pessoas.add(p7);
        Pessoas.add(p8);
        Pessoas.add(p9);
        Pessoas.add(p10);


    }
}