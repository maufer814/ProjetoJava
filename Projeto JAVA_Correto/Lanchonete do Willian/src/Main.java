import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Produto.inicializarProdutos();

        pessoas.add(new Cliente("Willian", 18, "294.469.498-74", 13607266, "Rua das Palmeiras, 601"));
        pessoas.add(new Funcionario("Maurício", 18, "59053266-4", 13607471, "Rua das Flores, 236", "Atendente"));
        pessoas.add(new Funcionario("Carlos", 18, "432.023.948-27", 13602879, "Av. Dona Renata, 541", "Atendente"));
        pessoas.add(new Funcionario("Maria", 19, "187.254.396-15", 13600153, "Rua do Carpinteiro, 101", "Atendente"));
        pessoas.add(new Cliente("Frederico", 42, "546.325.744-29", 13607874, "Rua Adoniran Barbosa, 250"));
        pessoas.add(new Funcionario("Fernanda", 35, "874.164.953-14", 13602654, "Rua Zumbi dos Palmares, 541", "Gerente"));
        pessoas.add(new Funcionario("Paulo", 33, "624.248.329-54", 14578655, "Res. Lírio do Campo - Bloco J, apto 196", "Cozinheiro"));
        pessoas.add(new Cliente("Odair", 62, "951.357.846-50", 13602887, "Rua Tico Tico, 58"));
        pessoas.add(new Cliente("Vanda", 53, "265.715.314-99", 13605488, "Rua João Grilo, 727"));
        pessoas.add(new Cliente("Salmazo", 35, "123.321.222-11", 13605488, "Rua Mussum, 22"));

        int opcao;

        do {
            System.out.println("\n========= MENU PRINCIPAL =========");
            System.out.println("1 - Gerenciar Pessoas (Clientes e Funcionários)");
            System.out.println("2 - Gerenciar Produtos");
            System.out.println("0 - Sair do Sistema");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    menuPessoas(scanner, pessoas);
                    break;
                case 2:
                    menuProdutos(scanner);
                    break;
                case 0:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    public static void menuPessoas(Scanner scanner, ArrayList<Pessoa> pessoas) {
        int opcao;
        do {
            System.out.println("\n----- MENU DE PESSOAS -----");
            System.out.println("1 - Adicionar Cliente");
            System.out.println("2 - Adicionar Funcionário");
            System.out.println("3 - Remover Pessoa por CPF");
            System.out.println("4 - Listar Todas as Pessoas");
            System.out.println("5 - Ver Estatísticas dos Clientes");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarCliente(scanner, pessoas);
                    break;
                case 2:
                    adicionarFuncionario(scanner, pessoas);
                    break;
                case 3:
                    removerPorCpf(scanner, pessoas);
                    break;
                case 4:
                    listarTodos(pessoas);
                    break;
                case 5:
                    estatisticasClientes(pessoas);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }

    public static void menuProdutos(Scanner scanner) {
        int opcao;
        do {
            System.out.println("\n----- MENU DE PRODUTOS -----");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Remover Produto");
            System.out.println("3 - Listar Todos os Produtos");
            System.out.println("4 - Estatísticas dos Produtos");
            System.out.println("0 - Voltar ao Menu Principal");
            System.out.print("Digite a opção desejada: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    Produto.adicionarProduto(scanner);
                    break;
                case 2:
                    Produto.removerProduto(scanner);
                    break;
                case 3:
                    Produto.listarProdutos();
                    break;
                case 4:
                    estatisticasProdutos();
                case 0:
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    public static void adicionarCliente(Scanner scanner, ArrayList<Pessoa> pessoas) {
        System.out.println("-- Cadastro de Cliente --");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("CEP: ");
        int cep = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();

        pessoas.add(new Cliente(nome, idade, cpf, cep, endereco));
        System.out.println("Cliente adicionado com sucesso.");
    }

    public static void adicionarFuncionario(Scanner scanner, ArrayList<Pessoa> pessoas) {
        System.out.println("-- Cadastro de Funcionário --");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("CEP: ");
        int cep = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Endereço: ");
        String endereco = scanner.nextLine();
        System.out.print("Cargo: ");
        String cargo = scanner.nextLine();

        pessoas.add(new Funcionario(nome, idade, cpf, cep, endereco, cargo));
        System.out.println("Funcionário adicionado com sucesso.");
    }

    public static void removerPorCpf(Scanner scanner, ArrayList<Pessoa> pessoas) {
        System.out.print("Digite o CPF da pessoa a remover: ");
        String cpf = scanner.nextLine();
        boolean removido = false;

        for (int i = 0; i < pessoas.size(); i++) {
            if (pessoas.get(i).cpf.equals(cpf)) {
                pessoas.remove(i);
                removido = true;
                System.out.println("Pessoa removida com sucesso.");
                break;
            }
        }

        if (!removido) {
            System.out.println("Pessoa com CPF " + cpf + " não encontrada.");
        }
    }

    public static void listarTodos(ArrayList<Pessoa> pessoas) {
        if (pessoas.isEmpty()) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (Pessoa p : pessoas) {
                p.exibir();
            }
        }
    }

    // Estatísticas dos Clientes//
    public static void estatisticasClientes(ArrayList<Pessoa> pessoas) {
        ArrayList<Cliente> clientes = new ArrayList<>();

        for (Pessoa p : pessoas) {
            if (p instanceof Cliente) {
                clientes.add((Cliente) p);
            }
        }

        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.");
            return;
        }

        Cliente maisVelho = clientes.get(0);
        Cliente maisJovem = clientes.get(0);
        int maiores60 = 0;
        int menores18 = 0;
        int somaIdades = 0;

        for (Cliente c : clientes) {
            double idade = c.idade;

            if (idade > maisVelho.idade) maisVelho = c;
            if (idade < maisJovem.idade) maisJovem = c;

            if (idade > 60) maiores60++;
            if (idade < 18) menores18++;

            somaIdades += idade;
        }

        double media = (double) somaIdades / clientes.size();

        System.out.println("\n--- Estatísticas dos Clientes ---");
        System.out.println("Cliente mais velho: " + maisVelho.nome + " (" + maisVelho.idade + " anos)");
        System.out.println("Cliente mais jovem: " + maisJovem.nome + " (" + maisJovem.idade + " anos)");
        System.out.println("Quantidade de clientes maiores de 60 anos: " + maiores60);
        System.out.println("Quantidade de clientes menores de 18 anos: " + menores18);
        System.out.printf("Idade média dos clientes: %.2f anos\n", media);
    }


    //Estatísticas dos Produtos
    public static void estatisticasProdutos() {
        ArrayList<Produto> produtos = Produto.getListaProdutos();

        if (produtos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
            return;
        }

        Produto maisCaro = produtos.get(0);
        Produto maisBarato = produtos.get(0);
        double soma = 0;

        for (Produto p : produtos) {
            if (p.preco > maisCaro.preco) maisCaro = p;
            if (p.preco < maisBarato.preco) maisBarato = p;
            soma += p.preco;
        }

        double media = soma / produtos.size();
        int acimaDaMedia = 0;

        for (Produto p : produtos) {
            if (p.preco > media) acimaDaMedia++;
        }

        System.out.println("\n--- Estatísticas de Produtos ---");
        System.out.printf("Produto mais caro: %s (R$ %.2f)\n", maisCaro.nome, maisCaro.preco);
        System.out.printf("Produto mais barato: %s (R$ %.2f)\n", maisBarato.nome, maisBarato.preco);
        System.out.printf("Preço médio: R$ %.2f\n", media);
        System.out.println("Quantidade de produtos com preço acima da média: " + acimaDaMedia);
    }

}
