package StepF;
import java.util.Scanner;

public class F08 {
    public static void main(String[] args) {
        F08 StepF = new F08();
        StepF.f08();
    }

    void f08(){

        Scanner s = new Scanner(System.in);
        int number[] = new int[10];
        int count =0;
        int i = 0;
        
        System.out.println("Enter a number from 1 to 100");
        while(true){
            if(count == 9) break;
            System.out.printf("Enter %dth number > ",i+1);
            number[i] = s.nextInt();

            for(int j=0; j < i; j++){
                if(number[i] == number[j]){
                    System.out.printf("Invalid input!\n");
                        i--;
                    }
                    else count = i;                 
            }  
            i++;
        }

        s.close();

         for(i=0; i<10; i++)
             System.out.printf("%dth number is %d\n",i+1, number[i]);

    }
}
