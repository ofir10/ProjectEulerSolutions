/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gevaexs.PE;

import java.util.ArrayList;

/**
 *
 * @author Home
 */
public class Prob23 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i < 28124; i++) {
            if(isNumberAbundants(i)) {
                arr.add(i);
            }
        }
        
        boolean[] isCan = new boolean[28124];
        for(int i=0; i < isCan.length; i++) {
            isCan[i] = true;
        }
        for(int i=0; i<arr.size(); i++) {
            for(int j=0; j<arr.size(); j++) {
                int temp = arr.get(i) + arr.get(j);
                if(temp < isCan.length) {
                    isCan[temp] = false;
                }
            }
        }
        
        int sum = 0;
        for(int i=0; i <isCan.length; i++) {
            if(isCan[i]) {
                sum += i;
            }
        }
        System.out.println("sum: " + sum);
    }
    public static boolean isNumberAbundants(int num) {
        if(num == 0){
            return false;
        }
        int sum = 1;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                sum += i;
                sum += num/i;
            }
        }
        if(num % Math.sqrt(num) ==0) {
            sum -= Math.sqrt(num);
        }
        return sum > num;
    }
}