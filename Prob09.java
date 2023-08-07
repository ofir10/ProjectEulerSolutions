package gevaexs.PE;
public class Prob09 
{
    public static void main(String[] args) 
    {
        
        for(int a = 0; a<333; a++)
        {
            for(int b = 1; b < 500; b++)
            {
                int c = 1000-b-a;

                if(isPytha(a, b, c))
                {
                    System.out.println("answer (a*b*c) = " + a * b * c);
                    System.exit(0);
                }
            }
        }
    }
    
    public static boolean isPytha(int a, int b, int c)
    {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }
    
}
