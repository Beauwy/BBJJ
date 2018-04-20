package bb;

import java.util.*;
public class JJ {
    
    public int jk;
    public int bi;
    public int ci;
    public void kk(){
        
        Scanner kb3 = new Scanner(System.in);
        int ab = 0;
        
        do{
            
            System.out.print("1.CEO or 2.ADMIN : ");
            int ac  = kb3.nextInt();
            switch(ac){
                case 1 : login();
                System.out.println("****************************");
                
                break;
                
                case 2 : login1();
                System.out.println("****************************");
                Cosmetic bb = new Cosmetic(){};
                bb.menu();
                Scanner kb7 = new Scanner(System.in);
                System.out.print("What do you want? : ");
                jk = kb7.nextInt();                
                switch(jk){
                    case 1 : Cosme1 mm = new Cosme1(){};
                             mm.Type(jk);
                             break;
                    case 2 : Skincare1 ss = new Skincare1(){};
                             ss.Type(jk);
                             break;
                    default : System.out.println("Wrong!!!");
            }
                
                break;
                default : System.out.println("Wrong");
            
            }
        
        }while(ab == 3);
        
    }
    
    public String name = "CEO";
    public String pass = "9999";
    public void login(){
        
        Scanner kb1 = new Scanner(System.in);
        String c,c1,d;
        
        do{
        
            System.out.print("Enter your ID : ");
            c = kb1.nextLine();
            c1 = c.toUpperCase();
            System.out.print("Enter your password : ");
            d = kb1.nextLine();
            
            
            
        }
        while(!(c1.equals(name) && d.equals(pass)));
    
}
    
    public String name1 = "ADMIN";
    public String pass1 = "6666";
    public void login1(){
        
        Scanner kb2 = new Scanner(System.in);
        String a,a1,e;
        
        
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
