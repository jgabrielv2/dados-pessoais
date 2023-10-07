package br.jgabrielv.dados.entity;

import br.jgabrielv.dados.dto.formulario.FormularioDadosPessoais;
import jakarta.persistence.Embeddable;
import org.hibernate.validator.constraints.br.CPF;

@Embeddable
public class DadosPessoais {


    private String identidadeCivil;
    @CPF
    private String cpf;
    private String nome;

    public DadosPessoais() {

    }

    public DadosPessoais(FormularioDadosPessoais formularioDadosPessoais) {

        setIdentidadeCivil(formularioDadosPessoais.identidadeCivil())
                .setCpf(formularioDadosPessoais.cpf())
                .setNome(formularioDadosPessoais.nome());
    }


    public String identidadeCivil() {
        return identidadeCivil;
    }

    public DadosPessoais setIdentidadeCivil(String identidadeCivil) {
        this.identidadeCivil = identidadeCivil;
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

    public void atualizar(FormularioDadosPessoais formularioDadosPessoais) {
        if (formularioDadosPessoais.identidadeCivil() != null) {
            setIdentidadeCivil(formularioDadosPessoais.identidadeCivil());
        }
        if (formularioDadosPessoais.cpf() != null) {
            setCpf(formularioDadosPessoais.cpf());
        }
        if (formularioDadosPessoais.nome() != null) {
            setNome(formularioDadosPessoais.nome());
        }

    }
}
