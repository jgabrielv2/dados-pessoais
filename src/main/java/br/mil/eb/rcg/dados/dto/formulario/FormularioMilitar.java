package br.mil.eb.rcg.dados.dto.formulario;

public record FormularioMilitar(
        FormularioContato formularioContato,
        FormularioDadosPessoais formularioDadosPessoais,
        FormularioDadosProfissionais formularioDadosProfissionais,
        FormularioEndereco formularioEndereco) {
}
