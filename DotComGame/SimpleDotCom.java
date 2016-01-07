package DotComGame;

import java.util.ArrayList;

/**
 * Created by runyyf on 2016-01-04.
 */
public class SimpleDotCom {

    private ArrayList<String> locationCells ;
    private int hitsNum = 0 ;

    public int getHitsNum() {
        return hitsNum;
    }

    public void setLocalCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public String checkYourself(String stringGuess){
        String result = "miss";
        int index = locationCells.indexOf(stringGuess);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }

        }
        System.out.println(result);
        return result;
    }

}
