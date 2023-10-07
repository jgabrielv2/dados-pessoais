package br.mil.eb.rcg.dados.dto.listagem;

import br.mil.eb.rcg.dados.entity.Militar;

public record DadosPessoaisListagem(String identidadeCivil, String cpf, String nome) {

    public DadosPessoaisListagem(Militar militar){
        this(
                militar.dadosPessoais().identidadeCivil(),
                militar.dadosPessoais().cpf(),
                militar.dadosPessoais().nome()
        );
    }
}
