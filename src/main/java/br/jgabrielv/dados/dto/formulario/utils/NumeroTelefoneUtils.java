package br.jgabrielv.dados.dto.formulario.utils;

import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber.PhoneNumber;

public class NumeroTelefoneUtils {

    private static final PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();

    public static String format(String numeroString) {
        return toStringFormat(toPhoneNumber(numeroString));
    }

    private static PhoneNumber toPhoneNumber(String numeroString) {

        try {
            var phoneNumber = phoneNumberUtil.parse(numeroString, "BR");
            if (phoneNumberUtil.isValidNumber(phoneNumber)) {
                return phoneNumber;
            } else {
                throw new IllegalArgumentException("Npumero de telefone inválido");
            }
        } catch (NumberParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

    private static String toStringFormat(PhoneNumber phoneNumber) {
        return phoneNumberUtil.format(phoneNumber, PhoneNumberUtil.PhoneNumberFormat.NATIONAL);
    }

    public static boolean isValid(String numeroString) {

        try {
            return phoneNumberUtil.isValidNumber(phoneNumberUtil.parse(numeroString, "BR"));
        } catch (NumberParseException e) {
            throw new IllegalArgumentException(e);
        }
    }

}
