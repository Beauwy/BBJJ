
package bb;

import java.util.*;
abstract class PJ implements JP  {
    
    @Override
    public void se(){
        
        int abc;
        Scanner kb4 = new Scanner(System.in);
        System.out.print("What do you want? : ");
        abc = kb4.nextInt();
        
        switch(abc){
            case 1 : cosmetics();
                break;
            case 2 : skincare();
                break;
            default : System.out.println("Wrong");
        }
    
    }
    
    @Override
    public void cosmetics(){
        
        String[] an = new String[]{"1.Lipstick","2.Under Tone","3.Eyeshadow","4.Primer","5.Concealer"};
        
        System.out.println(an[0]);
        System.out.println(an[1]);
        System.out.println(an[2]);
        System.out.println(an[3]);
        System.out.println(an[4]);
    
    }
    
    @Override
    public void skincare(){
        
        int ai;
        Scanner kb5 = new Scanner(System.in);
        System.out.print("1.Man or 2.Woman : ");
        ai = kb5.nextInt();
        switch(ai){
            
            case 1 : man();
            break;
            case 2 : woman();
            break;
            default : System.out.println("Wrong");
        
        }
    
    }
    
    @Override
    public void man(){
        
        String[] as = new String[]{"1.Lotion","2.Cream"};
        
        System.out.println(as[0]);
        System.out.println(as[1]);
    
    }
    
    @Override
    public void woman(){
        
        String[] at = new String[]{"1.Lotion","2.Cream","3.Serum"};
        
        System.out.println(at[0]);
        System.out.println(at[1]);
        System.out.println(at[2]);
    
    }
   
        
        }
    
   @Override
    public void brand(){}
    
    @Override
    public void type(){}
    

