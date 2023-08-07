
package gevaexs.PE;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Prob11 {
    static String FILE_LOC = "C:\\Users\\Home\\Desktop\\prob1.txt";
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File(FILE_LOC);
        FileInputStream fIn = new FileInputStream(f);
        Scanner in = new Scanner(fIn);
        String temp;
        int[][] arr = new int[20][20];
       
            //inser data to array
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                    arr[i][j] = in.nextInt();
                }
            }
            //print the arrays
            for(int i = 0; i < arr.length; i++){
                for(int j = 0; j < arr[i].length; j++){
                      //  System.out.print(arr[i][j] + " ");      
                }
            } 
        
            int multi = 0;
            int max = 0;
         //greatest product line
            
            for(int i = 0; i < arr.length; i++) {
                for(int j = 0; j < arr[i].length - 3; j++) {
                    //System.out.print(arr[i][j] + " ");
                    multi = arr[i][j] * arr[i][j + 1] * arr[i][j + 2] * arr[i][j + 3];
                    if(multi > max) {
                        max = multi;
                    }
                }
            }
            
            //greatest product diagonally leftToRight
            
            for(int i = 0; i < arr.length - 3; i++) {
                for(int j = 0; j < arr[i].length - 3; j++) {
                    //System.out.print(arr[i][j] + " ");
                    multi = arr[i][j] * arr[i + 1][j + 1] * arr[i + 2][j + 2] * arr[i + 3][j + 3];
                    if(multi > max) {
                        System.out.println(arr[i][j] + " " + arr[i + 1][j + 1] + " " + arr[i + 2][j + 2] + " " + arr[i + 3][j + 3]);
                        max = multi;
                    }
                }
            }
            
            //greatest product diagonally rightToLeft
            
            for(int i = 0; i < arr.length - 3; i++) {
                for(int j = 3; j < arr[i].length; j++) {
                    //System.out.print(arr[i][j] + " ");
                    multi = arr[i][j] * arr[i + 1][j - 1] * arr[i + 2][j - 2] * arr[i + 3][j - 3];
                    if(multi > max) {
                        //System.out.println(arr[i][j] + " " + arr[i + 1][j - 1] + " " + arr[i + 2][j - 2] + " " + arr[i + 3][j - 3]);
                        max = multi;
                    }
                }
            }
            
            //greatest product queue
            
            for(int i = 0; i < arr.length - 3; i++) {
                for(int j = 0; j < arr[i].length; j++) {
                    //System.out.print(arr[i][j] + " ");
                    multi = arr[i][j] * arr[i + 1][j] * arr[i + 2][j] * arr[i + 3][j];
                    if(multi > max) {
                        max = multi;
                    }
                }
            }
            
            System.out.println("max: " + max);
    
   }
    
}
