package bb;

import java.util.*;
public class BB {
    
    
    public static void main(String[] args) {
        
        String a = "Y";
        String b,b1;
        Scanner kb = new Scanner(System.in);
        do{
            
            for (int i=1; i<=40; i++){ 
            System.out.print("-");
            
        }
            
            System.out.println();
            System.out.println("*=*=*=*=*=* Welcome to Shops *=*=*=*=*=*");
            
            for (int i=1; i<=40; i++){ 
            System.out.print("-");
     }
                        
            System.out.println();
            
            JJ aa = new JJ();
            aa.kk();                
            
            System.out.print("What do yo want to end program? Y/N : ");
            b = kb.nextLine();
            b1 = b.toUpperCase();
          }
        while(!(b1.equals(a)));
    }
    
}
