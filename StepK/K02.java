package StepK;
import java.util.Scanner;

class K02{
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.printf("Enter number of menu > ");
        int count = s.nextInt();

        MenuPan menupan[] = new MenuPan[count];
        for(int i=0; i<count; i++){
            System.out.printf("%d: ",i+1);
            menupan[i] = new MenuPan();
            menupan[i].input();
        }


        String[] kind = {"num", "name", "origin", "price"};
        System.out.println("================================================");

        for(int i=0; i<kind.length; i++){
            System.err.printf("%s",kind[i]);
            System.out.print("     ");
        }   

        for(int i=0; i<count; i++){  
            menupan[i].output();    
        }

       s.close();
        
    }
}

