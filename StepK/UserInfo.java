package StepK;
import java.util.Scanner;

    
class UserInfo{
    
    String name = " ";
    String password = " ";
    
    UserInfo(){};

    void input(){
        Scanner s = new Scanner(System.in);

        name = s.next();
        password = s.next();
    }

    void print(int index){
 
        System.out.println();
        System.err.printf("%-8d",index);
        System.err.printf("%-8s",name);
        System.err.printf("%-6s",password);
        
    }

    UserInfo(String name, String password){

        this.name = name;
        this.password = password;

    }

}

