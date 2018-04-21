package bb;

import java.util.*;
abstract class Cosme1 extends Cosme {
   
    @Override
    public void Type(int y){
                
        switch (y) {
            case 1 :
                System.out.println("==========Lipstick==========");
                String[] jy = new String[]{"1.Mayblline","2.L'OREAL"};
                System.out.println(jy[0]);
                System.out.println(jy[1]);
                Scanner kb10 = new Scanner(System.in);
                System.out.print("Enter number : ");
                int u = kb10.nextInt();
                if(u == 1){
                    
                    Style(u);
                    
                }
                else if(u == 2){
                    
                    Style(u);
                    
                }   break;
            case 2 :
                System.out.println("===========Foundation==========");
                String[] jr = new String[]{"1.Maybelline","2.LOREAL"};
                System.out.println(jr[0]);
                System.out.println(jr[1]);
                
                Scanner kb09 = new Scanner(System.in);
                System.out.print("Enter number : ");
                int ty = kb09.nextInt();
                
                if(ty == 1){
                    
                    Style1(ty);
                
                }
                
                else if(ty == 2){
                    
                    Style1(ty);
                
                }
                
                break;
            case 3:
                System.out.println("==========Concealer==========");
                String[] jj = new String[]{"1.Maybelline","2.L'OREAL"};
                System.out.println(jj[0]);
                System.out.println(jj[1]);
                
                Scanner kb11 = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int yu = kb11.nextInt();
                if(yu == 1){
                    
                    Style2(yu);
                    
                
                }
                else if(yu == 2){
                    
                    Style2(yu);
                    
                
                }
                
                break;
            case 4:
                System.out.println("===========Primer==========");
                String[] hi = new String[]{"1.Maybelline","2.L'OREAL"};
                System.out.println(hi[0]);
                System.out.println(hi[1]);
                
                Scanner sc1 = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int po = sc1.nextInt();
                if(po == 1){
                    
                    Style3(po);
                
                }
                else if(po == 2){
                    
                    Style3(po);
                
                }
                
                
                break;
            case 5:
                System.out.println("=========Eyeshadow==========");
                String[] hl = new String[]{"1.Maybelline","2.L'OREAL"};
                System.out.println(hl[0]);
                System.out.println(hl[1]);
                
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int pa = sc2.nextInt();
                if(pa == 1){
                   
                                    
                    Style4(pa);
                
                }
                else if(pa == 2){
                    
                    Style4(pa);
                    
                
                }
                
                
                break;
            default:
                System.out.println("!!Wrong!!");
                break;
        }
    
    }
    
    @Override
    public void Color(int x){
        
        
        switch(x){
            
            case 1 :            
            System.out.println("1.Peach Bloom : 89 BATH");
            System.out.println("2.Pink Bloom : 89 BATH");  
            break;
        
            case 2 :
            System.out.println("1.Striking Orange : 99 BATH");
            System.out.println("2.Vivid Peach : 99 BATH");
            System.out.println("3.Wild Cherry : 99 BATH");
            break;
        
            case 3 :
             System.out.println("1.Blackberry : 199 BATH");
             System.out.println("2.Cherry : 199 BATH");
             System.out.println("3.Cinnamon :199 BATH");
             break;
             
            default : System.out.println("!!Wrong!!"); break;
        }
    
    }
    
