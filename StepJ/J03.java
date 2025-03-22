package StepJ;
import java.util.Scanner;

public class J03{
    public static void main(String[] args) {
        J03 StepJ = new J03();
        StepJ.j03();
    }

    void j03(){

        Scanner s = new Scanner(System.in);

        double[] d = new double[10];
        String type[] = {"cold" , "warm" , "hot" , "boiling"};
        int [] count = new int[4];

        for(int i=0; i<10; i++){
            System.out.printf("Enter %dth water temperature > ", i+1);
            d[i] = s.nextDouble();
        }

        for(int i=0; i<10; i++){

            System.out.printf("%dth water temperature is %.1f ", i+1, d[i]);

            if(AskWater(d[i]) == 0){
               count[0]++;
               System.out.printf("%s water\n",type[0]);
            }
            else if(AskWater(d[i]) == 1){
                count[1]++;
                System.out.printf("%s water\n",type[1]);
            }
            else if(AskWater(d[i]) == 2){
                count[2]++;
                System.out.printf("%s water\n",type[2]);
            }
            else{
                count[3]++;
                System.out.printf("%s water\n",type[3]);
            }
        }

        for(int i=0; i<4; i++)
            System.out.printf("Count of %s water is %d\n",type[i], count[i]);
        
        s.close();
    }

    byte AskWater(double degree){

        if(degree >= 80) return 3;
        else if(degree >= 40) return 2;
        else if(degree >= 25) return 1;
        else return 0;
    
    }
    
}
