import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] array = new int[n];
        int[] arrayOfHouseNumbers = new int[n];
        //int checker = 0;
        //int addNumbers = 0;
        for (int i = 0; i < n; i++) {

            //read next numbers
            array[i] = sc.nextInt();
            //make a list of houses
            arrayOfHouseNumbers[i] = i + 1;




//            //I want to check is array[i] equal to any element of arrayOfHouseNumbers
//
//            for (int j = 0; j < n; j++)
//                if (array[i] == arrayOfHouseNumbers[j]) {
//
//                    //if pair exists arrayOfHouseNumbers is 0 (and it's mark)
//                    arrayOfHouseNumbers[j] = 0;
//
//                }

        }
                //sort the array from output
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
                //check is equal



        //System.out.println((Arrays.equals(array, arrayOfHouseNumbers)));


        if ((Arrays.equals(array, arrayOfHouseNumbers)) == true)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

//            for (int i = 0; i < n; i++) {
//
//                checker += arrayOfHouseNumbers[i];
//                System.out.println(checker);
//
//            }



//
//            if (checker == 0) {
//                System.out.println("YES");
//            } else {
//                System.out.println("NO");
//            }


        }


    }







