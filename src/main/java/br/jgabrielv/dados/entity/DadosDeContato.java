package br.jgabrielv.dados.entity;

import br.jgabrielv.dados.dto.formulario.FormularioContato;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;

@Embeddable
public class DadosDeContato {

    private String telefoneCelular;
    @Email
    private String email;

    public DadosDeContato() {

    }

    public DadosDeContato(FormularioContato formularioContato) {
        setTelefoneCelular(formularioContato.telefoneCelular())
                .setEmail(formularioContato.email());
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

    public void atualizar(FormularioContato formularioContato) {
        if (formularioContato.telefoneCelular() != null) {
            setTelefoneCelular(formularioContato.telefoneCelular());
        }
        if (formularioContato.email() != null) {
            setEmail(formularioContato.email());
        }
    }
}
