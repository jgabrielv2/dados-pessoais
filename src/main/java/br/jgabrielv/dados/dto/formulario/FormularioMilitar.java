package br.jgabrielv.dados.dto.formulario;

public record FormularioMilitar(
        FormularioContato formularioContato,
        FormularioDadosPessoais formularioDadosPessoais,
        FormularioDadosProfissionais formularioDadosProfissionais,
        FormularioEndereco formularioEndereco) {
}
