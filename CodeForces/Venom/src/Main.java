import java.io.*;
import java.util.*;


public class Main{
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();
        out = new PrintWriter(new BufferedOutputStream(System.out));


        int quantityOfVenoms = sc.nextInt();
        int quantityOfPositions = sc.nextInt();

        int [] numberOfVenom = new int[quantityOfVenoms];


        for(int i = 0; i<quantityOfVenoms; i++)
        {
            numberOfVenom[i] = sc.nextInt();
            // otherSymbiots [i] = numberOfVenom[i];
        }

        //System.out.println(Arrays.toString(numberOfVenom));





        for (int i = 0; i<quantityOfPositions; i++){
            int position = sc.nextInt();
            int [] otherSymbiots = new int[quantityOfVenoms - position +1];

            for (int j = 0; j<quantityOfPositions-position +1; j++) {
                otherSymbiots [j] = numberOfVenom[j+position-1];
            }
            Arrays.sort(otherSymbiots);
            // System.out.println(Arrays.toString(otherSymbiots));



            int differentSymbiots = 1;


            for(int j = 1; j<quantityOfPositions-position + 1; j++){
                if(otherSymbiots[j-1] != otherSymbiots[j]){
                    differentSymbiots++;

                }
            }

            System.out.println(differentSymbiots);

            //for (int j = 0; j<quantityOfPositions-position; j++){
            //                if(otherSymbiots[j] != otherSymbiots[j+1]&&numberOfVenom[position] != numberOfVenom[j]){
//            for (int j = position + 1; j<quantityOfPositions; j++){
//            if(numberOfVenom[position] != numberOfVenom[j]){
//
//                //System.out.println(otherSymbiots);
//            }
//        }
            //System.out.println(Arrays.toString(otherSymbiots));
            // System.out.println(position);
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