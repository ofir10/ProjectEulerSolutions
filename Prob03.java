package gevaexs.PE;

import java.math.BigInteger;

public class Prob03 {
    public static void main(String[] args) 
    {
        BigInteger num = new BigInteger("600851475143");
        BigInteger bigest = new BigInteger("0");
//        
//            for(String i = "2"; new BigInteger(i).compareTo(new BigInteger(num.toString())) == -1; i = String.valueOf(Integer.parseInt(i)+1)){
//            if(num.mod(new BigInteger(i)) == new BigInteger("0") && isPrime(i)){
//                if (bigest.compareTo(new BigInteger(String.valueOf(i))) == 1)
//                     bigest = new BigInteger(String.valueOf(i));
//            }
//        }
            
       // System.out.println(bigest);
        
        for(String i = "2"; Integer.parseInt(i) < 775146; i = String.valueOf(Integer.parseInt(i)+1)){         
            BigInteger temp = num.mod(new BigInteger(i));
            BigInteger temp2 = new BigInteger("0");
            
            String tempS = temp.toString();
            String temp2S = temp2.toString();
            
            if(tempS.compareTo(temp2S) == 0 && isPrime(i)){
                if (bigest.compareTo(new BigInteger(String.valueOf(i))) == -1){
                     bigest = new BigInteger(String.valueOf(i));
                }
            }
        }
        
        System.out.println(bigest);
    }
    
    public static boolean isPrime(String val) {
            if(Integer.parseInt(val)== 2)
                return true;
                
            for(int x = 3; x <= (int)Math.sqrt(Integer.parseInt(val)); x ++) {
                    if(Integer.parseInt(val) % x == 0) {
                            return false;
                    }
            }

            return true;
    }
}
