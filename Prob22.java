/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gevaexs.PE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Prob22 {

    
    static String FILE_LOC = "C:\\Users\\Home\\Desktop\\prob22.txt";
    static List<Character> places;
    static ArrayList<String> names;
            
    public static void main(String[] args) throws FileNotFoundException {
        File f = new File(FILE_LOC);
        FileInputStream fIn = new FileInputStream(f);
        Scanner in = new Scanner(fIn);
        
        String text = in.next();
        int i = 0;
        char currectChar;
        boolean inWord = false;
        String currectWord = "";        
        List<String> subList;
        places = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        names = new ArrayList<>();
  
        
        while(i < text.length()) {
            currectChar = text.charAt(i);

        if(currectChar == '"' && !inWord) {
            inWord = true;
            currectWord = "";
        }
            else if(currectChar == '"' && inWord) {
                names.add(currectWord);
                inWord = false;
            }      
            else if (inWord) {
                currectWord += currectChar;
        }        
        
        i++;
        }
                   
                subList = names.subList(0, names.size());
                Collections.sort(subList);
                long sum = 0L;
                int pos = 1;
                for(int k=0; k< names.size(); k++) {
                      sum += charSum(names.get(k)) * pos;
                      pos++;
                }
        System.out.println("sum: " + sum);
    }
    
    public static int charPos(Character c) {
        for( int i = 0 ; i < places.size(); i++) {
            if(c == places.get(i)){
                return i + 1;
            }
        }
        return 0;
    }
    
    public static int charSum (String name) {
        int sum = 0;
        for(int i = 0; i < name.length(); i++) {
          //  System.out.println("char: " + name.charAt(i) + " ,pos: " + charPos(name.charAt(i)));
            sum += charPos(name.charAt(i));
        }
        return sum;
    }

    
}
