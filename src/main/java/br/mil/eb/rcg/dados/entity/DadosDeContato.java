package br.mil.eb.rcg.dados.entity;

import br.mil.eb.rcg.dados.dto.formulario.DadosCadastroContato;
import jakarta.persistence.Embeddable;

@Embeddable
public class DadosDeContato {

    private String telefoneCelular;
    private String email;

    public DadosDeContato() {

    }
    public DadosDeContato(DadosCadastroContato dadosCadastroContato) {
        setTelefoneCelular(dadosCadastroContato.telefoneCelular())
                .setEmail(dadosCadastroContato.email());
    }

    public String telefoneCelular() {
        return telefoneCelular;
    }

    public DadosDeContato setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
        return this;
    }

    public String email() {
        return email;
    }

    public DadosDeContato setEmail(String email) {
        this.email = email;
        return this;
    }
}
