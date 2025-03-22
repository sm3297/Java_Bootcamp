package StepE;
import java.util.Scanner;

public class E03 {
    public static void main(String[] args) {
        E03 StepE = new E03();
        StepE.e03();
    }

    void e03(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a height of triangle > ");
        int height = s.nextInt();

        int blank = height -1;
        int stars = 1;
        for(int i=0; i<height; i++){
            for(int j=0; j<blank; j++) System.out.printf(" ");
            for(int j=0; j<stars; j++) System.out.printf("*");
            System.out.println();
            stars +=2;
            blank --;
        }
        s.close();
    }
}
