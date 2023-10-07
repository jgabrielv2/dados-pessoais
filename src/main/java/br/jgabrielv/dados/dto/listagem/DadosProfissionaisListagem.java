package br.jgabrielv.dados.dto.listagem;

import br.jgabrielv.dados.entity.Militar;

import java.time.LocalDate;

public record DadosProfissionaisListagem(String armaQuadroServico, String postoGraduacao,
                                         String nomeDeGuerra,
                                         String identidadeMilitar, String precCp,
                                         LocalDate dataDePraca, LocalDate dataDePromocao) {

    public DadosProfissionaisListagem(Militar militar) {
        this(
                militar.dadosProfissionais().armaQuadroServico(),
                militar.dadosProfissionais().postoGraduacao().toString(),
                militar.dadosProfissionais().nomeDeGuerra(),
                militar.dadosProfissionais().identidadeMilitar(),
                militar.dadosProfissionais().precCp(),
                militar.dadosProfissionais().dataDePraca(),
                militar.dadosProfissionais().dataDePromocao()
        );
    }
}
