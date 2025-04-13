package com.example.libaryapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "autor") // Removido schema "public" para compatibilidade com H2
@Getter
@Setter
@ToString(exclude = "livros") // Evita recursão infinita no toString()
public class Autor {

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome", length = 100, nullable = false) // Padronizado para "nome"
    private String nome;

    @Column(name = "data_nascimento", nullable = false)
    private LocalDate dataNascimento; // Padronizado para camelCase

    @Column(name = "nacionalidade", length = 50, nullable = false)
    private String nacionalidade;

    @OneToMany(mappedBy = "autor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Livro> livros = new ArrayList<>(); // Inicialização e remoção do @Transient

    // Métodos auxiliares para gerenciamento bidirecional
    public void adicionarLivro(Livro livro) {
        this.livros.add(livro);
        livro.setAutor(this);
    }

    public void removerLivro(Livro livro) {
        this.livros.remove(livro);
        livro.setAutor(null);
    }

    // Construtores (opcional)
    public Autor() {
    }

    public Autor(String nome, LocalDate dataNascimento, String nacionalidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.nacionalidade = nacionalidade;
    }
}