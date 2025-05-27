import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    private static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public Produto(int id, String nome, String descricao, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getId() {
        return id;
    }

    public static void inicializarProdutos() {
        listaProdutos.add(new Produto(1, "X-Burguer", "Pão, hambúrguer, queijo e molho", 12.50, 30));
        listaProdutos.add(new Produto(2, "X-Salada", "Pão, hambúrguer, queijo, alface e tomate", 13.90, 25));
        listaProdutos.add(new Produto(3, "X-Bacon", "Pão, hambúrguer, queijo e bacon", 14.90, 20));
        listaProdutos.add(new Produto(4, "Batata Frita P", "Porção pequena de batata frita", 6.00, 40));
        listaProdutos.add(new Produto(5, "Batata Frita G", "Porção grande de batata frita", 10.00, 30));
        listaProdutos.add(new Produto(6, "Refrigerante de Lata", "Lata 350ml (muitos sabores)", 5.00, 50));
        listaProdutos.add(new Produto(7, "Suco Natural", "Copo de suco natural 300ml", 7.00, 20));
        listaProdutos.add(new Produto(8, "Água Mineral", "Garrafa 500ml sem gás", 3.00, 60));
        listaProdutos.add(new Produto(9, "Milkshake", "Milkshake de chocolate ou morango", 9.90, 15));
        listaProdutos.add(new Produto(10, "Cachorro-Quente", "Pão com salsicha, molho e batata palha", 11.00, 18));
    }

    public static void adicionarProduto(Scanner scanner) {
        System.out.print("ID do Produto: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nome do Produto: ");
        String nome = scanner.nextLine();

        System.out.print("Descrição do Produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Preço do Produto: ");
        double preco = scanner.nextDouble();

        System.out.print("Quantidade: ");
        int quantidade = scanner.nextInt();

        Produto novoProduto = new Produto(id, nome, descricao, preco, quantidade);
        listaProdutos.add(novoProduto);
        System.out.println("Produto adicionado com sucesso");
    }

    public static void removerProduto(Scanner scanner) {
        System.out.print("Informe o ID do produto a ser removido: ");
        int id = scanner.nextInt();
        boolean removido = false;

        for (Produto p : listaProdutos) {
            if (p.getId() == id) {
                listaProdutos.remove(p);
                System.out.println("Produto removido com sucesso");
                removido = true;
                break;
            }
        }

        if (!removido) {
            System.out.println("Produto com ID " + id + " nao encontrado.");
        }
    }

    public static void listarProdutos() {
        if (listaProdutos.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("\n== Lista de Produtos ==");
            for (Produto p : listaProdutos) {
                System.out.println(p);
            }
        }
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}