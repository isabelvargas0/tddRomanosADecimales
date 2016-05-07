package main;

/**
 * Created by isabel on 6/05/16.
 */
public class RomanosaDecimal {

    public int convertir(String stringRomano) {
        int decimal = 0;

        stringRomano = stringRomano.toUpperCase();

        int l = stringRomano.length();
        int num = 0;
        int numAnterior = 0;
        for (int i = l - 1; i >= 0; i--) {
            char x = stringRomano.charAt(i);
            x = Character.toUpperCase(x);
            switch (x) {
                case 'I':
                    numAnterior = num;
                    num = 1;
                    break;
                case 'V':
                    numAnterior = num;
                    num = 5;
                    break;
                case 'X':
                    numAnterior = num;
                    num = 10;
                    break;
                case 'L':
                    numAnterior = num;
                    num = 50;
                    break;
                case 'C':
                    numAnterior = num;
                    num = 100;
                    break;
                case 'D':
                    numAnterior = num;
                    num = 500;
                    break;
                case 'M':
                    numAnterior = num;
                    num = 1000;
                    break;
            }
            if (num < numAnterior) {
                decimal = decimal - num;
            } else
                decimal = decimal + num;
        }
        return decimal;
    }

}
