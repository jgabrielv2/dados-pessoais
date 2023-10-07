package br.jgabrielv.dados.entity;

import br.jgabrielv.dados.dto.formulario.FormularioDadosProfissionais;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

@Embeddable
public class DadosProfissionais {

    private String armaQuadroServico;

    @Enumerated(EnumType.STRING)
    private PostoGraduacao postoGraduacao;
    private String nomeDeGuerra;

    private String identidadeMilitar;
    private String precCp;
    private LocalDate dataDePraca;
    private LocalDate dataDePromocao;

    public DadosProfissionais() {
    }

    public DadosProfissionais(FormularioDadosProfissionais dados) {
        setArmaQuadroServico(dados.armaQuadroServico())
                .setPostoGraduacao(PostoGraduacao.parse(dados.postoGraduacao()))
                .setNomeDeGuerra(dados.nomeDeGuerra())
                .setIdentidadeMilitar(dados.identidadeMilitar())
                .setPrecCp(dados.precCp())
                .setDataDePraca(dados.dataDePraca())
                .setDataDePromocao(dados.dataDePromocao());
    }

    public String armaQuadroServico() {
        return armaQuadroServico;
    }

    public PostoGraduacao postoGraduacao() {
        return postoGraduacao;
    }

    public DadosProfissionais setPostoGraduacao(PostoGraduacao postoGraduacao) {
        this.postoGraduacao = postoGraduacao;
        return this;
    }

    public String nomeDeGuerra() {
        return nomeDeGuerra;
    }

    public DadosProfissionais setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra;
        return this;
    }

    public DadosProfissionais setArmaQuadroServico(String armaQuadroServico) {
        this.armaQuadroServico = armaQuadroServico;
        return this;
    }

    public String identidadeMilitar() {
        return identidadeMilitar;
    }

    public DadosProfissionais setIdentidadeMilitar(String identidadeMilitar) {
        this.identidadeMilitar = identidadeMilitar;
        return this;
    }

    public String precCp() {
        return precCp;
    }

    public DadosProfissionais setPrecCp(String precCp) {
        this.precCp = precCp;
        return this;
    }

    public LocalDate dataDePraca() {
        return dataDePraca;
    }

    public DadosProfissionais setDataDePraca(LocalDate dataDePraca) {
        this.dataDePraca = dataDePraca;
        return this;
    }

    public LocalDate dataDePromocao() {
        return dataDePromocao;
    }

    public DadosProfissionais setDataDePromocao(LocalDate dataDePromocao) {
        this.dataDePromocao = dataDePromocao;
        return this;
    }

    public void atualizar(FormularioDadosProfissionais dados) {
        if (dados.armaQuadroServico() != null) setArmaQuadroServico(dados.armaQuadroServico());
        if (dados.postoGraduacao() != null) setPostoGraduacao(PostoGraduacao.parse(dados.postoGraduacao()));
        if (dados.nomeDeGuerra() != null) setNomeDeGuerra(dados.nomeDeGuerra());
        if (dados.identidadeMilitar() != null) setIdentidadeMilitar(dados.identidadeMilitar());
        if (dados.precCp() != null) setPrecCp(dados.precCp());
        if (dados.dataDePraca() != null) setDataDePraca(dados.dataDePraca());
        if (dados.dataDePromocao() != null) setDataDePromocao(dados.dataDePromocao());

    }
}
