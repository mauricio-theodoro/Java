package Classes;

import java.util.HashMap;
import java.util.Map;

public class Estoque {
    private Map<Produto, Integer> produtos;

    public Estoque() {
        this.produtos = new HashMap<>();
    }

    public void adicionarProduto(Produto produto, int quantidade) {
        produtos.put(produto, produtos.getOrDefault(produto, 0) + quantidade);
    }

    public boolean removerProduto(Produto produto, int quantidade) {
        if (produtos.containsKey(produto) && produtos.get(produto) >= quantidade) {
            produtos.put(produto, produtos.get(produto) - quantidade);
            return true;
        }
        return false;
    }

    public int verificarQuantidade(Produto produto) {
        return produtos.getOrDefault(produto, 0);
    }
}