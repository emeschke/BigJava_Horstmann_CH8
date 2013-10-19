package P8_4;

/**
 * Created with IntelliJ IDEA.
 * User: E
 * Date: 10/18/13
 * Time: 12:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class Address {

    private String shouseNum;
    private String street;
    private String aptNum = "";
    private String city;
    private String state;
    int zip;

    //Declare two constructors, one with a spot for the aptNum and one without that spot.  Check that the zip code is
    //valid (between 10000 and 99999)
    public Address(String house, String streetInput, String cityInput, String stateInput, int zipInput){
        if (zipInput < 10000 || zipInput >99999 ) {
            throw new IllegalArgumentException("Zip code not in range: " + zipInput);
        }
        shouseNum = house;
        street = streetInput;
        city = cityInput;
        state = stateInput;
        zip = zipInput;

    }

    public Address(String house, String streetInput, String aptNumInput, String cityInput, String stateInput, int zipInput){
        if (zipInput < 10000 || zipInput >99999 ) {
            throw new IllegalArgumentException("Zip code not in range: " + zipInput);
        }
        shouseNum = house;
        street = streetInput;
        aptNum = aptNumInput;
        city = cityInput;
        state = stateInput;
        zip = zipInput;

    }

    //Method prints the address.
    public void printAddress(){
        System.out.println(shouseNum + " " + street + " " + aptNum);
        System.out.println(city + " " + state + " " + zip);
    }

    //Method returns a boolean based on whether the one comes before the other.
    public boolean comesBefore(Address other){
        //System.out.println(other.zip);
        if (zip < other.zip){
            return true;
        }
        else return false;
    }
}
