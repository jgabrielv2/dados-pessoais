package br.jgabrielv.dados.dto.formulario.utils;

import jakarta.mail.internet.AddressException;
import jakarta.mail.internet.InternetAddress;

public class EmailValidator {

    public static InternetAddress parse(String stringEmail) {
        try {
            return new InternetAddress((stringEmail));
        } catch (AddressException e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static boolean isValid(String stringEmail) {
        try {
            InternetAddress email = new InternetAddress(stringEmail);
            email.validate();
            return true;
        } catch (AddressException e) {
            return false;
        }
    }

}
