package br.com.fiap.orderservice;

import java.text.Normalizer;

public class Polin {
    public boolean ehPalindromo(String frase) {

        String fraseFiltrada = frase
                .toUpperCase().replace(" ", "").replace("-", "");

        for(int i = 0; i < fraseFiltrada.length(); i++) {
            if(fraseFiltrada.charAt(i) !=
                    fraseFiltrada.charAt(fraseFiltrada.length() -(i+1))) {
                return false;
            }
        }

        return true;
    }


}
