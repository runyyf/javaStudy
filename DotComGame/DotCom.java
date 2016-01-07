package DotComGame;

import java.util.ArrayList;

/**
 * Created by runyyf on 2016-01-05.
 */
public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> locs){
        locationCells = locs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String checkYourself(String userInput){
        String result = "miss" ;
        int index = locationCells.indexOf(userInput);
        if (index>= 0){
            locationCells.remove(index);
            if (locationCells.isEmpty()){
                result = "kill";
            }else {
                result = "hit";
            }

        }
        return  result;

    }


}
