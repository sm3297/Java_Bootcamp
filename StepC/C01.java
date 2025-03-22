package StepC;
import java.util.Scanner;

public class C01{
    public static void main(String[] args) {
        C01 stepC = new C01();
        stepC.c01();
    }

    void c01(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a birth year > ");
        int birth_year = s.nextInt();

        int age = 2024 - birth_year + 1;
        
        if(age >= 60) System.out.println("You are old age");
        else if(age >= 30) System.out.println("You are middle-age");
        else if(age >= 20) System.out.println("You are youth");
        else if(age >= 13) System.out.println("You are teenage");
        else if(age >= 7) System.out.println("You are child");
        else System.out.println("You are baby");

        s.close();
    }
}
    

