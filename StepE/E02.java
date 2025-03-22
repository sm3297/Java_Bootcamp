package StepE;
import java.util.Scanner;

public class E02 {
    public static void main(String[] args) {
        E02 StepE = new E02();
        StepE.e02();
    }

    void e02(){
        Scanner s = new Scanner(System.in);
        int height = s.nextInt();
        int blank = s.nextInt();

        int blanks = blank + height -1;
        int stars = 1;
        for(int i=0; i<height; i++){
            for(int j=0; j<blanks; j++) System.out.printf(" ");
            for(int j=0; j<stars; j++) System.out.printf("*");
            System.out.println();
            stars ++;
            blanks --;
        }
        s.close();
    }
}
