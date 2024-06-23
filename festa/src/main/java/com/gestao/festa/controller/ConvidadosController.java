package com.gestao.festa.controller;

import com.gestao.festa.dto.ConvidadoDto;
import com.gestao.festa.model.Convidado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.gestao.festa.repository.Convidados;
import java.util.List;
import java.util.Optional;

@Controller
public class ConvidadosController {

    @Autowired
    private Convidados convidados;

    @GetMapping("/convidados")
    public ModelAndView lista() {
        ModelAndView modelAndView = new ModelAndView("ListaConvidados");
        modelAndView.addObject("convidados", convidados.findAll()); // addObject é para add objetos na view.
        modelAndView.addObject(new Convidado());

        return modelAndView;
    }

    @PostMapping("/convidados")
    public String salvar(Convidado convidado) {
        this.convidados.save(convidado);
        return "redirect:/convidados";
    }
    @DeleteMapping("/convidados/{id}")
    public ResponseEntity<String> deletar(@PathVariable Long id) {
        Optional<Convidado> convidadoOptional = convidados.findById(id);
        if (convidadoOptional.isPresent()) {
            convidados.deleteById(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
