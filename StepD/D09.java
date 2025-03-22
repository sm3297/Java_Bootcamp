package StepD;
import java.util.Scanner;

public class D09 {
    public static void main(String[] args) {
        D09 StepD = new D09();
        StepD.d09();
    }

    void d09(){
        
        Scanner s = new Scanner(System.in);
        int dan = 0;

        while(true){
            
            System.out.print("Enter number of gugudan(2~9) > ");
            dan = s.nextInt();

            if(dan < 2 || dan > 9) System.out.println("Invalid input");
            else  break;
        }
        for(int i =1; i<=9; i++)
            System.out.printf("%d X %d = %-2d\n",dan, i, dan*i);
        
        s.close();
    }
    
}
