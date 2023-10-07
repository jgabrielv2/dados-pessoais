package br.jgabrielv.dados.entity;

import br.jgabrielv.dados.dto.formulario.FormularioContato;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.Email;

import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

@Embeddable
public class DadosDeContato {

    @Email
    private String email;

    private String numeroTelefone;

    public DadosDeContato() {

    }

    public DadosDeContato(FormularioContato formularioContato) {
        setNumeroTelefone(formularioContato.numeroTelefone())
                .setEmail(formularioContato.email());
    }


    public String numero() {
        return numeroTelefone;
    }

    public DadosDeContato setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
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
        if (formularioContato.numeroTelefone() != null) {
            setNumeroTelefone(formularioContato.numeroTelefone());
        }
        if (formularioContato.email() != null) {
            setEmail(formularioContato.email());
        }
    }
}
