package gevaexs.PE;


import java.math.BigInteger;

public class Prob30 {
    public static void main(String[] args) {
        BigInteger sum = new BigInteger("0");
        BigInteger num = new BigInteger("2");
        int count = 0;
        while(num.compareTo(new BigInteger("1000000")) == -1){
            if(sum(num).compareTo(num) == 0){
                count++;
                System.out.println("num: " + num);
                sum = sum.add(sum(num));
            }
            num = num.add(new BigInteger("1"));
        }
        
        System.out.println("sum: " + sum);
        
    }
    
    public static BigInteger sum(BigInteger num){
        BigInteger sum = new BigInteger("0");
        while(num.compareTo(new BigInteger("0")) != 0){
            sum = sum.add(num.mod(new BigInteger("10")).multiply(num.mod(new BigInteger("10")).multiply(num.mod(new BigInteger("10"))).multiply(num.mod(new BigInteger("10"))).multiply(num.mod(new BigInteger("10")))));
            num = num.divide(new BigInteger("10"));
        }
        
        return sum;        
    }
    
}
