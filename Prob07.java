package gevaexs.PE;
public class Prob07 {
    public static void main(String[] args) {
      
        int id = 0;
        int num=1;
        while(id<10001)
        {
                num++;
                if(isPrime(num))
                    id++;
        }
        
        System.out.println("num: " + num);        
    }
    
    public static boolean isPrime(int num)
    {
        for(int i=2; i<num; i++)
        {
            if(num%i ==0)
            {
                return false;
            }
        }
        return true;
    }
    
}
