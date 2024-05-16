package Classes;

import DAO.CRUD;
import DAO.Calculavel;

import javax.swing.*;

public class ClienteB implements CRUD, Calculavel {
    @Override
    public void Inserir() {
        JOptionPane.showMessageDialog(null, "Inserindo clienteB");
    }

    @Override
    public void Ler() {
        JOptionPane.showMessageDialog(null, "Lendo clienteB");
    }

    @Override
    public void Atualizar() {
        JOptionPane.showMessageDialog(null, "Atualizar clienteB");
    }

    @Override
    public void Deletar() {
        JOptionPane.showMessageDialog(null, "Deletando clienteB");
    }

    @Override
    public void Selecionar() {
        JOptionPane.showMessageDialog(null, "Selecionando clienteB");
    }

    @Override
    public String Imprimir() {
        return "IMPRIMIDO COM SUCESSO";
    }

    @Override
    public double CalcularImposto() {
        double imp = 0.15;
        double impTotal = imp+CalcularCompra();
        return impTotal;
    }

    @Override
    public double CalcularCompra() {
        double prod1 = 56;
        double prod2 = 74;
        double soma = prod1+prod2;
        return soma;
    }
}
