package l5;

import fi.jyu.mit.graphics.EasyWindow;

	/**
	* Ohjelma piirtää viisi porrasta alkaen origosta päättyen
	* pisteesen (5,5) ja piirtää myös laskevat portaat pisteeseen
	*9.1
	*
	* @author Esa Kesti
	* @version 1.0
	*/
public class Laskevatportaat {


	   /**
	    * Aliohjelma piirtää ikkunaan yhden nousevan portaan
	    * alkaen pisteestä (x,y) ja päättyen pisteeseen (x+1,y+1)
	    * <pre>
	    *    |-------(x+1,y+1)
	    *    |
	    *    |
	    *    |
	    *   (x,y)
	    * </pre>
	    * @param window
	    * @param x portaan alkupisteen x
	    * @param y portaan alkupisteen y
	    */
	   public static void porras(EasyWindow w,double x,double y) {
	       w.addLine(x, y, y, y+1);
	       w.addLine(x, y+1, x+1, y+1);
	   }

	   /**
	 * @param aliohjelma laskevia portaita varten
	 *
	 */
	public static void porrasAlas(EasyWindow w,double x, double y) {
		   w.addLine(x, y, x, y-1);
		   w.addLine(x, y-1, x+1, y-1);

	   }
	   /**
	    * @param kutsuu porras aliohjelmaa viisi kertaa
	    * @param kutsuu porrasAlas aliohjelmaa viisi kertaa
	    *
	    */
	   public static void main(String[] args) {
	       EasyWindow window = new EasyWindow();
	       window.scale(0,0,10,10);
	       porras(window,0,0);
	       porras(window,1,1);
	       porras(window,2,2);
	       porras(window,3,3);
	       porras(window,4,4);
	       porrasAlas(window,5,5);
	       porrasAlas(window,6,4);
	       porrasAlas(window,7,3);
	       porrasAlas(window,8,2);
	       porrasAlas(window,9,1);


	       window.showWindow();
	   }

	}
