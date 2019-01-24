import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int coalForBasicCarriages = sc.nextInt();
        int capacityOfCoalsCarriages = sc.nextInt();
        int coalForOneCoalsCarriage = sc.nextInt();

        int howMuchCoalToBasicCarriagesForOneCarriageOfCoal = capacityOfCoalsCarriages - coalForOneCoalsCarriage;


        if(howMuchCoalToBasicCarriagesForOneCarriageOfCoal>0){
            int howMuchCarriages = coalForBasicCarriages/howMuchCoalToBasicCarriagesForOneCarriageOfCoal;

            if(howMuchCarriages*howMuchCoalToBasicCarriagesForOneCarriageOfCoal != coalForBasicCarriages)
                howMuchCarriages++;
            System.out.println(howMuchCarriages);
        }
        else
            System.out.println("-1");
    }
}
