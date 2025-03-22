package StepI;
import java.util.Scanner;

public class I07{
    public static void main(String[] args) {
        I07 StepI = new I07();
        StepI.i07();
    }

    void i07(){

        Scanner s = new Scanner(System.in);
    
        int Price = 0;
        String b;
        int count = 0;
        
        while(true){

            System.out.println("1. Cola(700) 2. coffee(300) 3. lemon tea(1000) 4. milk tea(500) 5. cocoa(600)");
            Price += SelectCan();
            System.out.print("Do you need more menu? (Y/N) > ");
            b = s.next();
            
            count++;
            
            if("N".equals(b)) break;
            else System.out.println();
              
        }
      
        System.out.printf("Total price for %d drinks is %d\n",count,Price);

    }

    int SelectCan(){

        Scanner s = new Scanner(System.in);
        int menu = 0;
        int price = 0;

        System.out.print("Please select menu > ");
        menu = s.nextInt();

        if(menu == 1) price = 700;
        else if(menu == 2) price = 300;
        else if(menu == 3) price = 1000;
        else if(menu == 4) price = 500;
        else if(menu == 5) price = 600;
    
        return price;
            
    }
}