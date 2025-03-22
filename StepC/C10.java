package StepC;
import java.util.Scanner;

public class C10{
    public static void main(String[] args) {
        C10 stepC = new C10();
        stepC.c10();
    }

    void c10(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number1 > ");
        int num1 = s.nextInt();

        System.out.print("Enter number2 > ");
        int num2 = s.nextInt();

        System.out.print("Enter a math symbol('+', '-', '*', '/') ");
        String operator = s.next();

        int result = 0;

        if(operator.equals("+")) result = num1 + num2;
        if(operator.equals("-")) result = num1 - num2;
        if(operator.equals("*")) result = num1 * num2;
        if(operator.equals("/")) result = num1 / num2;
        
        System.out.println("Result is "+result+"");

        s.close();

    }
}