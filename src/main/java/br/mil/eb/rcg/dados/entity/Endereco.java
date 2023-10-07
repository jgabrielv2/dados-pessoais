package br.mil.eb.rcg.dados.entity;

import br.mil.eb.rcg.dados.dto.formulario.FormularioEndereco;
import jakarta.persistence.Embeddable;

@Embeddable
public class Endereco {


    private String cep;
    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    public Endereco() {

    }

    public Endereco(FormularioEndereco formularioEndereco) {
        setCep(formularioEndereco.cep())
                .setLogradouro(formularioEndereco.logradouro())
                .setNumero(formularioEndereco.numero())
                .setComplemento(formularioEndereco.complemento())
                .setBairro(formularioEndereco.bairro())
                .setCidade(formularioEndereco.cidade())
                .setUf(formularioEndereco.uf());
    }

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

    public void atualizar(FormularioEndereco formularioEndereco) {
        if (formularioEndereco.cep() != null) {
            setCep(formularioEndereco.cep());
        }
        if (formularioEndereco.logradouro() != null) {
            setLogradouro(formularioEndereco.logradouro());
        }
        if (formularioEndereco.numero() != null) {
            setNumero(formularioEndereco.numero());
        }
        if (formularioEndereco.complemento() != null) {
            setComplemento(formularioEndereco.complemento());
        }
        if (formularioEndereco.bairro() != null) {
            setBairro(formularioEndereco.bairro());
        }
        if (formularioEndereco.cidade() != null) {
            setCidade(formularioEndereco.cidade());
        }
        if (formularioEndereco.uf() != null) {
            setUf(formularioEndereco.uf());
        }
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
