public class Produto {
    private String descricao;
    private double preco;
    private int codigo;
    private int quantidade;
    private String nome;

    public Produto(String descricao, double preco, int codigo, int quantidade, String nome) {
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
