public class Aritmeettiset {
    public static void main(String[] args) {

        int minuuttiSekuntteina = 60;
        int tuntiMinuutteina = 60;
        int tuntiSekuntteina = minuuttiSekuntteina*tuntiMinuutteina;
        int päiväTunteina = 24;
        int vuosiPäivinä = 365;
        int vuosiTunteina = päiväTunteina*vuosiPäivinä;
        int valonNopeus = 30000000;
        long etäisyysAuringosta = 15000000000l;
        long aikaAuringostaMaahan = (etäisyysAuringosta/valonNopeus)/60;
        long valovuosi = vuosiPäivinä*päiväTunteina*tuntiMinuutteina*minuuttiSekuntteina;

        System.out.println("Tunti sekuntteina = " + tuntiSekuntteina);
        System.out.println("Vuosi tunteina = " + vuosiTunteina);
        System.out.println("Kuinka monta minuuttia valolla kuluu aikaa matkaan auringosta maahan = " + aikaAuringostaMaahan);
        System.out.println("Valovuosi kilometreinä = " + valovuosi);
    }

    }
