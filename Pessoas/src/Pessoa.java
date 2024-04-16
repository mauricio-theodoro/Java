public class Pessoa {
    public Pessoa(String nome, String end, String tel) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    private String nome;
    private String end;
    private String tel;

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", end='" + end + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
