package myjava.mylang;

/*  @author Hiba
    @version 1.0
*/
public class MyMath {
    //static function cube to calculate cube of a number
    //static - can be accessed by class or obiect
    //non-static method / var's can be accessed by objects only
    
    /**
     * 
     * @param x - double value for number
     * @return - double cube
     */
    public static double cube (double x)
    {
        return x * x * x; 
    }
    //max out of 4 numbers
    /**
     * 
     * @param n1 - double num1
     * @param n2 - double num2
     * @param n3 - double num3
     * @param n4 - double num4
     * @return 
     */
    public static double max4(double n1, double n2, double n3, double n4)
    {
        //1st pair n1,n2 - output will pair with n3, output will pair with n4
        
        return Math.max(Math.max(Math.max(n1,n2),n3) , n4);
    }
    
    //non,static function
    /**
     * 
     * @param num
     * @return 
     */
    public int reverse(int num)
    {
        int rev = 0;
        while(num > 0)
        {
            int d = num % 10;
            num = num / 10;
            rev = rev * 10 + d;
            
        }
        return rev;
    }
    
}
