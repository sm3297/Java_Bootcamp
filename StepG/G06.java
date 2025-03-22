/* 
The problem is different from the examples
Problem: Total number by type, total sales amount
Example : Total sales amount
*/

package StepG;
import java.util.Scanner;

public class G06 {
    public static void main(String[] args) {
        G06 StepG = new G06();
        StepG.g06();
    }

    void g06(){

        Scanner s = new Scanner(System.in);

        int[] order = {0,0,0}; 
        int sale = 0; 
        int total_sale = 0; 
        //int[] total_order = {0,0,0}; 
        int[] price = {10000, 6000, 3000}; 
        int i = 0; 
        String[] type = {"first", "second", "third"};

        System.out.println("There are three type of products\n(1. Leather gloves, 2. Wool gloves, 3. Vinyl gloves)\n");

        while(true){
            for(i=0; i<3; i++){
              System.out.printf("How many %s products do you want to buy? > ",type[i]);
              order[i] = s.nextInt();
            }
            
            if(order[0] == 0 && order[1] == 0 && order[2] == 0) break;

            for(i=0; i<3; i++){
                // "Counting the number of products sold so far" not in the run example
                // total_order[i] += order[i];

                sale += order[i] * price[i];
            }

            System.out.printf("The price is %d\n\n",sale);
        
            total_sale += sale;
            sale = 0;
            

        }

        // "Output of number of products sold so far" not in the run example
        /* 
         System.out.printf("1. Leather gloves count : %d\n",total_order[0]);
         System.out.printf("2. Wool gloves count : %d\n",total_order[1]);
         System.out.printf("3. Vinyl gloves count : %d\n",total_order[2]);
        */
        
        System.out.printf("Total price from now on is %d\n",total_sale);

        s.close();


    }
}
