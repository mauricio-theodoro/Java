package Classes;

import DAO.CRUD;
import DAO.Calculavel;

import javax.swing.*;

public class ClientePremium implements CRUD, Calculavel {
    @Override
    public void Inserir() {
        JOptionPane.showMessageDialog(null, "Inserindo clientePremium");
    }

    @Override
    public void Ler() {
        JOptionPane.showMessageDialog(null, "Lendo clientePremium");
    }

    @Override
    public void Atualizar() {
        JOptionPane.showMessageDialog(null, "Atualizando clientePremium");
    }

    @Override
    public void Deletar() {
        JOptionPane.showMessageDialog(null, "Deletando clientePremium");
    }

    @Override
    public void Selecionar() {
        JOptionPane.showMessageDialog(null, "Selecionando clientePremium");
    }

    @Override
    public String Imprimir() {
        return "IMPRIMIDO COM SUCESSO";
    }

    @Override
    public double CalcularImposto() {
        double imp = 0.05;
        double impTotal = imp+CalcularCompra();
        return impTotal;
    }

    @Override
    public double CalcularCompra() {
        double prod1 = 77.74;
        double prod2 = 90.22;
        double soma = prod1+prod2;
        return soma;
    }
}
