import javax.swing.*;
import java.awt.*;

public class CarrinhoCompras extends JFrame {
    public CarrinhoCompras() {
        setTitle("Carrinho de Compras");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel(new BorderLayout());

        // Tabela de itens no carrinho
        String[] colunas = {"Produto", "Quantidade", "Preço"};
        Object[][] dados = {
                {"Produto 1", 1, 100.00},
                {"Produto 2", 2, 200.00}
        };
        JTable tabelaCarrinho = new JTable(dados, colunas);

        // Botão para finalizar compra
        JButton finalizarCompra = new JButton("Finalizar Compra");

        painel.add(new JScrollPane(tabelaCarrinho), BorderLayout.CENTER);
        painel.add(finalizarCompra, BorderLayout.SOUTH);

        add(painel);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CarrinhoCompras().setVisible(true);
        });
    }
}