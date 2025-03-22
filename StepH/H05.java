package StepH;
import java.util.Scanner;
import java.lang.Math;

public class H05 {
    public static void main(String[] args) {
        H05 StepH = new H05();
        StepH.h05();
    }
    void h05(){

        Scanner s = new Scanner(System.in);
        int coins = 0; 
        int number[] = {1,1,1};//new int[3]; 
        int dummy = 0; 
        int i; 
        int count = 0;
        

        System.out.printf("Enter number of coins > ");
        coins = s.nextInt();

        while(true){

            
            count++;
            System.out.printf("Start %dth game!!! (Enter any number) > ",count);
            dummy = s.nextInt();
            coins --;
            
            System.out.printf("Result of game : ");
            for(i=0; i<3; i++){
                number[i] = ((int)(Math.random() * 9) + 1);
                System.out.printf("%-2d",number[i]);
            }
            System.out.printf(" ---> ");
            

            if(number[0] == number[1] && number[1] == number[2]){
                coins += 4;
                System.out.printf("match 3 numbers! got four more coins\n");
            }

            else if(number[0] != number[1] && number[1] != number[2] && number[1] != number[2]){
                System.out.println("Failed...");   
            }
            else{                
                coins += 2;
                System.out.printf("match 2 numbers! got two more coins\n");
            }
            System.out.printf("There are %d coins remaining.\n\n",coins);
            if(coins == 0) break;
        }
        System.out.println("\nGame over!");

        s.close();

    }
}
