package P8_15;

import P8_14.Geometry;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 4:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {
        double radius;
        double height;
        String sRadius;
        String sHeight;

        //Read in radius and height as strings.
        System.out.print("Enter a radius:");
        Scanner in = new Scanner(System.in);
        sRadius = in.next();
        System.out.print("Enter a height:");
        sHeight = in.next();

        //Input validation that they are doubles
        if (!(dub_test(sRadius) && dub_test(sHeight))) {
            System.out.println("Not valid inputs.");
            System.exit(1);
        }

        //If we are here then the inputs are doubles, so we convert them from strings to doubles and print the vol/sa.
        radius = Double.parseDouble(sRadius);
        height = Double.parseDouble(sHeight);

        //Create objects for sphere, cylinder, cone;
        Sphere sphere = new Sphere(radius);
        Cylinder cylinder = new Cylinder(radius, height);
        Cone cone = new Cone(radius, height);


        System.out.printf("Sphere Volume is:        %5.2f\n", sphere.sphereVolume());
        System.out.printf("Sphere Surface area is:  %5.2f\n", sphere.sphereSurface());
        System.out.printf("Cylinder Volume is:      %5.2f\n", cylinder.cylinderVolume());
        System.out.printf("Cylinder Surface is:     %5.2f\n", cylinder.cylinderSurface());
        System.out.printf("Cone Volume is:          %5.2f\n", cone.coneVolume());
        System.out.printf("Cone Surface is:         %5.2f\n", cone.coneSurface());

    }


    public static boolean dub_test(String toTest){
        //Code to return true/false for is a double.
        try{
            Double tester = Double.parseDouble(toTest);
            return true;
        }
        catch(NumberFormatException ex){
            return false;
        }
    }
}