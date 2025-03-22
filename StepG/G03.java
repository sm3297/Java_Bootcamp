package StepG;
import java.util.Scanner;

public class G03 {
    
    public static void main(String[] args) {
        G03 StepG = new G03();
        StepG.g03();
    }

    void g03(){

        Scanner s = new Scanner(System.in);

        int[][] jumsu = new int[5][3]; 

        int[] c_sum = new int[3]; 
        double[] c_average = new double[3];

        int[] s_sum = new int[5]; 
        double[] s_average = new double[5]; 

        String[] class_name = {"Korean","English","Math"}; 
        String grade[] = new String[5]; //{"A", "B", "C", "D" ,"F"};

        int i, j;
        
        for(i=0; i<5; i++){
            System.out.printf("Enter Korean, English, Math score of %dth student > ",i+1);

            
            for(j=0; j<3; j++){
                
                jumsu[i][j] = s.nextInt(); 

                c_sum[j] += jumsu[i][j];
                s_sum[i] += jumsu[i][j];

                c_average[j] = (double)(c_sum[j] / 5);
                
            }   
            s_average[i] = (double)(s_sum[i] / 3.0);
           
        }

        System.out.println("\n1) Total score and average for each subjects");
        
        for(i=0; i<3; i++)
            System.out.printf("Total %s score is %d, average is %.1f\n",class_name[i], c_sum[i], c_average[i]);
            
        System.out.println("\n2) Total score and average for each students");
      
        for(i=0; i<5; i++){
            if(s_average[i] >= 90) grade[i] = "A";
            else if(s_average[i] >=80) grade[i] = "B";
            else if(s_average[i] >=70) grade[i] = "C";
            else if(s_average[i] >=60) grade[i] = "D";
            else  grade[i] = "F";
            System.out.printf("%dth student score: Total - %d, average - %.1f, grade - %s\n",i+1, s_sum[i], s_average[i],grade[i]);
        }


        s.close();

    }

}
