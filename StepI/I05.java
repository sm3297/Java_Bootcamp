package StepI;
import java.util.Scanner;

public class I05{
    public static void main(String[] args) {
        I05 StepI = new I05();
        StepI.i05();
    }

    void i05(){ 

        int max_num = 0;
        System.out.println("Find the maximum value of 10 numbers");
        max_num = MaxOfTen();

        System.out.printf("\nMaximum value is %d\n", max_num);
    }

    int MaxOfTen(){

        Scanner s = new Scanner(System.in);

        int max = -1;
        int num = 0;
        int i = 0;

        while(true){
            System.out.printf("Enter %dth number > ", i+1);
            num = s.nextInt();

            if(num > max) max = num;

            if(i==9)
                return max;

            i++;
        }
        
    }
}