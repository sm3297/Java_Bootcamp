package StepD;
import java.util.Scanner;

public class D06 {
    public static void main(String[] args) {
        D06 stepD = new D06();
        stepD.d06();
    }
    void d06(){
        Scanner s = new Scanner(System.in);

        int count1 = 0; 
        int count2 = 0; 
        int count3 = 0; 
        int count4 = 0; 
        int i; 

        for(i=0; i<10; i++){

            System.out.printf("Enter area of Apartment(m^2) > ");
            double m2_area = s.nextDouble();

            double pyung_area = (double)(m2_area / 3.305);
            System.out.printf("Area of Apartment(pyung) %.1f\n",pyung_area);
            
            if(pyung_area >= 50) count4++;
            else if(pyung_area >= 30) count3++;
            else if(pyung_area >= 15) count2++;
            else count1++;

            
            
        }
 
        System.out.println("Count of small-sized apartment is "+count1+"");
        System.out.println("Count of small and medium-sized apartment is "+count2+"");
        System.out.println("Count of medium-sized apartment is "+count3+"");
        System.out.println("Count of big-sized apartment is "+count4+"");

        s.close();
        
    }

}
