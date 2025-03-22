package StepH;
import java.util.Scanner;
import java.util.Random;


public class H01 {
    public static void main(String[] args) {
        H01 StepH = new H01();
        StepH.h01();
    }

    void h01(){

        Scanner s = new Scanner(System.in);
        Random random = new Random();

        random.setSeed(System.currentTimeMillis());

        int answer = random.nextInt(100)+1;
        int number_try = 0;
        int count = 0;

        while(true){
            System.out.print("Guess the number from 1 to 100 > ");
            number_try = s.nextInt();

            if(number_try == answer) break;
            if(number_try > answer) System.out.println("Down!");
            else System.out.println("Up");

            count++;

        }
        System.out.printf("You figured out the number in %d times\n",count);

        s.close();

    }

}
