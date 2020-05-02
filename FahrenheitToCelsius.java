/**
 * @author Esa Kesti
 * Muutetaan fahrenheit arvo celsiukseksi
 *
 * */
public class FahrenheitToCelcius {

    /**
     *M��ritell��n aliohjelma fahrenheitToCelsius
     * luodaan funktio lampotilaC joka suorittaa laskun ja palauttaa arvon lampotilaC
     *
     * */
    public static double fahrenheitToCelsius(double fahrenheit) {

        double lampotilaC = (5.0 / 9.0) * (fahrenheit - 32.0);
        return lampotilaC;

    }
    /**
     * Kutsutaan aliohjelma fahrenheitToCelsius ja annetaan l�mp�tila arvo
     * Tulostetaan l�mp�tila celsiuksena
     * */
    public static void main(String[] args) {
        System.out.print(fahrenheitToCelsius(13));
    }
}
