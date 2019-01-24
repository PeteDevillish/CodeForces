import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bracketsAndQuestionMarks = sc.nextLine();


        int integerLength = bracketsAndQuestionMarks.length();
        double doubleLength = bracketsAndQuestionMarks.length();


        String answer = new String();


        if(doubleLength/2 - integerLength/2 != 0){


            answer ="No";

        }


else if(doubleLength/2 - integerLength/2 == 0)
        {
int g= 2;
            for(int j = integerLength; j>1; j/=g ) {
                String[] bracketOrQuestionMark = bracketsAndQuestionMarks.split("");
                for (int i = 0; i < (j / 2); i++) {
                        g*=2;
                    //trza tu troche zmienic
                    for(int x = g; x>0; x--) {
                        if (!((bracketOrQuestionMark[i].equals("(") || bracketOrQuestionMark[i].equals("?"))
                                && (bracketOrQuestionMark[j - 1 - i].equals(")") || bracketOrQuestionMark[j - 1 - i].equals("?")))) {
                            answer = "No";
                            break;
                        }

                        //nie sprawdza drugiej polowy


                        //gdzies tutaj zmain


                        else
                            answer = "Yes";
                    }

                }
            }
        }


        System.out.println(answer);


    }
}
