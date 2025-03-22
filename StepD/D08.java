package StepD;
import java.util.Scanner;

public class D08{
    public static void main(String[] args) {
        D08 stepD = new D08();
        stepD.d08();
    }

    void d08(){
        Scanner s = new Scanner(System.in);

        int a, b, c; 
        int x_begin, x_end; 
        int x, y; 
        
        System.out.print("Enter the coefficients a and b of quadratic function(y=ax^2+bx+c) > ");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();

        System.out.print("Enter the start and end values of x coordinates > ");
        x_begin = s.nextInt();
        x_end = s.nextInt();

        for(x= x_begin ; x <= x_end; x++){
            y = a * x*x + b * x + c;
            System.out.printf("coordinates (%d, %d)\n",x,y);
            
            s.close();
        }
       
    }
}
    
