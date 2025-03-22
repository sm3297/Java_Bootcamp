// 실행 예시 없음
package StepC;
import java.util.Scanner;

public class C09{
    public static void main(String[] args) {
        C09 stepC = new C09();
        stepC.c09();
    }

    void c09(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter income > ");
        int income = s.nextInt();

        int tax = 0;

        if(income > 8 * Math.pow(10,7)) tax = (int)(income * 0.37);
        else if(income > 4 * Math.pow(10,7) ) tax = (int)(income * 0.28);
        else if(income > 1 * Math.pow(10,7) ) tax = (int)(income * 0.19);
        else tax = (int)(income * 0.095);
        
        System.out.println("tax : "+tax+"");

        s.close();

    }
}