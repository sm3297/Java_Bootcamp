package StepE;
import java.util.Scanner;

public class E05 {
    public static void main(String[] args) {
        E05 StepE = new E05();
        StepE.e05();
    }

    void e05(){
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a type of gugudan (1: odd, 2: even) > ");
        int mode = s.nextInt();

        System.out.print("Enter a numbers of column > ");
        int column = s.nextInt();

        int i,j;

        if(mode == 1) i =3;
        else i = 2;

        for( ; i<=9; i+=2){
            for(j=1; j<=9; j++){
                System.out.printf("%d X %d = %-8d",i,j,i*j);
                if(j % column == 0) System.out.printf("\n");
                if(j % 9 == 0) System.out.printf("\n\n");
            } 
        }                 
        s.close();

    }
}
