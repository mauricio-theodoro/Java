package Pessoas;

public class Pessoa {
    private String nome;
    private String end;
    private String tel;

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.end = endereco;
        this.tel = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return end;
    }

    public String getTelefone() {
        return tel;
    }
}