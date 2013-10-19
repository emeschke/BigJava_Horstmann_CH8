package P8_14;

import javax.naming.NameNotFoundException;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 4:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class Geometry {
    //Static function return the volume/area or return NaN if an input is not positive.  This mirrors Math.sqrt().
    public static double sphereVolume(double r){
        if( r <= 0){
            return Double.NaN;
        }
        return 4*Math.PI*r*r*r/3;
    }
    public static double sphereSurface(double r){
        if( r <= 0){
            return Double.NaN;
        }
        return 4*Math.PI*r*r;
    }
    public static double cylinderVolume(double r, double h){
        if( r <= 0 || h <= 0){
            return Double.NaN;
        }
        return Math.PI*r*r*h;
    }
    public static double cylinderSurface(double r, double h){
        if( r <= 0 || h <= 0){
            return Double.NaN;
        }
        return (2*Math.PI*r*(r+h));
    }
    public static double coneVolume(double r, double h){
        if(  r <= 0 || h <= 0){
            return Double.NaN;
        }
        return Math.PI*r*r*h/3;
    }
    public static double coneSurface(double r, double h){
        if(  r <= 0 || h <= 0){
            return Double.NaN;
        }
        return Math.PI*r*(r+h);
    }
}
