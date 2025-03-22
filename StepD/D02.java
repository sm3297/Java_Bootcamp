package StepD;
import java.util.Scanner;

public class D02{
    public static void main(String[] args) {
        D02 stepD = new D02();
        stepD.d02();
    }

    void d02(){
        Scanner s = new Scanner(System.in);
        int number = 0;
        int max_num = 0;
        int min_num = 100;

        while(true){
            System.out.print("Enter a number > ");
            number = s.nextInt();
            if(number > 100) break;

            if(max_num < number) max_num = number;
            if(min_num > number) min_num = number;
        }

        System.out.println("Max number is "+max_num+", Min number is "+min_num+"");
        
        s.close();
    }
}
    

