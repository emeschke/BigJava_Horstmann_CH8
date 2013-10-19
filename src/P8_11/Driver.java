package P8_11;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 3:33 PM
 * To change this template use File | Settings | File Templates.
 */
public class Driver {

    public static void main(String[] args) {
        Letter dearJohn = new Letter("John", "Mary");
        dearJohn.addLine("I am sorry we must part.");
        dearJohn.addLine("I wish you all the best.");
        System.out.println(dearJohn.getText());
    }

}
