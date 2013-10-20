package P8_9;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 3:10 PM
 * To change this template use File | Settings | File Templates.
 *
There was a lively debate on Piazza about how a combo lock works.  For the purposes the class below, the following four
 operations must occur sequentially:
 --the lock is reset
 --the lock is turned to the right to secret number 1
 --the lock is turned to the left to secret number 2
 --the lock is turned to the right to secret number 3

 If only those operations occur, then lock the open method will return true.  If any other combination of operations
 occurs, the open method will return false.

*/
public class ComboLock1 {
    private int[] secretCombos = new int[4];
    private boolean[] tries = {false, false, false, false};
    private int count;


    //Constructor makes lock.
    public ComboLock1(int secret1, int secret2, int secret3){
        secretCombos[1] = secret1;
        secretCombos[2] = secret2;
        secretCombos[3] = secret3;
    }

    //Reset the variables that track the progress of opening the lock.  tries is set/reset to false and count to 0.
    public void reset(){
        count = 0;
        for (int i = 1; i < 4; i++) {
            tries[i] = false;
        }
    }

    //The only way the lock will open is if three operations have happened after the reset (r,l,r so count = 3) which we
    // test in the functions below.
    public boolean open(){
        if(tries[1] == true && tries[2] == true && tries[3] == true){
            return true;
        }
        else return false;
    }

    //turnRight will increment count and put values in tries[1] or tries[3] only if count = 1 or 3 and the ticks value
    // matches the number of ticks to the next secret Number.
    public void turnRight(int ticks){
        count += 1;
        //Check the first turn.
        if (count == 1 && ticks == secretCombos[1]){
            tries[1] = true;
        }
        //Check the third turn.
        if (count == 3){
            //Figure out the value to compare between to the ticks, either the turn to the right or a wrap around of the
            //secret combos from 2 to 3.
            int turn = 0;
            if (secretCombos[2] < secretCombos[3]){
                turn = secretCombos[3] - secretCombos[2];
            }
            else {
                turn = 40 - secretCombos[2] + secretCombos[3];
            }
            if(turn == ticks){
                tries[3] = true;
            }
        }
    }

    //turnLeft works similarly to turnRight, except there is only the one operation to address.  Conditions on the wrap
    //around are reversed because we are moving from right to left on the dial.
    public void turnLeft(int ticks){
        count += 1;
        if (count == 2 ){
            int turn = 0;
            if (secretCombos[1] > secretCombos[2]){
                turn = secretCombos[1] - secretCombos[2];
            }
            else{
                turn = secretCombos[1] + 40 - secretCombos[2];
            }
            if (turn == ticks){
                tries[2] = true;
            }
        }
    }
}