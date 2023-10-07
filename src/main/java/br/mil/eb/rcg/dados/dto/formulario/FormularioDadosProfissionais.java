package br.mil.eb.rcg.dados.dto.formulario;

import br.mil.eb.rcg.dados.entity.PostoGraduacao;

import java.time.LocalDate;

public record FormularioDadosProfissionais(String armaQuadroServico, String postoGraduacao,
                                           String nomeDeGuerra,
                                           String identidadeMilitar, String precCp,
                                           LocalDate dataDePraca, LocalDate dataDePromocao) {
}
