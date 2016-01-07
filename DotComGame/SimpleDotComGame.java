package DotComGame;

/**
 * Created by runyyf on 2016-01-04.
 */
public class SimpleDotComGame {

    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] targetArray = new int[3];

        for (int i=0;i<targetArray.length;i++){
            targetArray[i] = (int)(Math.random()*10);
        }

        String result = dot.checkYourself("2");

    }
}
