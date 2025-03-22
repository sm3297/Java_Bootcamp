package StepC;
import java.util.Scanner;

public class C11{
    public static void main(String[] args) {
        C11 stepC = new C11();
        stepC.c11();
    }

    void c11(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a year > ");
        int year = s.nextInt();

        if(((year % 4 == 0) && (!(year % 100 == 0)) || (year % 400 == 0))) 
            System.out.println("This year is leap year");

        else 
            System.out.println("This year is not leap year");

        s.close();

    }
}