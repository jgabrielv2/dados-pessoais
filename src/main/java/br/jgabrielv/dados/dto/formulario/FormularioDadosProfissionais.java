package br.jgabrielv.dados.dto.formulario;

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
        StringBuilder identidadeMilitarBuilder = new StringBuilder(identidadeMilitar.strip())
                .insert(9, "-");
        this.identidadeMilitar = identidadeMilitarBuilder.toString();
        this.precCp = precCp.strip();
        this.dataDePraca = dataDePraca;
        this.dataDePromocao = dataDePromocao;

    }
}
