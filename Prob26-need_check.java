/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gevaexs.PE;

/**
 *
 * @author Home
 */
public class Prob26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp = 0;
        int max = 0;
        double result = 0;
        
        for(double d = 2; d < 1000; d++) {
            temp = 1/d;
            String stringTemp = String.valueOf(temp);
            stringTemp = stringTemp.substring(2);
            System.out.println(stringTemp);
            if(stringTemp.length() < 2) {
                continue;
            }
            String one = stringTemp.substring(stringTemp.length()-1);
            String tow = stringTemp.substring(stringTemp.length()-2, stringTemp.length()-1);
            for(int i = stringTemp.length()-2; i > stringTemp.length()/2; i--) {
                if(one.compareTo(tow) == 0) {
                    System.out.println("here");
                    if(one.length() > max) {
                        max = one.length();
                        result = d;
                    }
                    break;
                }
                
                one = stringTemp.charAt(i) + one;
                tow = stringTemp.substring(i - (one.length()), stringTemp.length()-one.length());
            }
        }
        
        System.out.println("max: " + max);
        System.out.println("result: " + result);
    }
}
