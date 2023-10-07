package br.jgabrielv.dados.dto.formulario;

public record FormularioEndereco(String cep,
                                 String logradouro,
                                 String numero,
                                 String complemento,
                                 String bairro,
                                 String cidade,
                                 String uf) {

    public FormularioEndereco(String cep,
                                     String logradouro,
                                     String numero,
                                     String complemento,
                                     String bairro,
                                     String cidade,
                                     String uf) {
        this.cep = cep.strip();
        this.logradouro = logradouro.strip().toUpperCase();
        this.numero = numero.strip();
        this.complemento = complemento.strip().toUpperCase();
        this.bairro = bairro.strip().toUpperCase();
        this.cidade = cidade.strip().toUpperCase();
        this.uf = uf.strip().toUpperCase();
    }
}
