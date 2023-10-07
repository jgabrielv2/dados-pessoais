package br.jgabrielv.dados.dto.formulario;

import java.time.LocalDate;

public record FormularioDadosProfissionais(String armaQuadroServico, String postoGraduacao,
                                           String nomeDeGuerra,
                                           String identidadeMilitar, String precCp,
                                           LocalDate dataDePraca, LocalDate dataDePromocao) {
}
