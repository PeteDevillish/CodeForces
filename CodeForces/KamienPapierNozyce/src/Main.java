import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int Ciel = 0;
        int Manao = 0;
        String result = "Remis";
        int n = sc.nextInt();
        while (sc.hasNextLine()){

            String k = sc.nextLine();

            if(k.equals("KN") || k.equals("NP") || k.equals("PK")){
                Ciel++;
            }

            else if (k.equals("NK") || k.equals("PN") || k.equals("KP")){
                Manao++;
            }

            if(Ciel>Manao+1){
                result ="Ciel";
                break;
            }

            else if(Ciel+1<Manao){
             result ="Manao";
             break;
            }

        }


            System.out.println(result);



    }




}