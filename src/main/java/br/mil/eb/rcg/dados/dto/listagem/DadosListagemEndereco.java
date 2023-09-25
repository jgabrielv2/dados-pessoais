package br.mil.eb.rcg.dados.dto.listagem;

public record DadosListagemEndereco(String cep, String logradouro, String numero, String complemento, String bairro,
                                    String cidade, String uf) {
}
