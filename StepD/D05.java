package StepD;
import java.util.Scanner;

public class D05 {
    public static void main(String[] args) {
        D05 stepD = new D05();
        stepD.d05();
    }

    void d05(){
        Scanner s = new Scanner(System.in);

        int width, height; 
        int count1 = 0; 
        int count2 = 0; 
        int count3 = 0; 
        int count4 = 0; 
        int count5 = 0; 

        while(true){

            System.out.print("Enter width, height of Rectangle > ");
            width = s.nextInt();
            height = s.nextInt();
            
           if(width <= 0 || height <= 0) break;

           if(width == height) count1++;
           else if(width >= height * 2) count2++;
           else if(height >= width * 2) count3++;
           else if(width > height) count4++;
           else count5++;

        }
        
       System.out.println("Count of square is "+count1+"");
       System.out.println("Count of an oblong rectangle from side to side is "+count2+"");
       System.out.println("Count of an oblong rectangle from top to bottom is "+count3+"");
       System.out.println("Count of a horizontal rectangle is "+count4+"");
       System.out.println("Count of a vertical rectangle is "+count5+"");

        s.close();
    }

}
