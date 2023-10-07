package br.mil.eb.rcg.dados.dto.listagem;

import br.mil.eb.rcg.dados.entity.Militar;

public record DadosListagemMilitar(Boolean ativo, Long id,
                                   DadosProfissionaisListagem dadosProfissionaisListagem,
                                   DadosPessoaisListagem dadosPessoaisListagem,
                                   DadosListagemEndereco dadosListagemEndereco,
                                   DadosListagemContato dadosListagemContato) {

    public DadosListagemMilitar(Militar militar) {
        this(
                militar.ativo(), militar.id(),
                new DadosProfissionaisListagem(militar),
                new DadosPessoaisListagem(militar),
                new DadosListagemEndereco(militar),
                new DadosListagemContato(militar)
        );

    }
}
