package algorithm;
//https://leetcode.com/problems/ugly-number/
public class UglyNumbers {
    public boolean equals(int n) {
       if(n == 2*3 || n == 2*5 || n == 3*5 || n<2){
           return true;
       }else{
           return false;
       }
    }
    public static void main(String[] args){
        UglyNumbers uglyNumbers = new UglyNumbers();

        System.out.println(uglyNumbers.equals(15));
    }
}
