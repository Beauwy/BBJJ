package bb;

import java.util.*;
abstract class Cosme1 extends Cosme {
   
    @Override
    public void Type(int y){
        
        switch (y) {
            case 1:
                System.out.println("==========Lipstick==========");
                String[] jy = new String[]{"1.Mayblline","2.L'OREAL"};
                System.out.println(jy[0]);
                System.out.println(jy[1]);
                Scanner kb10 = new Scanner(System.in);
                System.out.print("Enter number : ");
                int u = kb10.nextInt();
                if(u == 1){
                    
                    Style(u);
                    Color(u);
                    
                }
                else if(u == 2){
                    
                  Style5(u);
                  Color3(u);
                    
                }   break;
            case 2:
                System.out.println("===========Fundation==========");
                String[] jr = new String[]{"1.Maybelline","2.L,OREAL"};
                System.out.println(jr[0]);
                System.out.println(jr[1]);
                Scanner kb9 = new Scanner(System.in);
                System.out.print("Enter number : ");
                int ty = kb9.nextInt();
                if(ty == 1){
                    
                    Style1(ty);
                    Color1(ty);
                
                }
                else if(ty == 2){
                    
                    Style6(ty);
                    Color4(ty);
                
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
                    
                    Style4(yu);
                    Color2(yu);
                
                }
                else if(yu == 2){
                    
                    Style9(yu);
                    Color6(yu);
                
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
                    
                    Style2();
                
                }
                else if(po == 2){
                    
                    Style8();
                
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
                    
                    Style2();
                
                }
                else if(pa == 2){
                    
                    Style7(pa);
                    Color5(pa);
                
                }
                
                
                break;
            default:
                System.out.println("!!Wrong!!");
                break;
        }
    
    }
    
    @Override
    public void Color(int x){
        if(x == 1){
        if(x == 1){
            
            System.out.println("1.Peach Bloom : 89 BATH");
            System.out.println("2.Pink Bloom : 89 BATH");  
        
        }
        if(x == 2){
            
            System.out.println("1.Striking Orange : 99 BATH");
            System.out.println("2.Vivid Peach : 99 BATH");
            System.out.println("3.Wild Cherry : 99 BATH");
        
        }
        if(x == 3){
            
             System.out.println("1.Blackberry : 199 BATH");
             System.out.println("2.Cherry : 199 BATH");
             System.out.println("3.Cinnamon :199 BATH");
        
        }
        }
        else if(x == 2){
        if(x == 1){
            
            System.out.println("1.PK02 : 229 BATH");
            System.out.println("2.RD02 : 229 BATH");
            System.out.println("3.RD01 : 229 BATH");
        
        }
        if(x == 2){
            
            System.out.println("1.05 Loyalist : 249 BATH");
            System.out.println("2.10 Dreamer : 249 BATH");
            System.out.println("3.15 Lover : 249 BATH");
        
        }
        if(x == 3){
            
            System.out.println("1.02 Bittersweet Mandarin : 269 BATH");

            System.out.println("2.04 Show Off Nude : 269 BATH");

            System.out.println("3.05 You Red-Me : 269 BATH");
        
        }
        }
    
    }
    
    @Override
    public void Style(int e){
  
        if(e == 1){
            
            Scanner sc4 = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int t = sc4.nextInt();
        switch (t) {
            case 1:
                System.out.println("1.Babylips Loves Color Bright Out Loud");
                break;
            case 2:
                System.out.println("2.Baby Lips Bloom");
                break;
            case 3:
                System.out.println("3.Baby lips Candy Wow");
                break;
            default : System.out.println("!!Wrong!!");
        }
        if(e == 2){
            switch(e){
            case 1 : 
                System.out.println("1.Lip Flush Bitten Lips");
                break;
            case 2 : 
                System.out.println("2.Super Stay Matte Ink {Kiss Proof}");
                break;
            case 3 : 
                System.out.println("3.Color Jolt");
                break;
            default: 
                System.out.println("Wrong!!");
                break;
        }
        }
    
    }
        
}
    @Override
    public void Style1(int tt){
        
        if(tt == 1){
            
            switch(tt){
                
                case 1 :
                    System.out.println("1.Deram Satin Liquid Foundation SPF 24 PA+++");
                    break;
                case 2 :
                    System.out.println("2.Dream Velvet Matte");
                    break;
                case 3 :
                    System.out.println("3.FIT me! Matte+Poreless Liquid Foundation");
                    break;
                default : System.out.println("!!Wrong!!");
            
            }
        
        }
    }
    
