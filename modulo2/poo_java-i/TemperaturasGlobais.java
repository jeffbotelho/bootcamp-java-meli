package com.mercadolivre;

public class TemperaturasGlobais {

    public static void main(String[] args) {

        String vetorCidades[] = {"Londres", "Madrid", "Nueva York", "Buenos Aires", "Assunción", "São Paulo", "Lima", "Santiago de Chile", "Lisboa", "Tokio"};
        int matrizTemperaturas[][] = {{-2, 33}, {-3, 32}, {-8, 27}, {4, 37}, {6, 42}, {5, 43}, {0, 39}, {-7, 26}, {-1, 31}, {-10, 35}};

        int menorTemperatura = 0;
        int maiorTemperatura = 0;
        String cidadeMaisQuente = "null";
        String cidadeMaisFria = "null";


        for (int i = 0; i < matrizTemperaturas.length; i++) {

            for (int j = 0; j < matrizTemperaturas[i].length; j++) {

                if (matrizTemperaturas[i][j] < menorTemperatura) {
                    menorTemperatura = matrizTemperaturas[i][j];
                    cidadeMaisFria = vetorCidades[i];
                }
                if (matrizTemperaturas[i][j] > maiorTemperatura) {
                    maiorTemperatura = matrizTemperaturas[i][j];
                    cidadeMaisQuente = vetorCidades[i];
                }


            }

        }

        System.out.printf("A temperatura mais baixa foi em %s, com %do C\n", cidadeMaisFria, menorTemperatura);
        System.out.printf("A temperatura mais alta foi em %s, com %do C", cidadeMaisQuente, maiorTemperatura);
    }
}

