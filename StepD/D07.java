package StepD;
import java.util.Scanner;

public class D07{
    public static void main(String[] args) {
        D07 stepD = new D07();
        stepD.d07();
    }

    void d07(){
        Scanner s = new Scanner(System.in);

        int a, b; 
        int x_begin, x_end; 
        int x, y; 
        
        System.out.print("Enter the coefficients a and b of linear function(y=ax+b) > ");
        a = s.nextInt();
        b = s.nextInt();

        System.out.print("Enter the start and end values of x coordinates > ");
        x_begin = s.nextInt();
        x_end = s.nextInt();

        for(x= x_begin ; x <= x_end; x++){
            y = a * x + b;
            System.out.printf("coordinates (%d, %d)\n",x,y);
            
            s.close();
        }
       
    }
}
    
