package StepC;
import java.util.Scanner;

public class C05 {
    public static void main(String[] args) {
        C05 stepC = new C05();
        stepC.c05();
    }

    void c05(){
        int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a month > ");
        int month = s.nextInt();

        System.out.print("Enter a day > ");
        int day = s.nextInt();

        int day_count = 0;

        if((month > 12 || month< 1) || (days[month-1] < day || day < 0))
            System.out.println("This date is not valid.");
        
        else{
            for(int i=0; i<month-1; i++)
                day_count += days[i]; 
            
            day_count += day;

            System.out.println("This date is "+day_count+"th of the year");
        }

        s.close();
    }

}