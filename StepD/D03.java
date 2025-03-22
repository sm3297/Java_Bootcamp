package StepD;
import java.util.Scanner;

public class D03{
    public static void main(String[] args) {
        D03 stepD = new D03();
        stepD.d03();
    }

    void d03(){
        Scanner s = new Scanner(System.in);

        int number; 
        int count = 0; 
        int totalsum = 0; 
        double average; 

        while(true){
            System.out.print("Enter a number from 0 to 100 > ");
            number = s.nextInt();
            if(number > 100) break;

            totalsum += number;
            count++;

        }

        average = (double)totalsum / count;

        System.out.printf("The sum of %d numbers is %d, average is %.1f\n",count, totalsum,average);
        
        s.close();
    }
}
    

