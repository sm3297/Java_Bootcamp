package StepG;
import java.util.Scanner;

public class G01 {
    public static void main(String[] args) {
        G01 StepG = new G01();
        StepG.g01();
    }

    void g01(){

        Scanner s = new Scanner(System.in);

        int birth_year; 
        
        
        int[] count = new int[6];
        int[] age = new int[100];
        // count[0] == count_baby
        // count[1] == count_child 
        // count[2] == count_youth  
        // count[3] == count_young 
        // count[4] == count_adult 
        // count[5] == count_old 
        int i =0; 
        String kind[] = {"babys" , "childs", "youths", "youngs", "adulst", "olds"};
        
        int count_person = 0; 
        while(true){
            System.out.printf("Enter a birth year of %dth person > ",count_person+1);
            birth_year = s.nextInt();

            if(birth_year > 2021) break;

            age[count_person] = 2023 - birth_year + 1;

            if(age[count_person] >= 60) count[5]++;
            else if(age[count_person] >= 30) count[4]++;
            else if(age[count_person] >= 20) count[3]++;
            else if(age[count_person] >= 13) count[2]++;
            else if(age[count_person] >= 7) count[1]++;
            else count[0]++;

            count_person++;
        }

        System.out.println();

        for(i=0; i<count_person; i++)
            System.out.printf("%dth person are %d years old.\n",i+1, age[i]);

        System.out.println();

        for(i=0; i<6; i++)
            System.out.printf("There are %d %s.\n",count[i], kind[i]);

        s.close();
    }
}
