package StepK;
import java.util.Scanner;

public class K06 {
    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);

        System.out.print("Enter a number of students > ");
        int count = s.nextInt();
        int i = 0;

        UserInfo userinfo[] = new UserInfo[count];

        for(i=0; i<count; i++){
            System.out.printf("Enter id, password of %dth student > ", i+1);
            userinfo[i] = new UserInfo();
            userinfo[i].input();
        }

        System.out.println("================================================");
        System.out.printf("Registered %d students list are as follows\n",count);
        System.out.println("------------------------------------------------");

        String[] kind = {"num", "name", "password"};
        for(i=0; i<kind.length; i++){
            System.err.printf("%-8s",kind[i]);
        }


        for(i=0; i<count ; i++)
            userinfo[i].print(i+1);
        
    }
}
