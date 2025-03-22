package StepK;

public class K05 {
    public static void main(String[] args) {

        UserInfo userinfo = new UserInfo();

        System.out.print("Enter id, password > ");
        userinfo.input();
        
        System.out.println("================================================");

        System.out.println("Registered students list are as follows");
        System.out.println("------------------------------------------------");

        String[] kind = {"num", "name", "password"};
        for(int i=0; i<kind.length; i++){
            System.err.printf("%-8s",kind[i]);   
        }

        userinfo.print(1);

    }
    
}


