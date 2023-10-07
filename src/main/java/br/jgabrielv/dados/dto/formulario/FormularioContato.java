package br.jgabrielv.dados.dto.formulario;

import br.jgabrielv.dados.dto.formulario.utils.NumeroTelefoneUtils;

public record FormularioContato(String numeroTelefone, String email) {
    public FormularioContato(String numeroTelefone, String email) {

        this.numeroTelefone = NumeroTelefoneUtils.format(numeroTelefone);
        this.email = email.toLowerCase().strip();

    }


}
