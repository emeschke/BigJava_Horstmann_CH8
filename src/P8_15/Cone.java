package P8_15;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/19/13
 * Time: 1:26 PM
 * To change this template use File | Settings | File Templates.
 */
public class Cone {
    private double radius;
    private double height;

    public Cone(double radius, double height){
        if (radius <= 0){
            this.radius = Double.NaN;
            this.height = Double.NaN;
        }
        else{
            this.radius = radius;
            this.height = height;
        }
    }

    public double coneVolume(){
        return Math.PI*radius*radius*height/3;
    }

    public double coneSurface(){
        return Math.PI*radius*(radius+height);
    }
}
