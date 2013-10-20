package P8_15;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/19/13
 * Time: 1:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Sphere {
    private double radius;

    public Sphere(double radius){
        if (radius <= 0){
            this.radius = Double.NaN;
        }
        else{
            this.radius = radius;
        }
    }

    public double sphereVolume(){
        return 4*Math.PI*radius*radius*radius/3;
    }

    public double sphereSurface(){
        return 4*Math.PI*radius*radius;
    }
}
