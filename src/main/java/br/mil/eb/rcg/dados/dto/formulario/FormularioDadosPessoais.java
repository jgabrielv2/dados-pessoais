package br.mil.eb.rcg.dados.dto.formulario;

import org.hibernate.validator.constraints.br.CPF;

public record FormularioDadosPessoais(String identidadeCivil, @CPF String cpf, String nome) {
}
