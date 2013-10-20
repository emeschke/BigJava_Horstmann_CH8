package P8_4;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 1:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {
        //Initialize two addresses
        Address firstAddress = new Address("1802", "W Melrose", "Apt 1", "Chicago", "IL", 60657);
        Address secondAddress = new Address("1508", "22nd ave", "Longview", "WA", 98632);

        //Call methods to print the addresses
        firstAddress.printAddress();
        System.out.println();
        secondAddress.printAddress();
        System.out.println();

        //Compare and print the comparison of the two addresses.
        System.out.println("First address comes before second address: " + firstAddress.comesBefore(secondAddress));
        System.out.println("Second address comes before first address: " + secondAddress.comesBefore(firstAddress));


    }
}
