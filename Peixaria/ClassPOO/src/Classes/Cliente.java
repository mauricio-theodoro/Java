package Classes; // pacote que se encontra as classes


import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/* Realizar Compra: Um método que simula a compra de produtos.
Adicionar ao Carrinho: Um método para adicionar itens ao carrinho de compras.
Remover do Carrinho: Um método para remover itens do carrinho de compras.
Visualizar Carrinho: Um método para visualizar os itens no carrinho de compras.
Finalizar Compra: Um método para finalizar a compra e processar o pagamento.
Histórico de Compras: Um método para visualizar o histórico de compras do cliente.
Atualizar Informações: Um método para atualizar as informações do cliente.*/

public class Cliente extends Pessoa implements Serializable { // Atributos e métodos específicos dos Clientes serão definidos aqui
    private static final long serialVersionUID = 1L;
    // É necessario chamar o construtor da classe pessoa possuindo os atributos do mesmo e apos isso chamar o "super"
    private List<Venda> historicoCompras; // Historico de compras do cliente em Lista
    private List<ItemVendas> carrinho; // A lista de carrinho de compras do cliente.

    public Cliente(int id, String nome, String cpf, String endereco, String telefone, String email, LocalDate dataNascimento, char sexo){
        super(id, nome, cpf, endereco, telefone, email, dataNascimento, sexo);// Chamando o construtor da classe Pessoa.
        this.historicoCompras = new ArrayList<>(); // Inicializando o histórico de compras como uma lista vazia
        this.carrinho = new ArrayList<>(); // Inicializando o carrinho de compras como uma lista vazia
    }
    // metodo para adicionar um item no carrinho
    public void adicionarAoCarrinho(ItemVendas item){
        carrinho.add(item);
        System.out.println("Peixe adicionado no carrinho: " + item.getProduto().getNome());
    }
    // metodo para remover um item do carrinho
    public void removerDoCarrinho(ItemVendas item){
        carrinho.remove(item);
        System.out.println("Peixe removido do carrinho: " + item.getProduto().getNome());
    }
    // metodo para vizualizar o carrinho
    public void visualizarCarrinho(){
        System.out.println("Itens no carrinho:");
        for (ItemVendas item : carrinho){ // laço para pecorrer a lista
            System.out.println("- " + item.getProduto().getNome() + " (Quantidade: "+ item.getQuantidade() + ")");
        }
    }
    // metodo para finalizar a compra.
    public void finalizarCompras(int idVenda, Vendedor vendedor, FormaPagamento formaPagamento) {
        Venda venda = new Venda(idVenda, this, vendedor, new ArrayList<>(carrinho), formaPagamento); // Criando uma nova venda com os itens do carrinho
        historicoCompras.add(venda); // Adicionando a venda ao histórico de compras
        carrinho.clear(); // Limpando o carrinho de compras
        System.out.println("Compra finalizada.");
    }
    // metodo para visualizar o historico de compras
    public void visualizarHistoricoCompras(){
        System.out.println("Historico de compras:");
        for (Venda venda : historicoCompras) {
            System.out.println("- Venda realizada por "+ venda.getVendedor().getNome() + " em " + venda.getItens().size() + " itens.");
        }
    }
    // metodo para atualizar informações do cliente
    public void atualizarInformacoes(String endereco, String telefone, String email){
        setEndereco(endereco);
        setEmail(email);
        setTelefone(telefone);
        System.out.println("Informações atualizadas.");
    }
}

