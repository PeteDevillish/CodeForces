import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] leftWall = (sc.nextLine()).split("");
        String [] rightWall = (sc.nextLine()).split("");



        int manaveur = 0;

        if(!(leftWall[0].equals("|") && rightWall[0].equals("|"))){
        for(int i = 1; i<leftWall.length; i++) {
            if (leftWall[i].equals("|") && rightWall[i].equals("|")) {
                manaveur = -1;
                break;
            } else if (leftWall[i].equals("|") && rightWall[i - 1].equals("|")) {
                manaveur++;}

                else if (leftWall[i - 1].equals("|") && rightWall[i].equals("|")) {
                    manaveur++;
                }

            }
        }
        else
            manaveur = -1;
        System.out.println(manaveur);
    }
}
