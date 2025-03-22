package StepC;
import java.util.Scanner;

public class C08{
    public static void main(String[] args) {
        C08 stepC = new C08();
        stepC.c08();
    }

    void c08(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter first number > ");
        int num1 = s.nextInt();

        System.out.print("Enter second number > ");
        int num2 = s.nextInt();

        System.out.print("Enter third number > ");
        int num3 = s.nextInt();

        int max_num = 0;
        int min_num = 100;

        int num[] = new int [3];
        num[0] = num1;
        num[1] = num2;
        num[2] = num3;

        for(int i=0; i<3; i++)
            if(num[i] > max_num) max_num = num[i];
        
        for(int i=0; i<3; i++)
            if(num[i] < min_num) min_num = num[i];
        
        System.out.println("Max number is "+max_num+", Min number is "+min_num+"");

        s.close();

    }
}