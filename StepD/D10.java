package StepD;
import java.util.Scanner;

public class D10 {
    public static void main(String[] args) {
        D10 StepD = new D10();
        StepD.d10();
    }

    void d10(){
        Scanner s = new Scanner(System.in);

        int i;

        System.out.print("Enter two numbers > ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();

        for(i=1 ; i<=100 ; i++){

            if(i % num1 == 0 || i % num2 == 0){
                if(i % num1 == 0 && i % num2 == 0) continue;
                System.out.printf("%-3d",i);
            }
            else continue;

            s.close();
        } 

       
    }
}
