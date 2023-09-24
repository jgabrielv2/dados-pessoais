package br.mil.eb.rcg.dados.entity;

import org.hibernate.validator.constraints.br.CPF;

public class Militar {

    private Integer precCp;

    private PostoGraduacao postoGraduacao;
    @CPF
    private Integer cpf;
    private String nome;

    private String nomeDeGuerra;
    private Endereco endereco;

    private DadosPessoais dadosPessoais;
}
