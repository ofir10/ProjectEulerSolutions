package gevaexs.PE;

import java.math.BigInteger;

public class Prob10 {
    public static void main(String[] args)
    {
        BigInteger sum =  new BigInteger("0");
        for(int i = 2; i < 257; i++)
        {
            if(isPrime(i)){
                sum = sum.add(new BigInteger(i + ""));
                System.out.println("i: " + i);
            }
        }
        System.out.println( "sum: " + sum );
        System.out.println("1" + isPrime(256));

    }
     public static boolean isPrime(int num)
    {
        for(int i = 2; i < num; i++)
        {
            if(num%i ==0)
                return false;
        }
        return true;
    }
    
}

//Answer: 142913828922
//              6min 12sec


/// WOW BEST ASNWER!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
//    public static void main(String[] args) {
//		int curPrime = 5;
//		long summation = 5; //2 + 3
//		
//		while(curPrime < 2000000) {
//			if(isPrime(curPrime)) {
//				summation += curPrime;
//			}
//			
//			curPrime += 2;
//		}
//		
//		System.out.println(summation);
//	}
//	
//	public static boolean isPrime(int val) {
//		for(int x = 3; x <= (int)Math.sqrt(val); x += 2) {
//			if(val % x == 0) {
//				return false;
//			}
//		}
//		
//		return true;
//	}