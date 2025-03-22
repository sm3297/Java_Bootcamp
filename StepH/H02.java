package StepH;
import java.util.Scanner;

public class H02 {
    public static void main(String[] args) {
        H02 StepH = new H02();
        StepH.h02();
    }

    void h02(){
        Scanner s = new Scanner(System.in);

        int lotto[] = new int[6];
        int count = 0;
        String onemore;
        int i;

        while(true){

            System.out.print("The generated lotto numbers are");
            for(count=0 ; count<lotto.length; count++){
                lotto[count] = (int)((Math.random()*45)+1);
                for(i=0; i<count; i++){
                    if(lotto[i] == lotto[count]){
                        count--;
                        break;
                    }
                }
                
            }
            for(i=0; i<lotto.length; i++)
                System.out.printf("%3d",lotto[i]);
              

            System.out.print("\nDo you want to generate more lotto numbers? (Y/N) > ");
            onemore = s.next();
            if("N".equals(onemore)) break;
            
        }
        
    }   //s.close();

}

