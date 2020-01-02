package basic.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class demo1 {
    public static void main(String[] args) {
        String demoString = "Pygmalion King of Cyprus was a famous sculptor He made an ivory image of a woman so lovely that he fell in love with it Every day he tried to make Galatea up in gold andpurple for that was the name he had given to this mistress of his heart";
        List<String> stringArr = Arrays.asList(demoString.split(" "));

        long count = 0;
        for (String s : stringArr) {
            if(s.length() > 5){
                count++;
            }
        }

        long count2 = stringArr.stream().filter(w -> w.length() > 5).count();
        System.out.println(count);
        System.out.println(count2);

        int[] demoArr = {1, 2, 3};
        Stream.of(demoArr);
    }
}
