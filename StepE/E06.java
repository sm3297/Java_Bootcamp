package StepE;
import java.util.Scanner;

public class E06 {
    public static void main(String[] args) {
        E06 StepE = new E06();
        StepE.e06();
    }

    void e06(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a rows and columns > ");
        int rows = s.nextInt();
        int columns = s.nextInt();

        int number = columns;
        int i,j=0;
        int n =1;

        for(i=0; i<number; i++){ 
            for(j=n ; j<=rows*n; j+=n) System.out.printf("%4d",j);
            n ++;
            System.out.println();  
        }

        s.close();
    }
}