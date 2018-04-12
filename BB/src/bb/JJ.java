
package bb;

import java.util.*;
public class JJ {
    
    public void kk(){
        
        Scanner kb3 = new Scanner(System.in);
        int ab = 0;
        
        do{
            
            System.out.print("1.CEO or 2.CASHCHEER : ");
            int ac  = kb3.nextInt();
            switch(ac){
                case 1 : login();
                System.out.println("****************************");
                JB cc = new JB();
                cc.check();
                break;
                
                case 2 : login1();
                System.out.println("****************************");
                BJ bb = new BJ();
                bb.menu();
                break;
                default : System.out.println("Wrong");
            
            }
        
        }while(ab == 3);
        
    }
    
    public void login(){
        
        Scanner kb1 = new Scanner(System.in);
        String c,c1,d;
        String name = "CEO";
        String pass = "9999";
        
        
        do{
        
            System.out.print("Enter your ID : ");
            c = kb1.nextLine();
            c1 = c.toUpperCase();
            System.out.print("Enter your password : ");
            d = kb1.nextLine();
            
            
            
        }
        while(!(c1.equals(name) && d.equals(pass)));
    
}
    
    public void login1(){
        
        Scanner kb2 = new Scanner(System.in);
        String a,a1,e;
        String name1 = "CASHCHEER";
        String pass1 = "6666";
        
        do{
            
            System.out.print("Enter your ID : ");
            a = kb2.nextLine();
            a1 = a.toUpperCase();
            System.out.print("Enter your password : ");
            e = kb2.nextLine();
            
        }
        while(!(a1.equals(name1) && e.equals(pass1)));
    
    }
    
    public void menu(){}
    
    public void check(){}
    
}
