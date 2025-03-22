package StepF;
import java.util.Scanner;

public class F01 {
    public static void main(String[] args) {
        F01 StepF = new F01();
        StepF.f01();
    }

    void f01(){

        Scanner s = new Scanner(System.in);

        int[]num = new int[10];
        int i = 0;

        int first = 0;
        int second = 0;
        int second_max_index = 0;
        //int newnum;

        for(i=0; i<10; i++){

            System.out.printf("Enter %dth number > ",i+1);
            num[i] = s.nextInt();

            if(num[i] > first) first = num[i];
        
        }

        for(i=0; i<10; i++){
            if(num[i] > second && num[i] < first){
                second = num[i];
                second_max_index = i;   
            }    
        }

        System.out.printf("Second largest number is %dth number %d",second_max_index + 1,second); 

        s.close();
    }

}
