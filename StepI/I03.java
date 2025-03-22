package StepI;
import java.util.Scanner;

public class I03 {
    public static void main(String[] args) {
        I03 StepI = new I03();
        StepI.i03();
    }

    void i03(){

        Scanner s = new Scanner(System.in);

        int h = 0;
        int w = 0;

        for(int i=0; i<10; i++){
            System.out.print("Enter height(cm) and weight > ");
            h = s.nextInt();
            w = s.nextInt();
            AskBiman(h, w);
        }

        s.close();

    }

    void AskBiman(int height, int weight){

        float bmi = weight / (float)Math.pow((height*0.01),2);

        if(bmi >= 30) System.out.println("You are high obesity");
        else if (bmi >= 25) System.out.println("You are obesity");
        else if (bmi >= 23) System.out.println("You are overweight");
        else if (bmi >= 18.5) System.out.println("You are normal weight");
        else System.out.println("You are low weight");
        System.out.println();
    }

}