package StepF;
import java.util.Scanner;

public class F07 {
    public static void main(String[] args) {
        F07 StepF = new F07();
        StepF.f07();
    }

    void f07(){

        Scanner s = new Scanner(System.in);

        int number[][] = new int[5][3];
        int floor_total[] = new int[5]; 
        int line_total[] = new int[3]; 
        int total = 0;
        int i,j;

        for(i=0; i<5; i++){
                for(j=0; j<3; j++){
                System.out.printf("Enter number of people in room %d0%d > ",i+1, j+1);
                number[i][j] = s.nextInt();

                total += number[i][j];

                floor_total[i] += number[i][j];

                line_total[j] += number[i][j];
            }
            
        }

        for(i=0; i<5; i++)
            System.out.printf("Number of people living in %d floor is %d\n",i+1, floor_total[i]);

        System.out.println();

        for(i=0; i<3; i++)
            System.out.printf("Number of people living in %d line is %d\n",i+1, line_total[i]);

        System.out.printf("\nNumber of people living in this apartment is %d\n",total);


        s.close();

    }
}
