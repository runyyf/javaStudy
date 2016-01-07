package DotComGame;

/**
 * Created by runyyf on 2016-01-04.
 */
public class DotComGameTest {
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};

        //dot.setLocalCells(locations);
        String userGuess = "2";

        String result = dot.checkYourself(userGuess);
        result = dot.checkYourself("4");
        result = dot.checkYourself("3");
    }
}
