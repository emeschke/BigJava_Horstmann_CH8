package P8_5;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/14/13
 * Time: 10:31 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driverp8_5 {
    public static void main(String[] args) {
        //Initialize the new objects
        SodaCan cocaCola = new SodaCan(3,4);
        SodaCan mtnDew = new SodaCan(2.7,3.9);

        //Print Surface area and volume.
        System.out.println("Surface Area:");
        System.out.println(cocaCola.getSurfaceArea());
        System.out.println(mtnDew.getSurfaceArea());

        System.out.println("Volume:");
        System.out.println(cocaCola.getVolume());
        System.out.println(mtnDew.getVolume());
    }
}
