package br.mil.eb.rcg.dados.dto.listagem;

import br.mil.eb.rcg.dados.entity.Militar;

public record DadosListagemContato(String telefoneCelular, String email) {

    public DadosListagemContato(Militar militar) {
        this(
                militar.dadosDeContato().telefoneCelular(),
                militar.dadosDeContato().email()
        );
    }
}
