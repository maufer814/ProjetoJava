import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
      Produto p1 = new Produto("Sanduiche quente", 20.99, 111, 1, "Misto Quente");
      Produto p2 = new Produto("Hamburger com Cheddar e queijo", 15.99, 112, 1, "Hamburgão");
      Produto p3 = new Produto("Sanduiche com Salada", 13.99, 113, 1, "Hamburger de Salada");
      Produto p4 = new Produto("Sanduiche de Siri", 18.99, 114, 1, "Hamburger de Siri");
      Produto p5 = new Produto("Sanduiche feito com pão mais longo, e com salsicha", 12.99, 115, 1, "Cachorro Quente");
      Produto p6 = new Produto("Lata de 350ml", 5.99, 116, 1, "Coca-Cola");
      Produto p7 = new Produto("Lata de 400ml", 6.99, 117, 1, "Pepsi");
      Produto p8 = new Produto("Garrafa de 500 ml", 9.00, 118, 1, "Suco de Laranja Natural" );
      Produto p9 = new Produto("Garrafa de 500 ml", 6.99, 119, 1, "Garrafa da água");

        ArrayList<Produto> Produtos = new ArrayList<>();
        for(Produto p: Produtos) Produtos.add(p1);
            Produtos.add(p2);
            Produtos.add(p2);
            Produtos.add(p3);
            Produtos.add(p4);
            Produtos.add(p5);
            Produtos.add(p6);
            Produtos.add(p7);
            Produtos.add(p8);
            Produtos.add(p9);


        System.out.println("====================");

        if(p1 instanceof Produto){

        Produto p = (Produto) p1;


        }




    }
}