package br.mil.eb.rcg.dados.entity;


import br.mil.eb.rcg.dados.dto.formulario.DadosCadastro;
import jakarta.persistence.*;

@Entity(name = "militar")
public class Militar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private PostoGraduacao postoGraduacao;
    private String nomeDeGuerra;
    @Embedded
    private Endereco endereco;

    @Embedded
    private DadosDeContato dadosDeContato;

    @Embedded
    private DadosPessoais dadosPessoais;
    private Boolean ativo;

    public Militar() {
    }

    public Militar(DadosCadastro dadosCadastro) {
        setPostoGraduacao(dadosCadastro.postoGraduacao())
                .setNomeDeGuerra(dadosCadastro.nomeDeGuerra())
                .setEndereco(new Endereco(dadosCadastro.dadosCadastroEndereco()))
                .setDadosDeContato(new DadosDeContato(dadosCadastro.dadosCadastroContato()))
                .setDadosPessoais(new DadosPessoais(dadosCadastro.dadosPessoaisCadastro()))
                .setAtivo(true);

    }

    public Long id() {
        return id;
    }

    public PostoGraduacao postoGraduacao() {
        return postoGraduacao;
    }

    public Militar setPostoGraduacao(PostoGraduacao postoGraduacao) {
        this.postoGraduacao = postoGraduacao;
        return this;
    }

    public String nomeDeGuerra() {
        return nomeDeGuerra;
    }

    public Militar setNomeDeGuerra(String nomeDeGuerra) {
        this.nomeDeGuerra = nomeDeGuerra;
        return this;
    }

    public Endereco endereco() {
        return endereco;
    }

    public Militar setEndereco(Endereco endereco) {
        this.endereco = endereco;
        return this;
    }

    public DadosDeContato dadosDeContato() {
        return dadosDeContato;
    }

    public Militar setDadosDeContato(DadosDeContato dadosDeContato) {
        this.dadosDeContato = dadosDeContato;
        return this;
    }

    public DadosPessoais dadosPessoais() {
        return dadosPessoais;
    }

    public Militar setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
        return this;
    }

    public Boolean ativo() {
        return ativo;
    }

    public Militar setAtivo(Boolean ativo) {
        this.ativo = ativo;
        return this;
    }

    @Override
    public String toString() {
        return "Militar{" +
                "id=" + id +
                ", postoGraduacao=" + postoGraduacao +
                ", nomeDeGuerra='" + nomeDeGuerra + '\'' +
                ", endereco=" + endereco +
                ", dadosDeContato=" + dadosDeContato +
                ", dadosPessoais=" + dadosPessoais +
                ", ativo=" + ativo +
                '}';
    }
}
