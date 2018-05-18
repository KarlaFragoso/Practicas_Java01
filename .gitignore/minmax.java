public class RangoDeValores {
    
    
    
   public static void main(String[] args) {
        
        
        int min = -2147483648;
         
        int max = 2147483647;
         
        byte mmin = -128;
         
        byte mmax = 127;
         
        short mi = -32768;
         
        short ma = 32767;
         
        long miin = -922337203;
         
        long maax = 922337203;
         
        float minn = (float) -34.10;
         
        float maxx = (float) 34.10;
        
        System.out.println("Tipo\tMinimo\tMaximo");
        
        System.out.println("int\t" + Integer.MIN_VALUE + "\t" + Integer.MAX_VALUE);
        
        System.out.println("byte\t" + Byte.MIN_VALUE + "\t" + Byte.MAX_VALUE);
        
        System.out.println("short\t" + Short.MIN_VALUE + "\t" + Short.MAX_VALUE);
       
        System.out.println("long\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        
        System.out.println("float\t" + Float.MIN_VALUE + "\t" + Float.MAX_VALUE);
        
    }
}