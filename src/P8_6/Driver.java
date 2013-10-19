package P8_6;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 2:29 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {

    //Driver haha, no pun intended.
    public static void main(String[] args) {
        Car camaro = new Car(10);

        //Make a loop that fills up with 20 gallons if the tank is empty, otherwise it drives a random number of miles
        //<75.
        for (int i = 0; i <10 ; i++) {
            //Add gas if the tank is empty (initially.)
            if (camaro.getGasLevel() == 0){
                System.out.println("Filling up the gas tank with 20 gallons.");
                camaro.addGas(20);
            }

            //Take a trip of <75 miles.
            double tripLength = Math.random()*75;
            System.out.printf("Taking a %.1f mile trip.\n", tripLength);
            camaro.drive(tripLength);

            //Check if tank is empty, if so fill it up with 20 gallons.
            if(camaro.getGasLevel() == 0){
                System.out.println("Ran out of gas on the trip.  Adding 20 gallons.");
                camaro.addGas(20);
            }
            else System.out.println("Successful trip.");
        }

    }
}
