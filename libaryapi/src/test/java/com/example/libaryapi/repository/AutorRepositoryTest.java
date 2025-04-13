package com.example.libaryapi.repository;

import com.example.libaryapi.model.Autor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootTest
public class AutorRepositoryTest {

    @Autowired
    AutorRepository repository;

    @Test
    public void salvarTest() {
        Autor autor = new Autor();
        autor.setNome("José");
        autor.setNacionalidade("Brasileira");
        autor.setDataNascimento(LocalDate.of(1940, 1, 31));

        var autorSalvo = repository.save(autor);
        System.out.println("Autor salvo: "+ autorSalvo);
    }

    @Test
    public void atualizarTest(){
        var id = UUID.fromString("1");

        Optional<Autor> possivelAutor = repository.findById(id);

        if(possivelAutor.isPresent()){

            Autor autorEncontrado = possivelAutor.get();
            System.out.println("Dados do Autor: ");
            System.out.println(autorEncontrado);

            autorEncontrado.setDataNascimento(LocalDate.of(1990,1,12));

            repository.save(autorEncontrado);
        }
    }

    @Test
    public void listaTest(){
        List<Autor> lista = repository.findAll();
        lista.forEach(System.out::println);
    }

    @Test
    public void countTest(){
        var id = UUID.fromString("1");
    }

    @Test
    public void deletePorIdTest(){
        var id = UUID.fromString("1");
        repository.deleteById(id);
    }

    @Test
    public void deleteTest(){
        var id = UUID.fromString("1");
        var maria = repository.findById(id).get();
        repository.delete(maria);
    }



}
