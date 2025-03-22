package StepI;
import java.util.Scanner;

public class I04 {
    public static void main(String[] args) {
        I04 StepI = new I04();
        StepI.i04();
    }

    void i04(){

        int m_price = 0;
        int add_price = 0;

        while(true){
            m_price = SelectMenu();
            if(m_price == -1) break;
            add_price += m_price;
            System.out.printf("Order price from now on is %d\n\n",add_price);
            
        }

        System.out.printf("Total price is %d\n",add_price);

        }

        int SelectMenu(){

        int menu;

        Scanner s = new Scanner(System.in);
        while(true){
            System.out.print("1. pizza(15,000) 2. spaghetti(10,000) 3. salad(7,000) 4. drink(2,000) 5. exit > ");

            menu = s.nextInt();  

            if(menu == 5) 
                return -1;
            else if (menu == 4)
                return 2000;
            else if (menu == 3)
                return 7000;
            else if (menu == 2)
                return 10000;
            else
                return 15000;

        }    
    }
}