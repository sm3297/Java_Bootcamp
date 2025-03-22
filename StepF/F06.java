package StepF;
import java.util.Scanner;

public class F06 {
    public static void main(String[] args) {
        F06 StepF = new F06();
        StepF.f06();
    }

    void f06(){

        Scanner s = new Scanner(System.in);

        int number[][] = new int[5][3];
        //int newnum;
        int total = 0;
        //int ho;
        int i,j;

        for(i=0; i<5; i++){
                for(j=0; j<3; j++){
                System.out.printf("Enter number of people in room %d0%d > ",i+1, j+1);
                number[i][j] = s.nextInt();

                total += number[i][j];
            }
        }

        System.out.printf("Number of people living in this apartment is %d\n",total);

        s.close();

    }
}
