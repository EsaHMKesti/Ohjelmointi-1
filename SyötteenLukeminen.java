import java.util.Scanner;

/**
 * @author Esa Kesti
 * Otetaan sy�te k�ytt�j�lt
 */
public class Sy�tteenLukeminen {

    /**
     * Ohjelma kysyy k�ytt�j�lt� jotain ja tulostaa mit�
     * k�ytt�j� kirjoitti.
     * @param args ei k�yt�ss�
     */
    public static void main(String[] args) {
        System.out.print("Kirjoita jotain >");
        Scanner sc = new Scanner(System.in);
        String rivi = sc.nextLine();
        /**
         * Pyyt�� sy�tteen k�ytt�j�lt�
        */
        System.out.println("Kirjoitit isoilla: " + rivi);
        System.out.println(rivi.toUpperCase() );
        /**
         * Tulostaa aiemmin pyydetyn sy�tteen ja tulostaa sen isoina kirjaimina
         */
        System.out.println("Kirjoitit pienill� kirjaimilla: " +rivi);
        System.out.println(rivi.toLowerCase() );
        /**
         * Tulostaa aiemmin pyydetyn sy�tteen ja tulostaa sen pienin� kirjaimina
         */
        System.out.println("Kolme ensimm�ist� kirjainta: " +rivi);
        System.out.println(rivi.substring(0,3) );
        /**
         * Tulostaa aiemmin pyydetyn sy�tteen ja tulostaa siit� vain kolme ensimm�ist� kirjainta
         */


    }
}
