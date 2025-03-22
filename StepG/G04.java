package StepG;
import java.util.Scanner;

public class G04 {
    public static void main(String[] args) {
        G04 StepG = new G04();
        StepG.g04();
    }

    void g04(){

        Scanner s = new Scanner(System.in);

        int kind = 0; 
        int money = 0; 
        int charge = 0; 
        int total_charge = 0; 

        while(true){
            System.out.print("Enter the type of real estate transaction(1:Trading, 2:Lease, 0:exit) > ");
            kind =s.nextInt();

            if(kind == 0) break;

            System.out.print("Enter the amount of real estate transaction. > ");
            money = s.nextInt();

            if(kind == 1){
                if(money >= 2 * Math.pow(10,8)){
                    charge = (int)(money * 0.004);
                }
                else if(money >= 5 * Math.pow(10,7)){
                    charge = (int)(money * 0.005);
                    if(charge > 8000000) charge = 8000000;
                }
                else{
                    charge = (int)(money * 0.006);
                    if(charge > 250000) charge = 250000;
                }
            }
            else{
                if(money >= 1 * Math.pow(10,8)){
                    charge = (int)(money * 0.003);
                }
                else if(money >= 5 * Math.pow(10,7)){
                    charge = (int)(money * 0.004);
                    if(charge > 300000) charge = 300000;
                }
                else if(money >= 2 * Math.pow(10,7)){
                    charge = (int)(money * 0.005);
                    if(charge > 200000) charge = 200000;
                }
                else{
                    charge = (int)(money * 0.005);
                    if(charge > 70000) charge = 70000;
                }
            }
            System.out.printf("The charge is %d\n\n",charge);
            total_charge += charge;

        }   

        System.out.printf("Total charge is %d\n",total_charge);

        s.close();

    }
}
