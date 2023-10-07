package br.jgabrielv.dados.dto.listagem;

import br.jgabrielv.dados.entity.Militar;

public record DadosListagemContato(String telefoneCelular, String email) {

    public DadosListagemContato(Militar militar) {
        this(
                militar.dadosDeContato().telefoneCelular(),
                militar.dadosDeContato().email()
        );
    }
}
