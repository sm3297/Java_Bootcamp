package StepG;
import java.util.Scanner;

public class G07 {
    public static void main(String[] args) {
        G07 StepG = new G07();
        StepG.g07();
    }

    void g07(){

        Scanner s = new Scanner(System.in);

        int team_count; 
        int[] charge = {5000, 10000, 15000, 3000};
        int[] count = new int[4]; 
        int[] v_count = new int[4]; 
        int total_count = 0; 
        int sum = 0; 
        int total_sum =0; 
        int membership = 0; 
        int i, j; 
        String[] kind = {"child", "youth", "adult", "old"};

        System.out.print("Enter number of team > ");
        team_count = s.nextInt();
        System.out.println();

        i=0;
        while(true){
            if(i == team_count) break;

            System.out.print("Enter a number of 1 th team member (child, youth, adult, old) > ");
            for(j=0; j<4; j++){
                count[j] = s.nextInt();
                
                v_count[j] += count[j];
                total_count += count[j];

            }

            System.out.print("Enter a discount membership type of 1 th team (no membership:0 , normal:1 , VIP:2) > ");
                membership = s.nextInt();

            if(membership == 2){
                for(j=0 ;j<4; j++)
                    sum += (count[j] * charge[j]) - (count[j] * charge[j]* 0.2);
            }
            else if(membership == 1){
                for(j=0 ;j<4; j++)
                    sum += (count[j] * charge[j]) - (count[j] * charge[j]* 0.1);
            }
            else{
                for(j=0 ;j<4; j++)
                    sum += count[j] * charge[j];
            }

            System.out.printf("Admission fees of %dth team is %d\n\n",i+1, sum);
            total_sum += sum;
            sum = 0;

            i++;
        }

        System.out.printf("Total number of visitors %d\n", total_count);
        
        for(i=0; i<4; i++)
            System.out.printf("Total number of %s %d\n",kind[i],v_count[i]);

        System.out.printf("\nTotal free is %d\n",total_sum);

        s.close();

    }

}