    @Override
    public void Color1(int tu){
        
        if(tu == 1){
            
            if(tu == 1){
                
                System.out.println("1.02 : 449 BATH");
                System.out.println("2.01 : 449 BATH");
                System.out.println("3.B00 : 449 BATH");
                System.out.println("4.B2 : 449 BATH");
            
            }
            if(tu == 2){
                
                System.out.println("1.40 : 429 BATH");
                System.out.println("2.05 : 429 BATH");
                System.out.println("3.10 : 429 BATH");
                System.out.println("4.60 : 429 BATH");
                System.out.println("5.75 : 429 BATH");
            
            }
            if(tu == 3){
               
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
    public void Style2(){
        
        System.out.println("1.The Nudes Palette : 549 BAHT");
        System.out.println("2.The Blushed Nudes Palette : 549 BAHT");
        System.out.println("3.The 24k Nudes Palette : 549 BAHT");
        System.out.println("4.Gigi Hadid Eyeshadow Palette : 549 BAHT");
    
    }
    
    @Override
    public void Style3(){
        
        System.out.println("1.Dream One Day Perfect : 379 BAHT");
        System.out.println("2.Baby Skin : 249 BAHT");
        System.out.println("3.Baby Skin Pore Eraser : 329 BAHT");
    
    }
    
    @Override
    public void Style4(int ky){
        
        if(ky == 1){
            
            switch(ky){
                
                case 1 : System.out.println("1.FIT me! Concealer"); break;
                case 2 : System.out.println("2.Pure Minerals Healthy Natural Concealer"); break;
                case 3 : System.out.println("3.Master Camouflage duo Concealer"); break;
                case 4 : System.out.println("4.Master Camoflage Concealer Palette"); break;
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
    public void Style5(int nj){
        
        if(nj == 1){
            
            switch(nj){
                
                case 1 : System.out.println("1.Color Riche Collection Star Le Nudes"); break;
                case 2 : System.out.println("2.Color Riche Moist Matt"); break;
                case 3 : System.out.println("3.Color Riche Cream"); break;
                case 4 : System.out.println("4.Tint Caresse Lip"); break;
                default : System.out.println("Wrong");
            
            }
        
        }
    
    }
    
    @Override
    public void Color3(int op){
        
        if(op == 1){
            
            System.out.println("1.B406 Barry Mga : 399 BAHT");
            System.out.println("2.P412 Barry Pink : 399 BAHT");
        
        }
        if(op == 2){
            
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
        
        }
        if(op == 3){
            
            System.out.println("1.C405 Barry Coral : 399 BAHT");
        
        }
        if(op == 4){
            
             System.out.println("1.B01 Sakura Blossom : 399 BAHT");
             System.out.println("2.B04 Orchid Blossom : 399 BAHT");
             System.out.println("3.B06 Rose Blossom : 399 BAHT");
             System.out.println("4.B07 Lilly Blossom : 399 BAHT");
        
        }
    
    }
    
    @Override
    public void Style6(int sd){
        
        if(sd == 1){
            
            switch(sd){
                case 1 : System.out.println("1.True Match Genius Foundation"); break;
                case 2 : System.out.println("True Match Liquid Foundation"); break;
                case 3 : System.out.println("Lucent Magique Light-Infusing Foundation"); break;
                case 4 : System.out.println("Infallible 24H Stay Fresh Foundation"); break;
                default : System.out.println("!Wrong!");
            
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
    public void Style7(int oo){
        
        if(oo == 1){
            
            switch(oo){
                
                case 1 : System.out.println("1.Color Riche La Palette Nudes : 649 BAHT"); break;
                case 2 : System.out.println("2.Color Riche La Palette Ombra : 649 BAHT"); break;
                case 3 : System.out.println("3.Color Riche La Palette Gold : 649 BAHT"); break;
                case 4 : System.out.print("4.Color Riche Le Stylo Smoky Shadow Stick");break;
                default : System.out.println("!!Wrong!!");
            
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
    public void Style8(){
        
        System.out.println("True Match Blur Cream Primer : 399 BAHT");
        System.out.println("Lucent Magique Le L'E`Clat Booster Primer : 399 BAHT");
    
    }
    
    @Override
    public void Style9(int tu){
        
        if(tu == 1){
            
            switch(tu){
                
                case 1 : System.out.println("1.True Match Concealer"); break;
                case 2 : System.out.println("2.True Match Liquid Foundation SPF16 PA++"); break;
                default : System.out.println("!!Wrong!!");
            
            }
        
        }
    
    }
    
    @Override
    public void Color6(int mn){
        
        if(mn == 1){
            
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
    
    }
}
