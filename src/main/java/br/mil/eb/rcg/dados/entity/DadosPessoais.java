package br.mil.eb.rcg.dados.entity;

import br.mil.eb.rcg.dados.dto.formulario.DadosPessoaisCadastro;
import jakarta.persistence.Embeddable;
import org.hibernate.validator.constraints.br.CPF;

@Embeddable
public class DadosPessoais {

    private String identidadeMilitar;
    private String identidadeCivil;
    private String precCp;
    @CPF
    private String cpf;
    private String nome;

    public DadosPessoais() {

    }

    public DadosPessoais(DadosPessoaisCadastro dadosPessoaisCadastro) {
        setIdentidadeMilitar(dadosPessoaisCadastro.identidadeMilitar())
                .setIdentidadeCivil(dadosPessoaisCadastro.identidadeCivil())
                .setPrecCp(dadosPessoaisCadastro.precCp())
                .setCpf(dadosPessoaisCadastro.cpf())
                .setNome(dadosPessoaisCadastro.nome());
    }

    public String identidadeMilitar() {
        return identidadeMilitar;
    }

    public DadosPessoais setIdentidadeMilitar(String identidadeMilitar) {
        this.identidadeMilitar = identidadeMilitar;
        return this;
    }

    public String identidadeCivil() {
        return identidadeCivil;
    }

    public DadosPessoais setIdentidadeCivil(String identidadeCivil) {
        this.identidadeCivil = identidadeCivil;
        return this;
    }

    public String precCp() {
        return precCp;
    }

    public DadosPessoais setPrecCp(String precCp) {
        this.precCp = precCp;
        return this;
    }

    public String cpf() {
        return cpf;
    }

    public DadosPessoais setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String nome() {
        return nome;
    }

    public DadosPessoais setNome(String nome) {
        this.nome = nome;
        return this;
    }
}
