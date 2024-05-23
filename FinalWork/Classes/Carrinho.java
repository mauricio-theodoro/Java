package Classes;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<ItemVendas> itens;

    public Carrinho() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemVendas item = new ItemVendas(produto, quantidade);
        itens.add(item);
    }

    public List<ItemVendas> getItens() {
        return itens;
    }

    public double calcularTotal() {
        return itens.stream().mapToDouble(ItemVendas::getTotal).sum();
    }
    public void limparCarrinho() {
        itens.clear();
    }
}