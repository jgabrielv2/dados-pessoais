package br.jgabrielv.dados.dto.formulario;

public record FormularioContato(String telefoneCelular, String email) {

    public FormularioContato(String telefoneCelular, String email){
        this.telefoneCelular = telefoneCelular.strip();
        this.email = email.toLowerCase().strip();
    }
}
