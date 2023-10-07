package br.jgabrielv.dados.dto.formulario;

public record FormularioEndereco(String cep,
                                 String logradouro,
                                 String numero,
                                 String complemento,
                                 String bairro,
                                 String cidade,
                                 String uf) {
}
