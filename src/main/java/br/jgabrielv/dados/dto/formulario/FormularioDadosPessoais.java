package br.jgabrielv.dados.dto.formulario;

import org.hibernate.validator.constraints.br.CPF;

public record FormularioDadosPessoais(String identidadeCivil, @CPF String cpf, String nome) {
    public FormularioDadosPessoais(String identidadeCivil, @CPF String cpf, String nome) {
        this.identidadeCivil = identidadeCivil.strip();
        this.cpf = cpf.strip();
        this.nome = nome.toUpperCase().strip();
    }

}
