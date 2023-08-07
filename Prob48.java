package gevaexs.PE;

import java.math.BigInteger;

public class Prob48 {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");
                
        for( int i = 1; i <= 1000; i++){
            sum = sum.add(new BigInteger("" + i).pow(i));
        }
        
        System.out.println(sum);
        
        System.out.print("Asnwer: ");
        for( int i=10; i > 0; i--)
        {
            System.out.print(sum.toString().charAt(sum.toString().length()-i));
        }
        System.out.println("");
        // or: 
        System.out.println("Answer: " + sum.toString().substring(sum.toString().length()-10));
        System.out.println("");
    }
    
}
