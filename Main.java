/**
 * Plant flowers around the cross as described in the Readme.md
 * Use left and right arrow keys to see it when running main()
 */
public class Main implements Directions {

    /**
     * Do NOT edit this.  Put your code inside the runJerooCode method below.
     */
    public static void main(String[] args) {
        Map.getInstance().loadMap("maps/plantCross.jev");
        new JerooGUI();
        runJerooCode();
    }

    /**
     * IMPORTANT: Do NOT change this code.
     */
    public static void runJerooCode() {
       Jeroo kim = new Jeroo(0, 0, EAST, 100);
       kim.plantCross();

    }

}
