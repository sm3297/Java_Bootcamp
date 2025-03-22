package StepJ;
import java.util.Scanner;

public class J09 {
    public static void main(String[] args) {
        J09 StepJ = new J09();
        StepJ.j09();
    }

    void j09(){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter two numbers > ");
        int num_1 = s.nextInt();
        int num_2 = s.nextInt();
        System.out.printf("%d square of %d is %d\n",num_2,num_1,power(num_1,num_2));

        s.close();

    }

    int power(int num1, int num2){

        if(num2 == 0) 
            return 1;
        else if(num2 == 1) 
            return num1;
        else if(num2 > 0 && num2 % 2 == 0 )
            return power(num1, num2/2) * power(num1, num2/2);
        else 
            return power(num1, num2/2) * power(num1, num2/2) * num1;

    }
}
