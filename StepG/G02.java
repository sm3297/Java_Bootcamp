package StepG;
import java.util.Scanner;

public class G02 {

    public static void main(String[] args) {
        G02 StepG = new G02();
        StepG.g02();
    }

    void g02(){

        Scanner s = new Scanner(System.in);
     
        double[] degrees = new double[10];
        String[] degree_name = {"cold", "warm", "hot", "boiling"};
        String[] degree_rn = new String[10];
        int count[] = {0,0,0,0}; 
        int i; 
     
        for(i=0; i<10; i++){
            System.out.print("Enter water temperature > ");
            degrees[i] = s.nextDouble();

            if(degrees[i] >= 80){
                count[3]++;
                degree_rn[i] = degree_name[3];
            }
            else if(degrees[i] >= 40){
                count[2]++;
                degree_rn[i] = degree_name[2];
            }
            else if(degrees[i] >= 25){
                count[1]++;
                degree_rn[i] = degree_name[1];
            }
            else if(degrees[i] >= 0){
                count[0]++;
                degree_rn[i] = degree_name[0];
            }
            else continue;
        }

        System.out.println();

        for(i=0; i<10; i++)
            System.out.printf("%dth water temperature is %.1f %s water\n",i+1, degrees[i], degree_rn[i]);
        
        System.out.println();

        for(i=0; i<4; i++)
            System.out.printf("Count of %s water is %d\n",degree_name[i],count[i]);

        s.close();

    }

}
