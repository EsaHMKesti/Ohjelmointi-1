/**
 * Tutkitaan muutujia javassa
 * @author esakesti
 *
 */

public class Muuttujat {

	/**
	 * @param luku1
	 * @param luku2
	 * @return
	 */
	public static double keskiarvo(int luku1,int luku2) {
		double tulos = (luku1+luku2)/2.0;
		return tulos;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//String eka = args[0];
		//String toka = args[1];
		//System.out.println("Annoit " + eka + " " + toka );
		int a;
		int b = 8;
		a = 5;
		//a = b;
		System.out.println("a =" + a);
		System.out.println("b =" + b);
		double c = (a+b)/2.0;
		char merkki = 'A';
		System.out.println("a ja b lukujen keskiarvo = " + c);

		double ka;
		ka = keskiarvo(a, b);
		System.out.println("keskiarvo on = " + ka);

	}

}
