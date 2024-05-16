import Classes.ClienteA;
import Classes.ClienteB;
import Classes.ClientePremium;

public class Main{
    public static void main(String[] args) {

        ClienteA clienteA = new ClienteA();
        System.out.println(clienteA.CalcularCompra());
        System.out.println(clienteA.CalcularImposto());
        clienteA.Inserir();
        clienteA.Atualizar();
        clienteA.Ler();
        clienteA.Deletar();
        clienteA.Selecionar();
        clienteA.Imprimir();
        System.out.println("---------------------------------");

        ClienteB clienteB = new ClienteB();
        System.out.println(clienteB.CalcularCompra());
        System.out.println(clienteB.CalcularImposto());
        clienteB.Inserir();
        clienteB.Atualizar();
        clienteB.Deletar();
        clienteB.Ler();
        clienteB.Selecionar();
        clienteB.Imprimir();
        System.out.println("---------------------------------");

        ClientePremium clientePremium = new ClientePremium();
        System.out.println(clientePremium.CalcularCompra());
        System.out.println(clientePremium.CalcularImposto());
        clientePremium.Atualizar();
        clientePremium.Deletar();
        clientePremium.Ler();
        clientePremium.Inserir();
        clientePremium.Atualizar();
        clientePremium.Imprimir();
        System.out.println("----------------------------------");
    }
}