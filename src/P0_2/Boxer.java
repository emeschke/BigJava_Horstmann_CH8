package P0_2;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: ag
 * Date: 9/18/13
 * Time: 7:13 PM
 * To change this template use File | Settings | File Templates.
 */
public class Boxer {


    private static final int MAX_HIT_POINTS = 100;
    private static final String[] EXCLAMS = {"I'm the greatest", "Float like a butterfly, sting like a bee", "Victory is mine", "Haahaahahaha, I win.", "Adrian!"};
    //Each boxer has the following properties; accuracy, strength, hit-points, name, exclamation.
    private double mAccuracy;   //percentage
    private int mStrength;      //how strong is the fighter, as in much does it sting when he connects  1-5
    private int mHitPoints;     //initialize to 100
    private String mName;  //fighters name
    private Random mRandom;


    public Boxer(String name, int strength, double accuracy) {
        mName = name;
        mStrength = strength;
        mAccuracy = accuracy;
        mRandom = new Random();
    }


    public void swing(Boxer boxPunchee){

      if (mRandom.nextInt(10) * mAccuracy > 3){
          boxPunchee.setHitPoints(boxPunchee.getHitPoints() - mStrength);
      }

    }

    public boolean isKO(){
        return mHitPoints <= 0;
    }

    public String win(){
        return mName + " wins: " + EXCLAMS[mRandom.nextInt(EXCLAMS.length)];
    }


    //getters and setters
    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    public int getHitPoints() {
        return mHitPoints;
    }

    public void setHitPoints(int hitPoints) {
        mHitPoints = hitPoints;
    }

    public int getStrength() {
        return mStrength;
    }

    public void setStrength(int strength) {
        mStrength = strength;
    }

    public double getAccuracy() {
        return mAccuracy;
    }

    public void setAccuracy(double accuracy) {
        mAccuracy = accuracy;
    }
}


