package StepJ;
import java.util.Scanner;

public class J10 {
    public static void main(String[] args) {
        J10 StepJ = new J10();
        StepJ.j10();
    }

    void j10(){
        
        Scanner s = new Scanner(System.in);
        
        for(int i=2; i<20; i++){
                double result = (float)fibonacci(i+1) / fibonacci(i);
                double end_result = (float)fibonacci(i) / fibonacci(i-1);
                
                System.out.printf("%dth ratio (%d / %d) : %.6f\n",i,fibonacci(i+1),fibonacci(i),result);

                if(Math.abs(result - end_result) <= 0.000001) break;
            }
        

        
        s.close();
        
    }
    public int fibonacci(int n){
        if(n == 1 || n ==2)
            return 1;
        else if(n > 2)
            return (int)(fibonacci(n-1) + fibonacci(n-2));
        else 
            return 0;

    }

   
}
