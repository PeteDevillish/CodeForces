import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialNumber = sc.nextInt();
        int numberToSubstraction = sc.nextInt();

        for(int i = 0; i<numberToSubstraction;i++){
            if(initialNumber % 10 == 0){
                initialNumber=initialNumber/10;
            }
            else
                initialNumber-=1;
        }

        System.out.println(initialNumber);
    }
}