    @Override
    public void Style(int e){
  
        if(e == 1){
            
            System.out.println("1.Lip Balm");
            System.out.println("2.Lipstick");
            Scanner sc4 = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int t = sc4.nextInt();
        switch (t) {
            case 1:
                System.out.println("1.Babylips Loves Color Bright Out Loud");
                System.out.println("2.Baby Lips Bloom");
                System.out.println("3.Baby lips Candy Wow");
                Scanner kb14 = new Scanner(System.in);
                System.out.print("Enter number : ");
                int li = kb14.nextInt();
                Color(li);
                break;
            case 2: System.out.println("1.Lip Flush Bitten Lips");
                    System.out.println("2.Super Stay Matte Ink {Kiss Proof}");
                    System.out.println("3.Color Jolt");
                    Scanner kb15 = new Scanner (System.in);
                    System.out.print("Enter Number : ");
                    int ch = kb15.nextInt();
                    Color(ch);
                       break;
            default : System.out.println("!!Wrong!!"); break;
        }
        }
        else if(e == 2){
           
                System.out.println("1.Color Riche Collection Star Le Nudes"); 
                System.out.println("2.Color Riche Moist Matt");
                System.out.println("3.Color Riche Cream");
                System.out.println("4.Tint Caresse Lip");
                
                Scanner kb13 = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int lk = kb13.nextInt();
                Color1(lk);
          
        }
    
    
        
}
    @Override
    public void Style1(int tt){
        
        if(tt == 1){
               
            System.out.println("1.Dream Satin Liquid Foundation SPF 24 PA+++");     
            System.out.println("2.Dream Velvet Matte");
            System.out.println("3.FIT me! Matte+Poreless Liquid Foundation");
            Scanner kb05 = new Scanner(System.in);
            System.out.print("Enter number : ");
            int kt = kb05.nextInt();
            Color3(kt);
            
        }
        else if(tt == 2){
            
                
                System.out.println("True Match Liquid Foundation");
                System.out.println("Lucent Magique Light-Infusing Foundation");
                System.out.println("Infallible 24H Stay Fresh Foundation");
                Scanner kb17 = new Scanner(System.in);
            System.out.print("Enter number : ");
            int kt1 = kb17.nextInt();
            Color4(kt1);
        
        }
    }
    
    @Override
    public void Color1(int tu){
        
        switch(tu){
            
            case 1 :        
            System.out.println("1.B406 Barry Mga : 399 BAHT");
            System.out.println("2.P412 Barry Pink : 399 BAHT");
        break;
        
            case 2 :
            System.out.println("1.219 Rose Fondue : 399 BAHT");
            System.out.println("2.220 Chocolat Rouge : 399 BAHT");
            System.out.println("3.233 Rouge-Porter : 399 BAHT");
            System.out.println("4.234 Ruby Garde : 399 BAHT");
            System.out.println("5.235 Plum Mannickvince : 399 BAHT");
            System.out.println("6.BP501 Peachy Brown : 399 BAHT");
            System.out.println("7.C511 Crayon Sunset : 399 BAHT");
            System.out.println("8.C511 Orange Power : 399 BAHT");
            System.out.println("9.P501 Sakura Pattle : 399 BAHT");
            System.out.println("10.R516 Lincoln Rose : 399 BAHT");
            System.out.println("11.R519 Blues of Reds : 399 BAHT");
                    break;
        
            case 3 :
                System.out.println("1.C405 Barry Coral : 399 BAHT");
           
        break;
        
            case 4 :
             System.out.println("1.B01 Sakura Blossom : 399 BAHT");
             System.out.println("2.B04 Orchid Blossom : 399 BAHT");
             System.out.println("3.B06 Rose Blossom : 399 BAHT");
             System.out.println("4.B07 Lilly Blossom : 399 BAHT");
             break;
        
            default : System.out.println("!!Wrong!!");
        }
      
       
    
    }
    
   @Override
    public void Style2(int ti){
        
        switch(ti){
            case 1 :
        System.out.println("1.The Nudes Palette : 549 BAHT");
        System.out.println("2.The Blushed Nudes Palette : 549 BAHT");
        System.out.println("3.The 24k Nudes Palette : 549 BAHT");
        System.out.println("4.Gigi Hadid Eyeshadow Palette : 549 BAHT");
        Scanner kb01 = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int re = kb01.nextInt();
        break;
            case 2 :
        System.out.println("1.Color Riche La Palette Nudes : 649 BAHT");
        System.out.println("2.Color Riche La Palette Ombra : 649 BAHT");
        System.out.println("3.Color Riche La Palette Gold : 649 BAHT");
        System.out.println("4.Color Riche Le Stylo Smoky Shadow Stick");
        Scanner kb02 = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int yr = kb02.nextInt();
        if(yr == 4){
            
            Color5(yr);
        
        }
    }
    }
    
