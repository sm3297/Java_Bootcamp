package StepD;
import java.util.Scanner;

public class D01{
    public static void main(String[] args) {
        D01 stepD = new D01();
        stepD.d01();
    }

    void d01(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number > ");
        int number = s.nextInt();
        int totalsum = 0;

        if(number <= 1) System.out.println("Invalid input");

        else{
            for(int i=1; i<=number; i++) totalsum += i;
            System.out.println("The sum of all integer from 1 to the number entered is "+totalsum+"");
        }
        
        s.close();
    }
}
    

