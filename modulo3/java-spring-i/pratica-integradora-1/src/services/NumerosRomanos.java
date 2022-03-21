public class NumerosRomanos {
    private static int[] numerosInduArabicos = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1_000};
    private static String[] algarismosRomanos = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};

    public static String converter(Integer numero) {
        String convertido = "";
        Integer posicao = 0;

        while (numero > 0) {
            if (numero > numerosInduArabicos[posicao]) {
                posicao++;
                continue;
            }
            convertido += algarismosRomanos[posicao];
            numero -= numerosInduArabicos[posicao];
        }
        return convertido;
    }

}
