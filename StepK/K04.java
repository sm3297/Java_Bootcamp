package StepK;
import java.util.Scanner;

public class K04 {
    public static void main(String[] args) {
        K04 StepK = new K04();
        StepK.k04();
    }

    void k04(){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number of coordinate > ");
        int ct = s.nextInt();

        int[] result = new int[ct];

        point plist[] = new point[ct];

        int[] count = new int[4];
        String type[] = {"first" , "second", "third", "fourth"};


        for(int i = 0; i < plist.length; i++){
            plist[i] = new point();
            System.out.printf("Enter %dth coordinate (X, Y) > ",i+1);
            double x = s.nextDouble();
            double y = s.nextDouble();

            result[i] = plist[i].get_area(x,y);
        }

        System.out.println("================================================");

       
     
        
        for(int i = 0; i < plist.length; i++){

            System.out.printf("%dth coordinate is located on ",i+1);

            if(result[i] == 1){
                System.out.printf("%s quadrants\n",type[0]);
                count[0] ++;
            }
            else if(result[i] == 2){
                System.out.printf("%s quadrants\n",type[1]);
                count[1] ++;
            }

            else if(result[i] == 3){
                System.out.printf("%s quadrants\n",type[2]);
                count[2] ++;
            }
            else if(result[i] == 4){
                System.out.printf("%s quadrants\n",type[3]);
                count[3] ++;
            }
        }

        System.out.println();
            for(int i=0; i<4; i++)
                System.out.printf("Number of coordinates on %dth quadrants is %d\n",i+1,count[i]);  
        
        s.close();
        
    }
}
