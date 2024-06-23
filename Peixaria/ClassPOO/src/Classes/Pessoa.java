package Classes;


import java.time.LocalDate; // para usar a classe LocalDate para manipular os datas

@Entity
public class Pessoa { // atributos e metodos abaixo:

    private int id;
    private String nome; // nome da pessoa
    private String cpf; // CPF da pessoa
    private String email; // email da pessoa
    private String telefone;// tell da pessoa
    private String endereco; // end da pessoa
    private LocalDate dataNascimento; // data de nascimento da pessoa que foi utilizado a biblioteca LocalDate
    private char sexo; // sexo da pessoa M para Masculino e F para Feminino


    // O construtor é um método especial que é chamado quando um novo objeto da classe é criado. Ele inicializa os atributos da classe.
    public Pessoa(int id, String nome, String cpf, String email, String telefone, String endereco, LocalDate dataNascimento, char sexo){
        this.nome = nome; // Inicializando o atributo nome. É necessario fazer em todos os outros.
        this.telefone = telefone;
        this.id = id;
        this.endereco = endereco;
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.sexo =  sexo;
        // Criando os Getter and Setters
        //Os métodos getters e setters são usados para acessar e modificar os atributos privados da classe.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome; // Retorna o valor do atributo nome
    }

    public void setNome(String nome) {
        this.nome = nome; // Define o valor do atributo nome
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    // Encapsulamento: Atributos privados e métodos públicos para acessar esses atributos.
    // Construtor: Método especial para inicializar objetos.
    // Getters e Setters: Métodos para acessar e modificar os atributos privados.
    // Agora posso criar subclasses que vão herdar de "Pessoa" ( como Cliente e Vendedor).


}
