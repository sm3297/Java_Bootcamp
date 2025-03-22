package StepE;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        E01 StepE = new E01();
        StepE.e01();  
    }

    void e01(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a length of rectangle > ");
        int length = s.nextInt();
        
        int stars = length;
        for(int i =0; i<length; i++){
            for(int j=0; j<stars; j++) 
                System.out.printf("# ");
            System.out.println();
        }

        s.close();
    }
}
