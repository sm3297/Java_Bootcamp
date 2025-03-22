package StepI;
import java.util.Scanner;
import java.lang.String;

public class I02 {
    public static void main(String[] args) {
        I02 StepI = new I02();
        StepI.i02();
    }

    void i02(){
        
        Scanner s = new Scanner(System.in);

        int blank = 0;
        int sizes = 1;
        
        System.out.printf("Enter a character to draw triangle > ");
        String ch = s.next();

        System.out.print("Enter a height of right triangle and blank > ");
        sizes = s.nextInt();
        blank = s.nextInt();

        PrintCharWithBlank(blank, sizes, ch);
    
        s.close();
    }


    void PrintCharWithBlank(int blanks, int size, String ch){
      
        int b = blanks+size-1;
        int star = 1;
        for(int i=0; i<size; i++){
            for(int j=0; j<b; j++) System.out.printf(" ");
            for(int j=0; j<star; j++) System.out.printf("%s", ch);
            System.out.printf("\n");
            star++;
            b--;
        }

    }
    
}


   
