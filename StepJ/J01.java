package StepJ;
import java.util.Scanner;

public class J01 {
    public static void main(String[] args) {
        J01 StepJ = new J01();
        StepJ.j01();
    }

    void j01(){
        Scanner s = new Scanner(System.in);

        int count = 0;
        int birthyear = 0;
        int age = 0;
        int c0 = 0, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;

        while(true){
            System.out.printf("Enter a birth year of %dth person > ", count+1);    
            birthyear = s.nextInt();
            if(count > 100 || birthyear > 2021) break;
    
            age = AskAge(birthyear);
    
            if(age == 0) c0++;
            else if(age == 1) c1++;
            else if(age == 2) c2++;
            else if(age == 3) c3++;
            else if(age == 4) c4++;
            else c5++;
    
            count ++;
    
        }
    
        System.out.println("There are "+c0+" babys.");
        System.out.println("There are "+c1+" childs.");
        System.out.println("There are "+c2+" youths.");
        System.out.println("There are "+c3+" youngs.");
        System.out.println("There are "+c4+" adults.");
        System.out.println("There are "+c5+" olds.");
    
    }

    

    int AskAge(int birthyear){
        int a = 0;

        a = 2021 - birthyear + 1;
        System.out.println("This person is "+a+" years old.");

        if(a >= 60) return 5;
        else if(a >= 30) return 4;
        else if(a >= 20) return 3;
        else if(a >= 13) return 2;
        else if(a >= 7) return 1;
        else return 0;
    }
    
}
