package br.jgabrielv.dados.dto.formulario;

import br.jgabrielv.dados.dto.formulario.utils.IdentidadeMilitarUtils;

import java.time.LocalDate;

public record FormularioDadosProfissionais(String armaQuadroServico, String postoGraduacao,
                                           String nomeDeGuerra,
                                           String identidadeMilitar, String precCp,
                                           LocalDate dataDePraca, LocalDate dataDePromocao) {

    public FormularioDadosProfissionais(String armaQuadroServico, String postoGraduacao,
                                        String nomeDeGuerra,
                                        String identidadeMilitar, String precCp,
                                        LocalDate dataDePraca, LocalDate dataDePromocao) {

        this.armaQuadroServico = armaQuadroServico.toUpperCase().strip();
        this.postoGraduacao = postoGraduacao.strip();
        this.nomeDeGuerra = nomeDeGuerra.toUpperCase().strip();
        this.identidadeMilitar = IdentidadeMilitarUtils.format(identidadeMilitar);
        this.precCp = precCp.strip();
        this.dataDePraca = dataDePraca;
        this.dataDePromocao = dataDePromocao;

    }
}
