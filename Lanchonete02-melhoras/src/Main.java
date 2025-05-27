import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Produto.inicializarProdutos();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== Menu de Cadastro de Produtos da Lanchonete ===");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Remover Produto");
            System.out.println("3. Listar Produtos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
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
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}
