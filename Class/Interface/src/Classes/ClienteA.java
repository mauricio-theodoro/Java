package Classes;

import DAO.CRUD;
import DAO.Calculavel;

import javax.swing.*;

public class ClienteA implements CRUD, Calculavel{

    @Override
    public void Inserir() {
        JOptionPane.showMessageDialog(null, "Inserindo clienteA");
    }

    @Override
    public void Ler() {
        JOptionPane.showMessageDialog(null, "Lendo clienteA");
    }

    @Override
    public void Atualizar() {
        JOptionPane.showMessageDialog(null, "Atualizando clienteA");

    }

    @Override
    public void Deletar() {
        JOptionPane.showMessageDialog(null, "Deletando clienteA");
    }

    @Override
    public void Selecionar() {
        JOptionPane.showMessageDialog(null, "Selecionando clienteA");
    }

    @Override
    public String Imprimir() {
        return "Impresso com Sucesso!";
    }

    @Override
    public double CalcularImposto() {
        double imp = 0.15;
        double impTotal = imp+CalcularCompra();
        return impTotal;
    }

    @Override
    public double CalcularCompra() {
        double prod1 = 10;
        double prod2 = 10;
        double soma = prod1+prod2;
        return soma;
    }
}
