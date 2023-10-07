package br.mil.eb.rcg.dados.entity;

public enum PostoGraduacao {

    CORONEL("Cel"),
    TENENTE_CORONEL("TC"),
    MAJOR("Maj"),
    CAPITAO("Cap"),
    PRIMEIRO_TENENTE("1º Ten"),
    SEGUNDO_TENENTE("2º Ten"),
    ASPIRANTE("Asp"),
    SUBTENENTE("ST"),
    PRIMEIRO_SARGENTO("1º Sgt"),
    SEGUNDO_SARGENTO("2º Sgt"),
    TERCEIRO_SARGENTO("3º Sgt"),
    CABO("Cb"),
    SOLDADO("Sd"),
    SOLDADO_RECRUTA("Sd Rct");

    private final String postoGraduacao;

    PostoGraduacao(String postoGraduacao) {
        this.postoGraduacao = postoGraduacao;
    }

    public static PostoGraduacao parse(String input) {
        if (input != null)
            for (PostoGraduacao postoGraduacao : PostoGraduacao.values())
                if (postoGraduacao.toString().equalsIgnoreCase(input.trim()))
                    return postoGraduacao;

        return null;
    }


    @Override
    public String toString() {
        return this.postoGraduacao;
    }
}
