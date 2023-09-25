package br.mil.eb.rcg.dados.entity;

import br.mil.eb.rcg.dados.dto.formulario.DadosCadastroEndereco;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {


    public Endereco() {

    }
    public Endereco(DadosCadastroEndereco dadosCadastroEndereco) {
        setCep(dadosCadastroEndereco.cep())
                .setLogradouro(dadosCadastroEndereco.logradouro())
                .setNumero(dadosCadastroEndereco.numero())
                .setComplemento(dadosCadastroEndereco.complemento())
                .setBairro(dadosCadastroEndereco.bairro())
                .setCidade(dadosCadastroEndereco.cidade())
                .setUf(dadosCadastroEndereco.uf());
    }

    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public String cep() {
        return cep;
    }

    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String logradouro() {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String numero() {
        return numero;
    }

    public Endereco setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public String complemento() {
        return complemento;
    }

    public Endereco setComplemento(String complemento) {
        this.complemento = complemento;
        return this;
    }

    public String bairro() {
        return bairro;
    }

    public Endereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String cidade() {
        return cidade;
    }

    public Endereco setCidade(String cidade) {
        this.cidade = cidade;
        return this;
    }

    public String uf() {
        return uf;
    }

    public Endereco setUf(String uf) {
        this.uf = uf;
        return this;
    }
}
