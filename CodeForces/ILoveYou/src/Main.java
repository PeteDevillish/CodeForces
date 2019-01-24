import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                String messageToKyung = sc.nextLine();


                boolean [] loveArray = new boolean[5];
                String [] syllable = messageToKyung.split("-");
        //System.out.println(messageToKyung);
        //System.out.println(Arrays.toString(syllable));

       int differentSyllable = 0;
        for (String oneSyllable : syllable) {
            //System.out.println(oneSyllable);
            if(oneSyllable.equals("sah")){
                loveArray[0] = true;

            }
            else
                if(oneSyllable.equals("rahn")){
                loveArray[1] = true;
            }
            else
            if(oneSyllable.equals( "gh")){
                loveArray[2] = true;
            }
            else
            if(oneSyllable.equals("aee")){
                loveArray[3] = true;
            }
            else
            if(oneSyllable.equals( "yoh")){
                loveArray[4] = true;
            }
            else
                differentSyllable++;

        }
        //System.out.println(Arrays.toString(loveArray));


if(differentSyllable<3 && Arrays.toString(loveArray).equals("[true, true, true, true, true]")){
            System.out.println("Yes");


    }

    else
    System.out.println("No");
}
}
