package gevaexs.PE;
import java.math.BigInteger;

public class Prob20 {
    public static void main(String[] args) {
            BigInteger res = a(new BigInteger("100"));
            
            System.out.println(sumd(res));
    }
    
    public static BigInteger a(BigInteger num){
        BigInteger sum = new BigInteger("1");
        BigInteger i = new BigInteger("1");
        for(; i.compareTo(num) == -1; i = i.add(new BigInteger("1"))){
            sum = sum.multiply(i);
        }
        return sum;
    }
    
    public static BigInteger sumd(BigInteger num){
       BigInteger sum = new BigInteger("0");
       while(num.compareTo(new BigInteger("0")) == 1){
           sum = sum.add(num.mod(new BigInteger("10")));
           num = num.divide(new BigInteger("10"));
       }
       
       return sum;
    }
}