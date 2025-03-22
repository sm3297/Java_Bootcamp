package StepJ;
import java.util.Scanner;

public class J07 {
    public static void main(String[] args) {
        J07 StepJ = new J07();
        StepJ.j07();
    }

    void j07(){

        Scanner s = new Scanner(System.in);

        while(true){
        
            System.out.printf("Enter a number. (0 for exit) > ");
            int num = s.nextInt();
            if(num == 0) break;
            System.out.printf("%d square of 2 is %d\n",num,poweroftwo(num));

        }

        s.close();

    }

    int poweroftwo(int n){
        if(n ==0) 
            return n = 1;
        if (n > 0) 
            return n = 2 * poweroftwo(n-1);
        else 
            return 0;
    }
}
