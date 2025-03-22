package StepH;
import java.util.Scanner;

public class H09 {
    public static void main(String[] args) {
        H09 StepH = new H09();
        StepH.h09();
    }

    void h09(){

        Scanner s = new Scanner(System.in);

        String input; 
        int i;
        int count = 0;
        
        while(true){
            System.out.println("===============================");
            System.out.print("=> Enter a sentence ('x' for exit) > ");
            input = s.nextLine();
            String[] userList = input.split("###");
            
            if("x".equals(input)) break;
            for(i=0; i<userList.length; i++){
                count++;
                userList[i] = userList[i].replace("|", " ");
            }

            System.out.printf("Total number of people is %d\n",count);
            
            for(i=0; i<userList.length; i++)
                System.out.printf("%d %s\n",i+1, userList[i]);
            
        }
        
        System.out.println("Exit program");

        s.close();

    }
}
