package Classes;

public class SistemaVendas {
    private Estoque estoque;
    private Carrinho carrinho;
    private Venda vendaAtual;

    public SistemaVendas() {
        this.estoque = new Estoque();
        this.carrinho = new Carrinho();
    }

    public void adicionarProdutoAoCarrinho(Produto produto, int quantidade) {
        if (estoque.removerProduto(produto, quantidade)) {
            carrinho.adicionarItem(produto, quantidade);
            System.out.println("Produto adicionado ao carrinho: " + produto.getNome() + " (Quantidade: " + quantidade + ")");
        } else {
            System.out.println("Quantidade insuficiente em estoque.");
        }
    }

    public void finalizarVenda(Cliente cliente, Vendedor vendedor, FormaPagamento formaPagamento) {
        vendaAtual = new Venda(cliente, vendedor, carrinho.getItens(),formaPagamento);
        System.out.println("Venda finalizada. Total: " + vendaAtual.getTotal());
        carrinho.limparCarrinho(); // Limpa o carrinho após finalizar a venda
    }
}
