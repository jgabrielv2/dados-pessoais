package br.jgabrielv.dados.dto.listagem;

import br.jgabrielv.dados.entity.Militar;

public record DadosPessoaisListagem(String identidadeCivil, String cpf, String nome) {

    public DadosPessoaisListagem(Militar militar){
        this(
                militar.dadosPessoais().identidadeCivil(),
                militar.dadosPessoais().cpf(),
                militar.dadosPessoais().nome()
        );
    }
}
