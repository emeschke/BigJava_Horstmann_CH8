package P8_14;

import java.nio.file.spi.FileSystemProvider;
import java.util.InputMismatchException;
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

        System.out.printf("Sphere Volume is:        %5.2f\n" , Geometry.sphereVolume(radius));
        System.out.printf("Sphere Surface area is:  %5.2f\n" , Geometry.sphereSurface(radius));
        System.out.printf("Cylinder Volume is:      %5.2f\n" , Geometry.cylinderVolume(radius,height));
        System.out.printf("Cylinder Surface is:     %5.2f\n" , Geometry.cylinderSurface(radius, height));
        System.out.printf("Cone Volume is:          %5.2f\n" , Geometry.coneVolume(radius, height));
        System.out.printf("Cone Surface is:         %5.2f\n" , Geometry.coneSurface(radius, height));

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