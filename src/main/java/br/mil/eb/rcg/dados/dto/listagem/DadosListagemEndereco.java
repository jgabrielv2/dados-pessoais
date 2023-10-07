package br.mil.eb.rcg.dados.dto.listagem;

import br.mil.eb.rcg.dados.entity.Militar;

public record DadosListagemEndereco(String cep, String logradouro, String numero, String complemento, String bairro,
                                    String cidade, String uf) {

    public DadosListagemEndereco(Militar militar) {
        this(
                militar.endereco().cep(),
                militar.endereco().logradouro(),
                militar.endereco().numero(),
                militar.endereco().complemento(),
                militar.endereco().bairro(),
                militar.endereco().cidade(),
                militar.endereco().uf()
        );
    }
}
