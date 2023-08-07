package gevaexs.PE;
public class Prob04 {
    public static void main(String[] args)
    {
        int max = 0;
        
       for(int num1=100; num1<1000; num1++)
       {
            for(int num2=100;num2<1000; num2++)
            {
                if(isPali(num1*num2) && num1*num2 > max)
                {
                    max = num1*num2;
                }
            }
        }
     
            System.out.println("max: " + max);

        }
    
    public static boolean isPali(int num)
    {
        String number = num + "";

        int num1 = 0;
        int num2 = number.length()-1;
        
        while(num2>num1)
        {
            if(number.charAt(num1) != number.charAt(num2))
                return false;
            
            num1++;
            num2--;
        }
        return true;     
    }
    
}
