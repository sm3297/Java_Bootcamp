
package StepK;
import java.util.Scanner;

class MenuPan {
    int number = 0;
    String name = " ";
    String origin = " ";
    int price = 0;
    int i = 0;

    MenuPan(){};

    void input(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number, name, origin, price > ");

        number = s.nextInt();
        name = s.next();
        origin = s.next();
        price = s.nextInt();
    }

    void output(){
 
        System.out.println();
     
        System.err.printf("%3d",number);
        System.out.print("     ");
        System.err.printf("%-4s",name);
        System.out.print("     ");
        System.err.printf("%-6s",origin);
        System.out.print("     ");
        System.err.printf("%-5d",price);
     
        
    }

    MenuPan (int number, String name, String origin, int price){
        this.number = number;
        this.name = name;
        this.origin = origin;
        this.price = price;
    }

  

}