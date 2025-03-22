package StepH;
import java.util.Scanner;
import java.lang.Math;
import java.lang.String;

public class H04 {
    public static void main(String[] args) {
        H04 StepH = new H04();
        StepH.h04();
    }

    void h04(){

        Scanner s = new Scanner(System.in);
        int com_finger = 0;
        int my_finger = 0;
        int score[][] = new int[2][3];
        String[] com_kind = {"Scissors", "Rock" , "Paper"};

        while(true){

            System.out.print("Enter Scissors(1) Rock(2) Paper(3) > ");
            my_finger = s.nextInt();
            if(my_finger == 0) break;

            com_finger = ((int)(Math.random() * 3) + 1);

            System.out.printf("What the computer has given out is ");
            if(com_finger == 1) System.out.printf("%s ---> ",com_kind[0]);
            else if(com_finger == 2) System.out.printf("%s ---> ",com_kind[1]);
            else System.out.printf("%s ---> ",com_kind[2]);
           
            if(com_finger == my_finger){
                score[0][1]++;
                score[1][1]++;
                System.out.println("Draw!");
            }
            else{
                switch (com_finger) {
                    case 1:
                        if(my_finger == 2){
                            score[0][2]++;
                            score[1][0]++;
                            System.out.println("win!");
                        }
                        else{
                            score[0][0]++;
                            score[1][2]++;
                            System.out.println("Compiter win..");
                        }
                        break;
                    case 2:
                        if(my_finger == 3){
                            score[0][2]++;
                            score[1][0]++;
                            System.out.println("win!");
                        }
                        else{
                            score[0][0]++;
                            score[1][2]++;
                            System.out.println("Compiter win..");
                        }
                        break;
                    default:
                        if(my_finger == 1) {
                            score[0][2]++;
                            score[1][0]++;
                            System.out.println("win!");
                        }
                        else{
                            score[0][0]++;
                            score[1][2]++;
                            System.out.println("Compiter win..");
                        }
                        break;
                }
            }

        }   

        for(int i=0; i<2; i++){
            for(int j=0; j<3; j++){
                System.out.printf("%d",score[i][j]);
            }
        }

        System.out.printf("Computer : win - %d, lost - %d, draw - %d\n",score[0][0],score[0][2],score[0][1]);
        System.out.printf("User : win - %d, lost - %d, draw - %d\n",score[1][0],score[1][2],score[1][1]);
        s.close();

    }
}
