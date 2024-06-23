package Classes;

import java.time.LocalDate;

public class Vendedor extends Pessoa{
    private int id;
    private double salario;

    public Vendedor(int id, String nome, String cpf, String email, String telefone, String endereco, LocalDate dataNascimento, char sexo, double salario) {
        super(id,nome, cpf, email, telefone, endereco, dataNascimento, sexo);
        this.id = id;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}
