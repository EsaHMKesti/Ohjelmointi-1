public class Aritmeettiset {
    public static void main(String[] args) {

        int minuuttiSekuntteina = 60;
        int tuntiMinuutteina = 60;
        int tuntiSekuntteina = minuuttiSekuntteina*tuntiMinuutteina;
        int p‰iv‰Tunteina = 24;
        int vuosiP‰ivin‰ = 365;
        int vuosiTunteina = p‰iv‰Tunteina*vuosiP‰ivin‰;
        int valonNopeus = 30000000;
        long et‰isyysAuringosta = 15000000000l;
        long aikaAuringostaMaahan = (et‰isyysAuringosta/valonNopeus)/60;
        long valovuosi = vuosiP‰ivin‰*p‰iv‰Tunteina*tuntiMinuutteina*minuuttiSekuntteina;

        System.out.println("Tunti sekuntteina = " + tuntiSekuntteina);
        System.out.println("Vuosi tunteina = " + vuosiTunteina);
        System.out.println("Kuinka monta minuuttia valolla kuluu aikaa matkaan auringosta maahan = " + aikaAuringostaMaahan);
        System.out.println("Valovuosi kilometrein‰ = " + valovuosi);
    }

    }
