package com.Edwar.Funciones;

public class Funciones {

    public String[] municipiosJutiapa = {"Agua Blanca", "Asuncion Mita", "Atescatempa", "Comapa",
        "Conguaco", "El Adelanto", "El Progreso", "Jalpatagua", "Jerez", "Jutiapa",
        "Moyuta", "Pasaco", "Quesada", "San Jose Acatempa", "Santa Catarina Mita",
        "Yupiltepeque", "Zapotitlan"};

    String[] idMunicipios = {"A", "B", "C", "D",
        "E", "F", "G", "H", "I", "J",
        "K", "L", "M", "N", "O",
        "P", "Q"};

    public char IdentificadorId(String string) {
        String auxiliar = "";
        for (int i = 0; i < municipiosJutiapa.length; i++) {
            if (string.equals(municipiosJutiapa[i])) {
                auxiliar = idMunicipios[i];
            }
        }
        return auxiliar.charAt(0);
    }

    public String IdentificadorMunicipio(String ruta, int size) {

        String auxiliar = " Saliendo de: ";
        int formato = 0;
        for (String spl : ruta.split(";")) {
            for (int i = 0; i < municipiosJutiapa.length; i++) {
                if (spl.equals(idMunicipios[i])) {
                    if (formato == 0) {
                        auxiliar += municipiosJutiapa[i];
                    } else {
                        auxiliar += ": Viaja a --->" + municipiosJutiapa[i] +"\n";
                    }

                    formato++;
                }
            }

        }
        return auxiliar;
    }
}
