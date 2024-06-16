package Classes;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private int id;
    private Cliente cliente;
    private Vendedor vendedor;
    private List<ItemVendas> itens;
    private double total;
    private FormaPagamento formaPagamento;

    public Venda(int id, Cliente cliente, Vendedor vendedor, List<ItemVendas> itens, FormaPagamento formaPagamento){
        this.id = id;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.itens = new ArrayList<>(itens);
        this.formaPagamento = formaPagamento;
        this.total = calcularTotal();
    }
    private double calcularTotal() {
        double soma = 0;
        for (ItemVendas item : itens) {
            soma += item.getTotal();
        }
        return soma;
    }

    public void adicionarItem(Produto produto, int quantidade) {
        ItemVendas item = new ItemVendas(produto, quantidade);
        itens.add(item);
        total += item.getTotal();
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getTotal() {
        return total;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItemVendas> getItens() {
        return itens;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public FormaPagamento getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(FormaPagamento formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
}
