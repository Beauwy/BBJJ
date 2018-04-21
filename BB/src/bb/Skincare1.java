package bb;

class Skincare1 extends Skincare {
    
   @Override
    public void Type1(int lk){
        
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
    public void Style20(){}
    
}
