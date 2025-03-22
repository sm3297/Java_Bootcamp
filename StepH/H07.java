package StepH;
import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {
        H07 StepH = new H07();
        StepH.h07();
    }

    void h07(){

        Scanner s = new Scanner(System.in);

        String input = " ";
        int i;
        int count = 0;
       
        while(true){
            System.out.println("===============================");
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            input = s.nextLine();
            
            if("x".equals(input)) break;
            
            for (i=0; i < input.length(); i++) 
                count++;
            
            System.out.printf("=> Number of character is %d\n",count);

            for (i=0; i < input.length(); i++) 
                System.out.println("=> " + input.charAt(i) );
            
        }

        System.out.println("Exit program");

        s.close();

    }
}
