import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        int numberOfOpinionShappers = sc.nextInt();


        String output = new String();
        for(int i = 0; i<numberOfOpinionShappers; i++){
            int opinion = sc.nextInt();
            if(opinion == 1){
                 output = "HARD";
                break;


            }

            else
                 output = "EASY";
        //ArrayList <Integer> opinions = new ArrayList();

//        int i = 0;
//        while(opinions.size()<numberOfOpinionShappers){
//
//            opinions.add(i) = sc.nextInt();
//            i++;
        }
        System.out.println(output);
    }
}