    @Override
    public void Style3(int yq){
        
        if(yq == 1){
        System.out.println("1.Dream One Day Perfect : 379 BAHT");
        System.out.println("2.Baby Skin : 249 BAHT");
        System.out.println("3.Baby Skin Pore Eraser : 329 BAHT");
        Scanner kb03 = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int yn = kb03.nextInt();
        }
        else if(yq == 2){
            
        System.out.println("True Match Blur Cream Primer : 399 BAHT");
        System.out.println("Lucent Magique Le L'E`Clat Booster Primer : 399 BAHT");
        Scanner kb04 = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int tb = kb04.nextInt();
        
        }
    }
    
    @Override
    public void Style4(int ky){
        
        if(ky == 1){
            
            switch(ky){
                
                case 1 : 
                System.out.println("1.FIT me! Concealer");
                System.out.println("2.Pure Minerals Healthy Natural Concealer");
                System.out.println("3.Master Camouflage duo Concealer");
                Scanner kb06 = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int ae = kb06.nextInt();
                Color7(ae);
                break;
                
                case 2 :
                System.out.println("1.True Match Concealer");
                System.out.println("2.True Match Liquid Foundation SPF16 PA++");
                Scanner kb07 = new Scanner(System.in);
                System.out.print("Enter Number : ");
                int ax = kb07.nextInt();
                Color6(ax);
                break;
                default : System.out.println("!Wrong!");
            
            }
        
        }
        
    
    }
    
    @Override
    public void Color2(int yr){
        
        if(yr == 1){
            
            if(yr == 1){
                
                System.out.println("1.10 Light : 249 BAHT");
                System.out.println("2.15 Fair : 249 BAHT");
                System.out.println("3.20 Sand : 249 BAHT");
                System.out.println("4.25 Medium : 249 BAHT");
                System.out.println("5.30 Cafe : 249 BAHT");
                System.out.println("6.35 Deep : 249 BAHT");
            
            }
            if(yr == 2){
                
                System.out.println("1.1 Fresh : 219 BAHT");
                System.out.println("2.3 Medium Sand : 219 BAHT");
                System.out.println("3.2 Natural : 219 BAHT");
            
            }
            if(yr == 3){
                
                System.out.println("1.Green Fawn : 229 BAHT");
                System.out.println("2.Green Sand : 229 BAHT");
                System.out.println("3.Peach Fawn : 229 BAHT");
                System.out.println("4.PeaCH Sand : 229 BAHT");
            
            }
            if(yr == 4){
                
                System.out.println("1.Light : 549 BAHT");
                System.out.println("2.Medium : 549 BAHT");
            
            }
        
        }
    
    }
    
    @Override
    public void Color3(int op){
        
        if(op == 1){
            
            if(op == 1){
                
                System.out.println("1.02 : 449 BATH");
                System.out.println("2.01 : 449 BATH");
                System.out.println("3.B00 : 449 BATH");
                System.out.println("4.B2 : 449 BATH");
            }
                if(op == 2){
                
                System.out.println("1.40 : 429 BATH");
                System.out.println("2.05 : 429 BATH");
                System.out.println("3.10 : 429 BATH");
                System.out.println("4.60 : 429 BATH");
                System.out.println("5.75 : 429 BATH");
            
            }
            if(op == 3){
               
                System.out.println("1.120 : 349 BATH");
                System.out.println("2.122 : 349 BATH");
                System.out.println("3.125 : 349 BATH");
                System.out.println("4.128 : 349 BATH");
                System.out.println("5.130 : 349 BATH");
                System.out.println("6.220 : 349 BATH");
                System.out.println("7.228 : 349 BATH");
                System.out.println("8.230 : 349 BATH");
                System.out.println("9.235 : 349 BATH");
                System.out.println("10.238 : 349 BATH");
                System.out.println("11.310 : 349 BATH");
                System.out.println("12.322 : 349 BATH");
            
            }
        }
    }
    
