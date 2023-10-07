package br.jgabrielv.dados.dto.formulario;

public record FormularioContato(String telefoneCelular, String email) {

    public FormularioContato(String telefoneCelular, String email){
        StringBuilder stringBuilder = new StringBuilder(telefoneCelular.strip())
                .insert(0, "(")
                .insert(3, ") ")
                .insert(10,"-");
        this.telefoneCelular = stringBuilder.toString();
        this.email = email.toLowerCase().strip();
    }
}
