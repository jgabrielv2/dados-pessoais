package br.jgabrielv.dados.dto.formulario.utils;

import org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit;

public class IdentidadeMilitarUtils {

    public static boolean isValid(String identidade) {
        var checkDigit = new LuhnCheckDigit();
        return checkDigit.isValid(identidade);
    }

    public static String format(String identidade) {
        if (isValid(identidade.strip())) {
            return new StringBuilder(identidade.strip()).insert(9, "-").toString();
        } else {
            throw new IllegalArgumentException("Identidade militar inválida!");
        }
    }
}
