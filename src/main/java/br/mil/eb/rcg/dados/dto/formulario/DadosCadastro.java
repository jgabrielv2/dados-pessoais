package br.mil.eb.rcg.dados.dto.formulario;

import br.mil.eb.rcg.dados.entity.PostoGraduacao;

public record DadosCadastro(PostoGraduacao postoGraduacao, String nomeDeGuerra,
                            DadosCadastroContato dadosCadastroContato, DadosPessoaisCadastro dadosPessoaisCadastro,
                            DadosCadastroEndereco dadosCadastroEndereco){
}
