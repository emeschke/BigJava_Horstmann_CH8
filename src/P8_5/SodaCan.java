package P8_5;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/14/13
 * Time: 9:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class SodaCan {
    private double height;
    private double radius;


    //Constructor for the class.
    public SodaCan(double canHeight, double canHalfWidth){
        height = canHeight;
        radius = canHalfWidth;
    }

    //Method to get the surfaceArea.
    public double getSurfaceArea(){
        return (2*Math.PI*radius*radius + 2*Math.PI*radius*height);
    }

    //Method to getVolume.
    public double getVolume(){
         return (Math.PI*radius*radius*height);
    }
}
