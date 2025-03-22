package StepD;
import java.util.Scanner;

public class D04{
    public static void main(String[] args) {
        D04 stepD = new D04();
        stepD.d04();
    }

    void d04(){

        Scanner s = new Scanner(System.in);
        // I use "s.close();" What's wrong?
        // Resource leak: 's' is never closedJava(536871799)

        int count_all; 
        int count_young = 0; 
        int birth_year; 
        int age; 
        int i; 
        
        System.out.print("Enter number of family members > ");
        count_all = s.nextInt();

        for(i=0; i<count_all; i++){

            System.out.print("Enter a birth year > ");
            birth_year = s.nextInt();

            age = 2021 - birth_year + 1;
            if(age < 20) count_young ++;

            //s.close(); but this error

            /* Exception in thread "main" java.lang.IllegalStateException: Scand
            at java.base/java.util.Scanner.ensureOpen(Scanner.java:1150) .java:2258)
            at java.base/java.util.Scanner.nextInt(Scanner.java:2212)
            at StepD.D03.d03(D03.java:20)
            at StepD.D03.main(D03.java:7)*/ 
        }
       
        System.out.println("There are "+count_young+" youngs in the family.");

        s.close(); // using s.close(); --> so, go in loop.. but...
          
    }
    
}
    

