package StepH;
import java.util.Scanner;

public class H08 {
    public static void main(String[] args) {
        H08 StepH = new H08();
        StepH.h08();
    }

    void h08(){

        Scanner s = new Scanner(System.in);

        String input; 
        String findStr; 
        String replaceStr; 
        int i;
        String space = " ";
        int count = 0;
        
        while(true){
            System.out.println("===============================");
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            input = s.nextLine();
            String st[] = input.split(" |\\.");

            if("x".equals(input)) break;

            System.out.print("=> Enter a sentence to find > ");
            findStr = s.nextLine();
            System.out.print("=> Enter a sentence to replace > ");
            replaceStr = s.nextLine();


            for (i=0; i < st.length+'\0'; i++){
                if(findStr.equals(st[i])){ 
                    count++;
                    st[i] = replaceStr;
            
                }

            }
            
            System.out.printf("=> The replacement occurred %d times\n",count);
            count = 0;
            System.out.printf("=>");
            for(i=0; i<st.length; i++)
                System.out.printf(" %s",st[i]);
            
            System.out.println();
        }
        System.out.println("Exit program");

        s.close();

        

    }
}