    @Override
    public void Color4(int tr){
        
        if(tr == 1){
            
            if(tr == 1){
                
                System.out.println("1.G1 Gold Ivory : 449 BAHT");
                System.out.println("2.G2 Gold Porcelain : 449 BAHT");
                System.out.println("3.G3 Gold Vanila : 449 BAHT");
                System.out.println("4.N1 Nude Ivory : 449 BAHT");
              
            }
            if(tr == 2){
                
                System.out.println("1.N1 : 449 BAHT");
                System.out.println("2.N2 : 449 BAHT");
                System.out.println("3.N3 : 449 BAHT");
                System.out.println("4.N7 : 449 BAHT");
                System.out.println("5.G1 : 449 BAHT");
                System.out.println("6.G2 : 449 BAHT");
                System.out.println("7.G2.5 : 449 BAHT");
                System.out.println("8.G3 : 449 BAHT");
                System.out.println("9.G4 : 449 BAHT");
                System.out.println("10.G4.5 : 449 BAHT");
                System.out.println("11.G5 : 449 BAHT");
                System.out.println("12.G6 : 449 BAHT");
                System.out.println("13.G7 : 449 BAHT");
            
            }
            if(tr == 3){
                
                System.out.println("1.G4 Gold Shell : 449 BAHT");
                System.out.println("2.G7 Gold Bronze : 449 BAHT");
                System.out.println("3.N2 Pure Porclain : 449 BAHT");
                System.out.println("4.N5 Pure Honey : 449 BAHT");
                System.out.println("5.N7 Pure Bronze : 449 BAHT");
                System.out.println("6.R2 Rose Porclain : 449 BAHT");
            
            }
            if(tr == 4){
                
                System.out.println("1.115 Nude Beige : 449 BAHT");
                System.out.println("2.125 Natural Rose : 449 BAHT");
                System.out.println("3.130 True Beige : 449 BAHT");
                System.out.println("4.150 Radian Beige : 449 BAHT");
            
            }
        
        }
    
    }
    
    @Override
    public void Color5(int tw){
        
        if(tw == 4){
            
            System.out.println("1.101 Ante Belles : 399 BAHT");
            System.out.println("2.103 Almond Pink : 399 BAHT");
            System.out.println("3.106 Gemmer Khaki : 399 BAHT");
            System.out.println("4.109 Le Grand : 399 BAHT");
            System.out.println("5.110 Mocha Coffee : 399 BAHT");
            System.out.println("6.114 Royal Graffty : 399 BAHT");
        
        }
    
    }
    
    @Override
    public void Color6(int mn){
        
        
            if(mn == 1){
                
                System.out.println("1.W1-2-3 Fair Light Warm : 279 BAHT");
                System.out.println("2.W4-5 Medium Warm : 279 BAHT");
                System.out.println("3.N4-5 Medium Nude : 279 BAHT");
            
            }
            if(mn == 2){
                
                System.out.println("1.N1 Nude Ivory : 449 Baht");
                System.out.println("2.N3 Nude Vanilla : 449 Baht");
                System.out.println("3.N7 Nude Ambre : 449 Baht");
                System.out.println("4.G1 Gold Ivory : 449 Baht");
                System.out.println("5.G3 Gold Vanilla : 449 Baht");
                System.out.println("6.G5 Gold Cream : 449 Baht");
            
            
        
        }
    
    }
    
    @Override
    public void Color7(int uo){
        
        if(uo == 1){
                
                System.out.println("1.10 Light : 249 BAHT");
                System.out.println("2.15 Fair : 249 BAHT");
                System.out.println("3.20 Sand : 249 BAHT");
                System.out.println("4.25 Medium : 249 BAHT");
                System.out.println("5.30 Cafe : 249 BAHT");
                System.out.println("6.35 Deep : 249 BAHT");
            
            }
            if(uo == 2){
                
                System.out.println("1.1 Fresh : 219 BAHT");
                System.out.println("2.3 Medium Sand : 219 BAHT");
                System.out.println("3.2 Natural : 219 BAHT");
            
            }
            if(uo == 3){
                
                System.out.println("1.Green Fawn : 229 BAHT");
                System.out.println("2.Green Sand : 229 BAHT");
                System.out.println("3.Peach Fawn : 229 BAHT");
                System.out.println("4.PeaCH Sand : 229 BAHT");
            
            }
            if(uo == 4){
                
                System.out.println("1.Light : 549 BAHT");
                System.out.println("2.Medium : 549 BAHT");
            
            }
        
        
    
    }
}
