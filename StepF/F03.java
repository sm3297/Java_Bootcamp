package StepF;
import java.util.Scanner;

public class F03 {
    public static void main(String[] args) {
        F03 StepF = new F03();
        StepF.f03();
    }

    void f03(){

        Scanner s = new Scanner(System.in);

        int jumsu[][] = new int[5][3];
        int sum[] = new int[3];
        double average[] = new double[3];
        String kind[] = {"Korean" , "English", "Math"};
        int i,j;

        for(i=0; i<5; i++){
            System.out.printf("Enter Korean, English, Math score of %dth student > ", i+1);
            
            for(j=0; j<3; j++){
                
                jumsu[i][j] = s.nextInt();

                sum[j] += jumsu[i][j];
            }
        }

        for(i=0; i<3; i++){
            average[i] = sum[i] / 5.0;
            System.out.printf("Total %s score is %d, average is %.1f\n",kind[i],sum[i], average[i]);
        }

        s.close();

    }
}
