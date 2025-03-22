package StepJ;
import java.util.Scanner;

public class J05{
    public static void main(String[] args) {
        J05 StepJ = new J05();
        StepJ.j05();
    }

    void j05(){

        Scanner s = new Scanner(System.in);
        int price = 0;
        int total_price = 0;
        int count = 0;
        int i = 0;

        while(true){

            System.out.printf("Enter parking start time of %dth car (H M) > ",i+1);
            int start_h = s.nextInt();
            int start_m = s.nextInt();
    
            System.out.printf("Enter parking end time of %dth car (H M) > ",i+1);
            int end_h = s.nextInt();
            int end_m = s.nextInt();

            int result_time = CalcParking(start_h, start_m, end_h, end_m);    
            if(result_time % 10 == 0) price = (result_time / 10 * 500);
            else price =  (result_time / 10 * 500) + 500;

            System.out.printf("Parking price : %d\n",price);
            count ++;
            total_price += price;
            price = 0;
            i++;

            System.out.printf("Do you want to enter more? (Y/N) > ");
            String kind = s.next();

            if("N".equals(kind)) break;
        }


        System.out.printf("Total price for %d cars is %d",count, total_price);

        s.close();

    }

    int CalcParking(int start_h, int start_m, int end_h, int end_m){

        int result_t = (end_h * 60 + end_m) - (start_h * 60 + start_m);
        
        return result_t;
        

    }
}
