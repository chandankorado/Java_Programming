// Unary operations
public class unary{

    public static void main(String args[]){
    
        int x = 10, y = -20, z = -10;
        boolean a = true;
        
        System.out.println("Unary x=10 y=-20 z=-10");
        System.out.println("");
        System.out.println("x++ = "+x);
        System.out.println("++x = "+(++x));
        System.out.println("x-- = "+x--);
        System.out.println("--x = "+--x);
        System.out.println("++x + y++ = "+(++x + y++));
  
        System.out.println("x<<2 = "+(x<<2));
        System.out.println("x>>>2 = "+(x>>>2));
        System.out.println("y>>2 = "+(y>>2));
        
        
        
             
        System.out.println("~z = "+~z);
        // boolean
        System.out.println("!a = "+(!a));
        System.out.println("x>y&++z>x = "+(x>y&&++z<x));
        System.out.println("x>y|++z>x = "+(x>y|++z>x));
    }
}
