package StepC;
import java.util.Scanner;

public class C02{
    public static void main(String[] args) {
        C02 stepC = new C02();
        stepC.c02();
    }

    void c02(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter water temperature > ");
        double input_degree = s.nextDouble();
        
        if(input_degree >= 80) System.out.println("It's boiling water");
        else if(input_degree >= 40) System.out.println("It's hot water");
        else if(input_degree >= 25) System.out.println("It's warm water");
        else if(input_degree >= 0) System.out.println("It's cold water");
        else System.out.println("Invalid input!");

        s.close();
    }
}
    

