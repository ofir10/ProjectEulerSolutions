package gevaexs.PE;

import java.math.BigInteger;
import java.util.ArrayList;

public class Prob16 {
    public static void main(String[] args) 
    {
         BigInteger temp = new BigInteger("10");
         BigInteger num = new BigInteger("2");
         num = num.pow(1000);
         BigInteger sum = new BigInteger("0");
         int numLength = num.toString().length();
         ArrayList arr = new ArrayList();
        //<Integer>???
         for(int i = 0; i < numLength; i++)
         {
             sum = sum.add(num.mod(temp));
             num = num.divide(temp);
         }
         
         System.out.println("Sum: " + sum);
        
    }   
}