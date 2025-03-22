package StepF;
import java.util.Scanner;

public class F02 {
    public static void main(String[] args) {
        F02 StepF = new F02();
        StepF.f02();
    }

    void f02(){

        Scanner s = new Scanner(System.in);

        double score[] = new double[10];
        float maxscore = 0.0F;
        float minscore = 10.0F;
        float total = 0.0F;
        float average = 0.0F;
        //float newnum;

        int i;

        for(i=0; i<10; i++){
            System.out.printf("Enter %dth score > ",i+1);
            
            score[i] = s.nextDouble();

            if(score[i] > maxscore) maxscore = (float)score[i];
            if(score[i] < minscore) minscore = (float)score[i];

            total += score[i];
            
        }

        total = total - maxscore - minscore;
        average = total / 8;

        System.out.printf("Average is %.1f\n",average);

        s.close();

    }
}
