package bb;

import java.util.Scanner;
abstract class Cosmetic extends Menu {
    
    private int b;
    @Override
    public void menu(){
        
        String[] m1 = new String[]{"1.Cosmetics"};
        
        System.out.println("************Menu*************");
        System.out.println(m1[0]);
        //ystem.out.println(m1[1]);
        
        Scanner kb6 = new Scanner(System.in);
        System.out.print("What do you want? : ");
        int jb = kb6.nextInt();
        setCos(jb);
        
        
        
    }
    
   @Override
    public void setCos(int k){
        
        this.b = k;
        if(b == 1){
            
            System.out.println("==========Cosmetics==========");
            String[] ab = new String[]{"1.Lipstick","2.Fundation","3.Eyeshadow","4.Primer","5.Concealer"};
            System.out.println(ab[0]);
            System.out.println(ab[1]);
            System.out.println(ab[2]);
            System.out.println(ab[3]);
            System.out.println(ab[4]);
        
        }
        else if(b == 2){
            
            System.out.println("===========Skincare==========");
            String[] ac = new String[]{"1.Lotion","2.Soap"};
            System.out.println(ac[0]);
            System.out.println(ac[1]);
        
        }
    
    }

    
}
