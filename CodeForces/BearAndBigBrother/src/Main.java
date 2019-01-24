import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int LimaksWeigh = sc.nextInt();
        int BobsWeigh = sc.nextInt();

        int howManyYears = 0;
        while(LimaksWeigh<=BobsWeigh){
            LimaksWeigh*=3;
            BobsWeigh*=2;
            howManyYears++;
        }
        System.out.println(howManyYears);

    }
}
