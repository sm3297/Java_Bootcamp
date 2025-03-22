package StepI;
import java.util.Scanner;

public class I01 {
    public static void main(String[] args) {
        I01 StepI = new I01();
        StepI.i01();
    }

    void i01(){

        Scanner s = new Scanner(System.in);

        int menu = 0;
        int price = 0;
        int t_price = 0;

        while(true){

            ShowMenu();
            menu = s.nextInt();

            if(menu == 5) break;
            
            if(menu == 1) price = 15000;
            else if(menu == 2) price = 10000;
            else if(menu == 3) price = 7000;
            else if(menu == 4) price = 2000;

            t_price += price;

            System.out.printf("Order price from now on is %d \n\n",t_price);
            
        }

            System.out.printf("Total price is %d\n",t_price);

            s.close();
        }

        public void ShowMenu(){
        System.out.printf("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");
        }
    

}