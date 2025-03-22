package StepK;
      
public class Main{
    
    public static void main(String[] args) {
        
        MenuPan menupan = new MenuPan();
        menupan.input();

        String[] kind = {"num", "name", "origin", "price"};
        System.out.println("================================================");
        for(int i=0; i<kind.length; i++){
            System.err.printf("%s",kind[i]);
            System.out.print("     ");
           
        }
        menupan.output();

        }
}        


