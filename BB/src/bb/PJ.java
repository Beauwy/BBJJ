
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
    
    public void cosmetics(){}
    
    public void skincare(){}
    
    public void perfume(){}
    
    public void dietary(){}
    
    
    
}
