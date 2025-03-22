package StepF;
import java.util.Scanner;

public class F05 {
    public static void main(String[] args) {
        F05 StepF = new F05();
        StepF.f05();
    }

    void f05(){

        Scanner s = new Scanner(System.in);

        float bmilist[][] = new float[10][3];
        int count = 0;
        int i;

        for(i=0; i<10; i++){
            System.out.print("Enter height(cm) and weight(kg) ");
            bmilist[i][0] = s.nextInt();
            bmilist[i][1] = s.nextInt();

            bmilist[i][2] = (float)(bmilist[i][1]  / Math.pow((bmilist[i][0] * 0.01),2));
            if(bmilist[i][2] >= 25) count++;    
        }
 
        for(i=0; i<10; i++){
            if(bmilist[i][2] >= 25)
                System.out.printf("%dth person is obesity\n",i+1);
        }

        System.out.printf("%d people is obesity\n",count);

        s.close();

    }
}
