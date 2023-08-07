/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gevaexs.PE;

import java.math.BigInteger;

/**
 *
 * @author Home
 */
public class Prob12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BigInteger i = new BigInteger("1");
        BigInteger count = new BigInteger("1");
        for(; divNum(i) < 500; i = i.add(count)) {
            count = count.add(new BigInteger("1"));           
        }
        System.out.println("Num is:" + i);
    }
    
    // number of divisiors
    public static int divNum(BigInteger num) {
        int count = 0;
        for(BigInteger i = new BigInteger("1"); i.compareTo(sqrtBig(num)) <= 0;  i = i.add(new BigInteger("1"))) {
            if(num.mod(i).equals(new BigInteger("0"))){
                count++;                
            }
        }
        
        return 2 * count;
        
    }
    
   public static BigInteger sqrtBig(BigInteger n) {
	BigInteger a = BigInteger.ONE;
	BigInteger b = n.shiftRight(5).add(BigInteger.valueOf(8));
	while (b.compareTo(a) >= 0) {
		BigInteger mid = a.add(b).shiftRight(1);
		if (mid.multiply(mid).compareTo(n) > 0) {
			b = mid.subtract(BigInteger.ONE);
		} else {
			a = mid.add(BigInteger.ONE);
		}
	}
	return a.subtract(BigInteger.ONE);
}
   
    
    
}
