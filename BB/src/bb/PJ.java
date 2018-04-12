
package bb;

import java.util.*;
abstract class PJ {
    
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
            case 3 : perfume();
                break;
            case 4 : dietary();
                break;
            default : System.out.println("Wrong");
        }
    
    }
    
    public void cosmetics(){
        
        String[] an = new String[5];
        an[0] = "1.Lipstick";
        an[1] = "2.Under Tone";
        an[2] = "3.Eyeshadow";
        an[3] = "4.Primer";
        an[4] = "5.Concealer";
        
        System.out.println(an[0]);
        System.out.println(an[1]);
        System.out.println(an[2]);
        System.out.println(an[3]);
        System.out.println(an[4]);
    
    }
    
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
    
    public void man(){
        
        String[] as = new String[2];
        as[0] = "1.Lotion";
        as[1] = "2.Cream";
        
        System.out.println(as[0]);
        System.out.println(as[1]);
    
    }
    
    public void woman(){
        
        String[] at = new String[3];
        at[0] = "1.Lotion";
        at[1] = "2.Cream";
        at[2] = "3.Serum";
        
        System.out.println(at[0]);
        System.out.println(at[1]);
        System.out.println(at[2]);
    
    }
    
    public void perfume(){
        
        int dd;
        Scanner kb6 = new Scanner(System.in);
        System.out.print("1.Man or 2.Woman : ");
        dd = kb6.nextInt();
        
        switch(dd){
            
            case 1 : men();
            break;
            case 2 : women();
            break;
            default : System.out.println("Wrong");
        
        }
    
    }
    
    public void men(){}
    
    public void women(){}
    
    public void dietary(){
        
        String[] by = new String[5];
        by[0] = "1.Collagen";
        by[1] = "2.Gluta";
        by[2] = "3.Vitamin";
        by[3] = "4.Calcium";
        by[4] = "5.Weight Logs Supplements";
    
    }
    
    
    
}
