package StepH;
import java.util.Scanner;

public class H03 {
    public static void main(String[] args) {
        H03 StepH = new H03();
        StepH.h03();
    }

    void h03(){
        Scanner s = new Scanner(System.in);

        int lotto_com[] = new int[6];
        int lotto_user[] = new int[6];
        int i = 0;
        int count = 0;
        int match_count = 0;

        for(count=0 ; count<lotto_com.length; count++){
            lotto_com[count] = (int)((Math.random()*45)+1);
            for(i=0; i<count; i++){
                if(lotto_com[i] == lotto_com[count]){
                    count--;
                    break;
                }
            }
            
        }

        count = 0;
        while(true){
           
            System.out.printf("Enter your %dth lotto number > ",count+1);
            lotto_user[count] = s.nextInt();

            if(lotto_user[count] > 45 || lotto_user[count] < 1) System.out.println("Invalid input!");
               
            else{

                if(count == 0) count++;
                else{
                    
                    for(i=0; i<count; i++){
                        
                        if(lotto_user[count] == lotto_com[i]) match_count ++;

                        if(lotto_user[count] == lotto_user[i]){
                            System.out.println("Invalid input!");
                            count--;
                        }

                    }
                    count++;
                }
                
            }

            if(count == 6) break;
            
        }

        System.out.printf("Lotto numbers of this week are ");
        for(i=0; i<lotto_com.length; i++){
            System.out.printf("%3d",lotto_com[i]);  
        } 
        System.out.println();

        System.out.printf("There are %d matching lotto numbers\n",match_count);
        
    }   //s.close();

}


































