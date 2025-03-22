package StepJ;
import java.util.Scanner;

public class J02{
    public static void main(String[] args) {
        J02 StepJ = new J02();
        StepJ.j02();
    }

    void j02(){

        Scanner s = new Scanner(System.in);

        double number[] = {0,0,0,0,0,0,0,0,0,0};
        double Max_num = 0.0, Min_num = 0.0;
        int i;
        double sum = 0.0;
    
        for(i=0; i<10; i++){
            System.out.printf("Enter %dth score > ",i+1);
            number[i] = s.nextDouble();
            sum += number[i];
        }
       
        Max_num = Max(number);
        Min_num = Min(number);
        
        double average = (double)((sum - (Max_num + Min_num)) / 8.0);
        System.out.printf("Average is %.1f\n",average);
        
        s.close();
    }

    Double Max(double num[]){

        double max = 0.0;
    
        for(int j=0; j< 10; j++)
            if(num[j] > max) max = num[j];
        
        return max;
    
    }
    
    Double Min(double num[]){
    
        double min = 100.0;
    
        for(int j=0; j< 10; j++)
            if(num[j] < min) min = num[j];
        
        return min;
    
    }

    
}
