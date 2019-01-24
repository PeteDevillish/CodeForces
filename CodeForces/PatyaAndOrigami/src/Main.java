import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //friends
        int n = sc.nextInt();
        //ilosc kartek
        int k = sc.nextInt();
//        two red sheets, five green sheets, and eight blue sheets.
//3 5           k


        int numberOfNotebooks =  (n*8)/k;
        //double checker = (n*8)/k;
        if ((n*8 %k !=0) )
        //if(numberOfNotebooks != checker)
            numberOfNotebooks++;
        int minNumberOfNootebooks = numberOfNotebooks;
//        //////////////////////////////////////

         numberOfNotebooks = (n*5)/k;
        //checker = (n*5)/k;
        //if(numberOfNotebooks != checker)
        if((n*5) % k != 0)
            numberOfNotebooks++;
        minNumberOfNootebooks += numberOfNotebooks;

        ////////////////////////////////////////
        numberOfNotebooks = (n*2)/k;
        //checker = (n*2)/k;
        //if(numberOfNotebooks != checker)
        if((n*2) % k != 0)
        numberOfNotebooks++;
        minNumberOfNootebooks += numberOfNotebooks;



        System.out.println(minNumberOfNootebooks);

    }
}
