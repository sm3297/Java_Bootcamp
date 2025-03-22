package StepJ;
import java.util.Scanner;

public class J04{
    public static void main(String[] args) {
        J04 StepJ = new J04();
        StepJ.j04();
    }

    void j04(){
        
        Scanner s = new Scanner(System.in);

        int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int[] m = new int[2];
        int[] d = new int[2];
        String[] type= {"First" , "Second"};
        int dum = 0;

        for(int i=0; i<2; i++){
            System.out.printf("Enter %s day (month day) > ", type[i]);
            m[i] = s.nextInt();
            d[i] = s.nextInt();
        }

        for(int i=0 ; i<2 ; i++){
            if(((m[i] > 12) || (m[i] < 1)) || ((d[i] > monthdays[d[i]-1]) || (d[i] < 1))){
                System.out.printf("Invalid input!");
                dum = 1;
                break;
            }    
        }
        if(dum != 1)
        System.out.printf("The interval between the two dates is %d\n",Math.abs(CalcDate(m[0], d[0]) - CalcDate(m[1], d[1]))); 

        s.close();
    }

    int CalcDate(int month, int day){
        int monthdays[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int t_days = 0;
    
        if(month == 1) 
            return day;
        
        else{
            for(int i=0; i<month-1; i++)
                t_days+= monthdays[i];
            return t_days + day;
        }
    }
    
}
