import java.util.*;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int roadNodes = sc.nextInt();
	int archs = sc.nextInt();
	int nodeToAttack = sc.nextInt();
    int [] first = new int [archs];
    int []second = new int [archs];

        //Map<Integer, Integer>  = new TreeMap<>();

        for(int i = 0; i<archs; i++){
	     first[i] = sc.nextInt();
	     second[i] = sc.nextInt();
            if(first[i] == nodeToAttack )
                first[i] = 0;
           // second[i] = 0;
            if(second[i] == nodeToAttack)
           //     first[i] = 0;
            second[i] =0;

	}

        for(int i = 0; i<archs; i++){
if(first[i] == 0)
    second[i] = 0;
if (second[i] == 0)
    first[i] = 0;
        }






        System.out.println(roadNodes);
        System.out.println(archs);
        System.out.println(nodeToAttack);
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));
        }


}
