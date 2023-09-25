package br.mil.eb.rcg.dados.dto.listagem;

import br.mil.eb.rcg.dados.entity.Militar;
import br.mil.eb.rcg.dados.entity.PostoGraduacao;

public record DadosListagemMilitar(Boolean ativo, Long id, PostoGraduacao postoGraduacao, String nomeDeGuerra, DadosListagemEndereco dadosListagemEndereco,
                                   DadosListagemContato dadosListagemContato, DadosPessoaisListagem dadosPessoaisListagem){

    public DadosListagemMilitar(Militar militar){
        this(militar.ativo(), militar.id(), militar.postoGraduacao(), militar.nomeDeGuerra(),
                new DadosListagemEndereco(militar.endereco().cep(), militar.endereco().logradouro(), militar.endereco().numero(), militar.endereco().complemento(), militar.endereco().bairro(), militar.endereco().cidade(), militar.endereco().uf()),
                new DadosListagemContato(militar.dadosDeContato().telefoneCelular(), militar.dadosDeContato().email()),
                new DadosPessoaisListagem(militar.dadosPessoais().identidadeCivil(), militar.dadosPessoais().identidadeMilitar(), militar.dadosPessoais().cpf(), militar.dadosPessoais().precCp(), militar.dadosPessoais().nome()));
    }
}
