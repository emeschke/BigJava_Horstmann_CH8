package P8_11;

import com.sun.org.apache.xerces.internal.xs.StringList;
import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 3:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class Letter {
    //Store the body of the letter, the sender and the receiver.
    private ArrayList<String> letterBodys = new ArrayList<String>();
    private String sender;
    private String receiver;

    //Constructor for the letter.
    public Letter(String from, String to){
        this.sender = from;
        this.receiver = to;
    }

    //Add line to the letter.
    public void addLine(String line){
        letterBodys.add(line);
    }

    public String getText(){

        //Create a string of the salutation, a blank line, then loop through the String array and add each element
        // as a new line then add another blank line, the closing salutation, another blank line and the sender's name.
        String letter = ("Dear " + sender + ":\n\n");
        for (int i = 0; i <letterBodys.size() ; i++) {
            letter += letterBodys.get(i) + "\n";
        }
        letter += ("\nSincerely\n\n" + sender);
        return letter;

    }
}

