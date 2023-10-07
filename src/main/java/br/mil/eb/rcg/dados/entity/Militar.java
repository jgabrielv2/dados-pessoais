package br.mil.eb.rcg.dados.entity;


import br.mil.eb.rcg.dados.dto.formulario.FormularioMilitar;
import br.mil.eb.rcg.dados.dto.formulario.atualizacao.FormularioAtualizacaoMilitar;
import jakarta.persistence.*;

@Entity
@Table(name = "militar")
public class Militar {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private Endereco endereco;

    @Embedded
    private DadosDeContato dadosDeContato;

    @Embedded
    private DadosPessoais dadosPessoais;

    @Embedded
    private DadosProfissionais dadosProfissionais;
    private Boolean ativo;

    public Militar() {
    }

    public Militar(FormularioMilitar formularioMilitar) {
        setEndereco(new Endereco(formularioMilitar.formularioEndereco()))
                .setDadosDeContato(new DadosDeContato(formularioMilitar.formularioContato()))
                .setDadosPessoais(new DadosPessoais(formularioMilitar.formularioDadosPessoais()))
                .setDadosProfissionais(new DadosProfissionais(formularioMilitar.formularioDadosProfissionais()))
                .setAtivo(true);

    }

    public Long id() {
        return id;
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

    public Militar setDadosProfissionais(DadosProfissionais dadosProfissionais) {
        this.dadosProfissionais = dadosProfissionais;
        return this;
    }

    public DadosProfissionais dadosProfissionais() {
        return dadosProfissionais;
    }

    public Boolean ativo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public void atualizar(FormularioAtualizacaoMilitar formularioAtualizacaoMilitar) {
        var endereco = formularioAtualizacaoMilitar.formularioMilitar().formularioEndereco();
        var contato = formularioAtualizacaoMilitar.formularioMilitar().formularioContato();
        var dadosPessoais = formularioAtualizacaoMilitar.formularioMilitar().formularioDadosPessoais();
        var dadosProfissionais = formularioAtualizacaoMilitar.formularioMilitar().formularioDadosProfissionais();

        if (endereco != null)
            this.endereco().atualizar(endereco);

        if (contato != null)
            this.dadosDeContato().atualizar(contato);

        if (dadosPessoais != null)
            this.dadosPessoais().atualizar(dadosPessoais);

        if (dadosProfissionais != null)
            this.dadosProfissionais().atualizar(dadosProfissionais);

    }

    @Override
    public String toString() {
        return "Militar{" +
                "id=" + id +
                ", endereco=" + endereco +
                ", dadosDeContato=" + dadosDeContato +
                ", dadosPessoais=" + dadosPessoais +
                ", dadosProfissionais=" + dadosProfissionais +
                ", ativo=" + ativo +
                '}';
    }
}
