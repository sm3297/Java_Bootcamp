package StepG;
import java.util.Scanner;

public class G05 {
    public static void main(String[] args) {
        G05 StepG = new G05();
        StepG.g05();
    }

    void g05(){

        Scanner s = new Scanner(System.in);

        int hour = 0, minute = 0; 
        int charge = 0; 
        int total_charge = 0; 

        while(true){

            System.out.print("Enter hours and minutes of use > ");
            hour = s.nextInt();
            minute = s.nextInt();

            if(hour == 0 && minute == 0) break;
            int time = hour * 60 + minute;
            double price = 0.0F;
            
            if(time % 30 != 0) price = (time / 30)*1000 + 1000;
            else price = (time / 30)*1000;   

            if(time >= 5 * 60)
                charge = (int)(price - (price * 0.2));
            else if(time >= 3 * 60)
                charge = (int)(price - (price * 0.1));
            else if(time >= 2 * 60)
                charge = (int)(price - (price * 0.05));
            else 
                charge = (int)price;

            System.out.printf("Your charge is %d\n\n", charge);

            total_charge += charge;
        }

        System.out.printf("Your total charge is %d\n",total_charge);

        s.close();

        

    }
}
