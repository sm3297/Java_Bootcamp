package StepF;
import java.util.Scanner;

public class F04 {

    public static void main(String[] args) {
        F04 StepF = new F04();
        StepF.f04();
    }

    void f04(){

        Scanner s = new Scanner(System.in);

        int jumsu[][] = new int[5][3];
        int sum[] = new int[5];
        double average[] = new double[5];
        int i,j;

        for(i=0; i<5; i++){
            System.out.printf("Enter Korean, English, Math score of %dth student > ", i+1);
            for(j=0; j<3; j++){
                jumsu[i][j] = s.nextInt();
                sum[i] += jumsu[i][j];
            }
            average[i] = sum[i] / 3.0;
        }

        for(i=0; i<5; i++)
            System.out.printf("Total score of %dth student is %d, average is %.1f\n",i+1, sum[i], average[i]);

        s.close();

    }

}
