package bb;

abstract class Cosme1 extends Cosme {
   
    @Override
    public void Type(int y){
        
        if(y == 1){
            
            System.out.println("==========Lipstick==========");
            String[] jy = new String[]{"1.Mayblline","2.L'OREAL"};
            System.out.println(jy[0]);
            System.out.println(jy[1]);
        
        }
        else if(y == 2){
            
            System.out.println("===========Fundation==========");
            String[] jr = new String[]{"1.Maybelline","2.L,OREAL"};
            System.out.println(jr[0]);
            System.out.println(jr[1]);
        
        }
        else if(y == 3){
            
            System.out.println("==========Concealer==========");
            String[] jj = new String[]{"1.Maybelline","2.L'OREAL"};
            System.out.println(jj[0]);
            System.out.println(jj[1]);
            
        }
        else if(y == 4){
            
            System.out.println("===========Aimer==========");
            String[] hi = new String[]{"1.Maybelline","2.L'OREAL"};
            System.out.println(hi[0]);
            System.out.println(hi[1]);
            
        }
        else if(y == 5){
            
            System.out.println("=========Eyeshadow==========");
            String[] hl = new String[]{"1.Maybelline","2.L'OREAL"};
            System.out.println(hl[0]);
            System.out.println(hl[1]);
        
        }
    
    }
    
    @Override
    public void Color(){
        
        System.out.print("black");
    
    }
    
    @Override
    public void Style(){
        
        System.out.println("good");
    
    }
}
