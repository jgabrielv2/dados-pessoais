package br.jgabrielv.dados.dto.formulario;

import org.hibernate.validator.constraints.br.CPF;

public record FormularioDadosPessoais(String identidadeCivil, @CPF String cpf, String nome) {
    public FormularioDadosPessoais(String identidadeCivil, @CPF String cpf, String nome) {
        this.identidadeCivil = identidadeCivil.strip();
        StringBuilder cpfBuilder = new StringBuilder(cpf.strip())
                .insert(3, ".")
                .insert(7, ".")
                .insert(11, "-");
        this.cpf = cpfBuilder.toString();
        this.nome = nome.toUpperCase().strip();
    }

}
