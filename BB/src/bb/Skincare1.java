package bb;

import java.util.*;
abstract class Skincare1 extends Skincare {
    
   @Override
    public void Type1(int lk){
        
        Scanner kb00 = new Scanner(System.in);
        System.out.print("1.Man or 2.Woman : ");
        int gk = kb00.nextInt();
                
        
        if(lk == 1){
            
            System.out.println("=========Lotion============");
            String[] jo = new String[]{"1.NEVIA","2.SISTRA"};
            System.out.println(jo[0]);
            System.out.println(jo[1]);
            
        }
        else if(lk == 8){
            
            System.out.println("==========Soap==========");
            String[] ju = new String[]{"1.NEVIA","2.SISTRA"};
            System.out.println(ju[0]);
            System.out.println(ju[1]);
        
        }
    }
    
    @Override
    public void Style20(int yu){}
    
    @Override
    public void Sty(int ou){
        
        switch(ou){
            
            case 1 : Man(ou);
            break;
            
            case 2 : Woman(ou);
            break;
            
            default : System.out.println(">>>>>Wrong<<<<<");
            break;
        
        }
    
    }
    
    @Override
    public void Man(int ue){}
    
    @Override
    public void Woman(int re){}
    
}
