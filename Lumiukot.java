import fi.jyu.mit.graphics.EasyWindow;



/**
 * @author esakesti
 *
 */
public class Lumiukot {

	/**
	 *
	 */
	public static void lumiukot(EasyWindow w, double x, double y) {
		lumiukot(w, x, y, 20);
	}

	/**
	 *
   *
	 */
	public static void lumiukot(EasyWindow w, double x, double y, double isonPallonSade) {
		double keskiPallonSade = 15;
		double pikkuPallonSade = 10;
		double keskiPallonY = y-keskiPallonSade-isonPallonSade;
		double pikkuPallonY = y-2*keskiPallonSade-isonPallonSade-pikkuPallonSade;
		w.addCircle(x, pikkuPallonY,pikkuPallonSade);
		w.addCircle(x,keskiPallonY,keskiPallonSade);
		w.addCircle(x,y,isonPallonSade);

	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EasyWindow window = new EasyWindow();

		lumiukot(window, 70, 90, 10);
		lumiukot(window, 100, 90);
		lumiukot(window, 300, 40);

	}

}
