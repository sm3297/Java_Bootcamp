package StepI;
//import java.util.Scanner;
import java.util.Random;

public class I06 {
    public static void main(String[] args) {
        I06 StepI = new I06();
        StepI.i06();
    }

    void i06(){ 

    int num = 0;
    System.out.println("Generating 10 numbers...");
    GetRandom(num);

    }

    void GetRandom(int num){

    int[] n = new int[10];
    int c3 = 0;
    int c2 = 0;
    int c1 = 0; 

    for(int i=0; i<10; i++){
        n[i] =  (int)((Math.random()*100)+1);
        if(n[i] >= 70) c3++;
        else if(n[i] >= 40) c2++;
        else c1++;
        System.out.printf("Generated random number is %d\n",n[i]);
    }

    System.out.printf("\n1. Big (>= 70) : %d\n",c3);
    System.out.printf ("2. Normal (>= 40) : %d\n",c2);
    System.out.printf ("3. Small (< 40) : %d\n",c1);
    

    }
}

