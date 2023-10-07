package br.jgabrielv.dados.dto.formulario;

import jakarta.validation.Valid;

public record FormularioMilitar(
        FormularioContato formularioContato,
        @Valid FormularioDadosPessoais formularioDadosPessoais,
        FormularioDadosProfissionais formularioDadosProfissionais,
        FormularioEndereco formularioEndereco) {
}
