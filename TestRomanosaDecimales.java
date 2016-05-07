package test;

import junit.framework.TestCase;
import main.RomanosaDecimal;
import org.junit.Test;

/**
 * Created by isabel on 6/05/16.
 */
public class TestRomanosaDecimales extends TestCase {

    @Test
    public void testRomanos1toDecimal() {
        int expected;
        int actual;
        String romano = "I";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 1;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);
    }

    @Test
    public void testRomanos2toDecimal() {
        int expected;
        int actual;
        String romano = "II";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 2;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos5toDecimal() {
        int expected;
        int actual;
        String romano = "V";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 5;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos7toDecimal() {
        int expected;
        int actual;
        String romano = "VII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 7;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos10toDecimal() {
        int expected;
        int actual;
        String romano = "X";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 10;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos12toDecimal() {
        int expected;
        int actual;
        String romano = "XII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 12;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos14toDecimal() {
        int expected;
        int actual;
        String romano = "XIV";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 14;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos19toDecimal() {
        int expected;
        int actual;
        String romano = "XIX";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 19;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos25toDecimal() {
        int expected;
        int actual;
        String romano = "XXV";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 25;
        actual = romanosad.convertir(romano);
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos39toDecimal() {
        int expected;
        int actual;
        String romano = "XXXIX";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 39;
        actual = romanosad.convertir(romano);
        assertEquals(expected, actual);

    }





    @Test
    public void testRomanos50toDecimal() {
        int expected;
        int actual;
        String romano = "L";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 50;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos57toDecimal() {
        int expected;
        int actual;
        String romano = "LVII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 57;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos87toDecimal() {
        int expected;
        int actual;
        String romano = "LXXXVII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 87;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos100toDecimal() {
        int expected;
        int actual;
        String romano = "C";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 100;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos90toDecimal() {
        int expected;
        int actual;
        String romano = "XC";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 90;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }


    @Test
    public void testRomanos131toDecimal() {
        int expected;
        int actual;
        String romano = "CXXXI";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 131;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos208toDecimal() {
        int expected;
        int actual;
        String romano = "CCVIII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 208;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }


    @Test
    public void testRomanos333toDecimal() {
        int expected;
        int actual;
        String romano = "CCCXXXIII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 333;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos399toDecimal() {
        int expected;
        int actual;
        String romano = "CCCXCIX";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 399;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }


    @Test
    public void testRomanos500toDecimal() {
        int expected;
        int actual;
        String romano = "D";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 500;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos400toDecimal() {
        int expected;
        int actual;
        String romano = "CD";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 400;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos418toDecimal() {
        int expected;
        int actual;
        String romano = "CDXVIII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 418;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }


    @Test
    public void testRomanos588toDecimal() {
        int expected;
        int actual;
        String romano = "DLXXXVIII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 588;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }


    @Test
    public void testRomanos710toDecimal() {
        int expected;
        int actual;
        String romano = "DCCX";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 710;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos830toDecimal() {
        int expected;
        int actual;
        String romano = "DCCCXXX";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 830;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos882toDecimal() {
        int expected;
        int actual;
        String romano = "DCCCLXXXII";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 882;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }


    @Test
    public void testRomanos1000toDecimal() {
        int expected;
        int actual;
        String romano = "M";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 1000;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }


    @Test
    public void testRomanos900toDecimal() {
        int expected;
        int actual;
        String romano = "CM";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 900;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos950toDecimal() {
        int expected;
        int actual;
        String romano = "CML";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 950;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }

    @Test
    public void testRomanos999toDecimal() {
        int expected;
        int actual;
        String romano = "CMXCIX";
        RomanosaDecimal romanosad = new RomanosaDecimal();
        expected = 999;
        actual = romanosad.convertir(romano);;
        assertEquals(expected, actual);

    }


}