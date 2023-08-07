package gevaexs.PE;
public class Prob05 {
    public static void main(String[] args) 
    {
        int number=1;
        while(!isDIvid(number))
        {
            number++;
        }
        System.out.println("number: " + number);
   
    }
    
    public static boolean isDIvid(int number)
    {
        for(int i=1;i<=20; i++)
        {
           if(number%i != 0)
           {
               return false;
           }
        }
        return true;
    }
    
}
