package P8_9;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/19/13
 * Time: 4:05 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {
    public static void main(String[] args) {
        //Driver will initialize the lock with three random numbers and then test all possible combos to find the one that
        // opens the lock.  It will then print out the secret numbers and the ticks right and left and right that open the
        //lock.  To check that it is actually looping through all the numbers uncomment line 24 and it prints out the
        //first number of the loop.  It tries some negative numbers too to make sure it doesn't open with weird negative
        //values.
        int firstNum = (int) (Math.random()*40);
        int secondNum = (int) (Math.random()*40);
        int thirdNum = (int) (Math.random()*40);

        System.out.println("Secret code is: " + firstNum + " " + secondNum + " " + thirdNum);

        ComboLock1 lock = new ComboLock1(firstNum, secondNum, thirdNum);
        System.out.println("Running lock cracker:");
        for (int i = -1; i <45 ; i++) {
            //System.out.println("Checking first number " + i);
            for (int j = -1; j <45 ; j++) {
                for (int k = -1; k <45 ; k++) {
                    lock.reset();
                    lock.turnRight(i);
                    lock.turnLeft(j);
                    lock.turnRight(k);
                    if(lock.open() == true){
                        System.out.println(i + " right, " + j + " left, " + k + " right.");
                    }
                }

            }

        }
    }
}