import java.util.Scanner;

/**
 * @author Esa Kesti
 * Otetaan syöte käyttäjält
 */
public class SyötteenLukeminen {

    /**
     * Ohjelma kysyy käyttäjältä jotain ja tulostaa mitä
     * käyttäjä kirjoitti.
     * @param args ei käytössä
     */
    public static void main(String[] args) {
        System.out.print("Kirjoita jotain >");
        Scanner sc = new Scanner(System.in);
        String rivi = sc.nextLine();
        /**
         * Pyytää syötteen käyttäjältä
        */
        System.out.println("Kirjoitit isoilla: " + rivi);
        System.out.println(rivi.toUpperCase() );
        /**
         * Tulostaa aiemmin pyydetyn syötteen ja tulostaa sen isoina kirjaimina
         */
        System.out.println("Kirjoitit pienillä kirjaimilla: " +rivi);
        System.out.println(rivi.toLowerCase() );
        /**
         * Tulostaa aiemmin pyydetyn syötteen ja tulostaa sen pieninä kirjaimina
         */
        System.out.println("Kolme ensimmäistä kirjainta: " +rivi);
        System.out.println(rivi.substring(0,3) );
        /**
         * Tulostaa aiemmin pyydetyn syötteen ja tulostaa siitä vain kolme ensimmäistä kirjainta
         */


    }
}
