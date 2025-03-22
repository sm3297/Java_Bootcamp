package StepJ;
import java.util.Scanner;

public class J06 {
    public static void main(String[] args) {
        J06 StepJ = new J06();
        StepJ.j06();
    }

    void j06(){
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Fibonacci numbers from 1 to 20 are as follows.");
        for(int i=1; i<=20; i++){
            if(i == 1)
                System.out.printf("1st : %d\n",fibonacci(i));
            else{
                System.out.printf("%dth : %d\n",i,fibonacci(i));
            }
        }

        
        s.close();
        
    }
    public int fibonacci(int n){
        if(n == 1 || n ==2)
            return 1;
        if(n > 2)
            return (int)(fibonacci(n-1) + fibonacci(n-2));

        else return 0;
    }

   
}
