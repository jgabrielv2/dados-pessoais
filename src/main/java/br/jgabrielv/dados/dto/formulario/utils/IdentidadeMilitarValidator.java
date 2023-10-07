package br.jgabrielv.dados.dto.formulario.utils;

import org.apache.commons.validator.routines.checkdigit.LuhnCheckDigit;

public class IdentidadeMilitarValidator {

    public static boolean isValida(String numero) {
        var checkDigit = new LuhnCheckDigit();
        return checkDigit.isValid(numero);
    }
}
