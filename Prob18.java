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
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Prob18 {
static String FILE_LOC = "C:\\Users\\Home\\Desktop\\prob18.txt";
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File(FILE_LOC);
        FileInputStream fIn = new FileInputStream(f);
        Scanner in = new Scanner(fIn);
        String[] arrLine;
        ArrayList<ArrayList<Number>> boxes = new ArrayList<>();
        while(in.hasNextLine()) {
            String nextLine = in.nextLine();
            arrLine = nextLine.split(" ");
             ArrayList<Number> box = new ArrayList<>();
            for(int k = 0; k < arrLine.length; k++) {
                box.add(new Number(Integer.parseInt(arrLine[k])));
            }
            boxes.add(box);
        }
        if(boxes.size() == 1) {
            Number n = boxes.get(0).get(0);
        }else{
            for(int i = 0; i < boxes.size()-1; i++) {
                for(int j = 0; j < boxes.get(i).size(); j++){
                    Number n = boxes.get(i).get(j);
                    n.setLeftNum(boxes.get(i+1).get(j));
                    n.setRightNum(boxes.get(i+1).get(j+1));
                }
            }
        }
        System.out.println("sum: " + sumOfTree(boxes.get(0).get(0)));               
    }   
        public static int sumOfTree(Number n) {
        if(n == null) {
            return 0;
        }
   
        if(n.getLeftNum() == null) {
            return n.getValue();
        }
        return n.getValue() + (sumOfTree(n.getLeftNum()) > sumOfTree(n.getRightNum()) ? sumOfTree(n.getLeftNum()) : sumOfTree(n.getRightNum()));
    }
    }        
     class Number {
        private int value;
        private Number leftNum;
        private Number rightNum;
        public Number(int value){
            this.value = value;            
        }
        public Number(int value, Number leftNum, Number rightNum){
            this.value = value;            
            this.leftNum = leftNum;
            this.rightNum = rightNum;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
        public Number getLeftNum() {
            return leftNum;
        }
        public void setLeftNum(Number leftNum) {
            this.leftNum = leftNum;
        }
        public Number getRightNum() {
            return rightNum;
        }
        public void setRightNum(Number rightNum) {
            this.rightNum = rightNum;
        }
    @Override
    public String toString() {
       String s = "value: " + getValue() + "\n right: " + getRightNum() + "\n left: " + getLeftNum() + "\n";
        return s;
    }          
}