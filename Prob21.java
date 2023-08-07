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
public class Prob21 {
    public static void main(String[] args) {
        int sumOfAll = 0;
        for(int i = 5; i<10000; i++) {
            if(sumOfDividors(i) <= i) {
                continue;
            }
            int temp = sumOfDividors(sumOfDividors(i));
            if(i == temp) {
                System.out.println("i: " + i +", temp: " + sumOfDividors(i));
                sumOfAll += sumOfDividors(i) + i;
            }
        }
        System.out.println(sumOfAll);
    }
    public static int sumOfDividors(int num) {
        int sum = 1;
        for(int i = 2; i < Math.sqrt(num); i++) {
            if(num % i == 0) {
                sum += i;
                sum += num/i;
            }
        }
        return sum;
    }
}
