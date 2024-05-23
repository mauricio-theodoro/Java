package Classes;

public class Endereco {
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;
    private String estado;
    private int cep;

    public Endereco (String rua, String bairro, int numero, String cidade, String estado, int cep){
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    public void setCep(int cep) {
        this.cep = cep;
    }
    public int getCep(int cep){
        return cep;
    }
}
