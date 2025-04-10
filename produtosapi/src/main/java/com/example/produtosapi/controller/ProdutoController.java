package com.example.produtosapi.controller;

import com.example.produtosapi.model.Produto;
import com.example.produtosapi.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    // POST /produtos - Cadastrar novo produto
    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto recebido: " + produto);

        // Se o ID ainda não veio no JSON, gera automaticamente
        if (produto.getId() == null || produto.getId().isEmpty()) {
            produto.setId(UUID.randomUUID().toString());
        }

        return produtoRepository.save(produto);
    }


    // GET /produtos/{id} - Buscar produto por ID
    @GetMapping("/{id}")
    public Produto obterPorId(@PathVariable("id") String id) {
        Optional<Produto> produto = produtoRepository.findById(id);
        return  produto.isPresent() ? produto.get() : null;
    }

    // Delete /produtos/{id} - Deletando os produto por ID
    @DeleteMapping("/{id}")
    public void deletar(@PathVariable("id") String id) {
        produtoRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void atualizar(@PathVariable("id") String id, @RequestBody Produto produto) {
        produto.setId(id);
        produtoRepository.save(produto);
    }

    // GET /produtos - Listar os produtos por nome.
    @GetMapping
    public List<Produto> listarTodos(@RequestParam("nome") String nome) {

        return produtoRepository.findByNome(nome);
    }
}
