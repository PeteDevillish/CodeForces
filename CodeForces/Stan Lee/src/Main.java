import java.io.BufferedOutputStream;
import java.io.PrintWriter;
import java.io.*;
import java.util.*;








public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));

        //sczytanie liczby oznaczajacej ilosc liczb w tablicy na ktorej beda wykonywane dzialania
        int n = sc.nextInt();
        //sczytanie liczby oznaczającej ilosć zestawow instrukcji do wykonania
        int k = sc.nextInt();


        int [] liczbyA = new int [n];

        //sczytanie tablicy o wielkosci n z liczbami na ktorych wykonywane beda operacje

        for(int i = 0; i<n; i++){
            liczbyA[i] = sc.nextInt();
        }

       // void reader(int begging, int theEnd, int numberToAdd)


        //int [][]instrukcje = new int[k][3];
//        int begging = 0;
//        int theEnd = 0;
//        int numberToAdd = 0;

        //sczytanie k 3 elementowych zestawow instrukcji do wykonania
        for(int i = 0; i<k; i++){

//            begging = sc.nextInt();
//            theEnd = sc.nextInt();
//            numberToAdd = sc.nextInt();

            for(int x = begging - 1; x<=theEnd-1; x++){

                liczbyA[x] += numberToAdd;


            }






        }






        for(int i = 0; i<n; i++){
            System.out.println(liczbyA[i]);
        }

        // Start writing your solution here. -------------------------------------

      /*
      int n      = sc.nextInt();        // read input as integer
      long k     = sc.nextLong();       // read input as long
      double d   = sc.nextDouble();     // read input as double
      String str = sc.next();           // read input as String
      String s   = sc.nextLine();       // read whole line as String

      int result = 3*n;
      out.println(result);                    // print via PrintWriter
      */

        // Stop writing your solution here. -------------------------------------
        out.close();
    }



    //-----------PrintWriter for faster output---------------------------------
    public static PrintWriter out;

    //-----------MyScanner class for faster input----------
    public static class MyScanner {
        BufferedReader br;
        StringTokenizer st;

        public MyScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine(){
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }

    }
    //--------------------------------------------------------
}

public class Instrukcja {


}