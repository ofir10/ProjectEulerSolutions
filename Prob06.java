package gevaexs.PE;
public class Prob06 
{
    public static void main(String[] args) 
    {
        int sumsquares=0;
        int squaressum = 0;
        int tempsum = 0;
        
        for(int i=1; i<=100;i++)
            sumsquares+= Math.pow(i, 2);
        
        for(int j=1; j<=100;j++)
            tempsum += j;
        
        squaressum+= Math.pow(tempsum, 2);
        System.out.println("Answer(in positive!!): "  + (squaressum-sumsquares));

    }
    
}
