package StepK;
import java.util.Scanner;

public class K03 {
    public static void main(String[] args) {
        K03 StepK = new K03();
        StepK.k03();
    }

    void k03(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter coordinate (X, Y) > ");
        double x = s.nextDouble();
        double y = s.nextDouble();

        System.out.println("================================================");

        System.out.print("Coordinate is located on ");
        String type[] = {"first" , "second", "third", "fourth"};
        
        point quadrant = new point();

        int result = quadrant.get_area(x,y);
        
        int[] count = new int[4];

        if(result == 1){
            System.out.printf("%s quadrants\n",type[0]);
            count[0] ++;
        }
        else if(result == 2){
            System.out.printf("%s quadrants\n",type[1]);
            count[1] ++;
        }

        else if(result == 3){
            System.out.printf("%s quadrants\n",type[2]);
            count[2] ++;
        }
        else if(result == 4){
            System.out.printf("%s quadrants\n",type[3]);
            count[3] ++;
        }

        for(int i=0; i<4; i++)
            System.out.printf("Number of coordinates on %dth quadrants is %d\n",i+1,count[i]);  
        
        s.close();
        
    }
}



