package gevaexs.PE;

import java.math.BigInteger;

public class Prob15 {
    public static void main(String[] args) 
    {
        System.out.println("answer: " + result(20).toString());
    }
    
    public static BigInteger result(int num){
        BigInteger[][] arr = new BigInteger[num][num];
        int x = 0;
        int y = 0;
        
        for(int k = 0; k < arr.length; k++){
            
            for(int j = x; j < arr.length; j++){
                if(x == 0)
                    arr[k][j] = new BigInteger((j+2) + "");
                else
                    arr[k][j] = arr[k-1][j].add(arr[k][j-1]);
            }
            
            for(int j = y; j < arr.length; j++){
                if(y == 0)
                    arr[j][k] = new BigInteger ((j+2) + "");
                else
                    arr[j][k] = arr[j][k-1].add(arr[j-1][k]);
                
            }
            
            x++;
            y++;
        }   
        
        return arr[num-1][num-1];
    }

    
    }
    
