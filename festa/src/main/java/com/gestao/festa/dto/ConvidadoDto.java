package com.gestao.festa.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Pattern;

public class ConvidadoDto {
    public Integer quantidadeAcompanhantes() {
        return 0;
    }

    public String nome() {
        return "";
    }

    public record ClienteRecordDto(@NotBlank String nome, @NotBlank Integer quantidadeAcompanhantes){

    }
}
