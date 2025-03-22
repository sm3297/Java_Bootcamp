package StepH;
import java.util.Scanner;
import java.lang.Math;

public class H06 {
    public static void main(String[] args) {
        H06 StepH = new H06();
        StepH.h06();
    }

    void h06(){

        Scanner s = new Scanner(System.in);

        int number[] = new int[5]; 
        //int pow_value[][] = new int[5][5]; 
        int max = 2, min = 10; 
        int max2 = 2, min2 = 10;
  
        int i; 

        System.out.print("Enter 5 numbers from 2 to 9 > ");
        for(i=0; i<5; i++)
            number[i] = s.nextInt();

        for(i=0; i<5; i++){
            if(number[i] > max) max = number[i];
            if(number[i] < min) min = number[i];
        }

        for(i=0; i<5; i++){
            if(number[i] < max && number[i] > max2) max2 = number[i];
            if(number[i] > min && number[i] < min2) min2 = number[i];
        }

        double max_a = Math.pow((double)max2, (double)max); 
        double max_b = Math.pow((double)min, (double)min2);
        
        System.out.printf("Max number is %.0f which is %d squared of %d\n",max_a, max, max2);
        System.out.printf("Min number is %.0f which is %d squared of %d\n",max_b, min2, min);
        
        s.close();
        
    }
}
