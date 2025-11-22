package algorithm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//https://leetcode.com/problems/power-of-three/
public class PowerOfThree {
    public boolean isPowerOfThree(int n){
        boolean b = n % 3 == 0;
        if(n==0){
            return false;
        }else if( b){
            return true;
        }else{
            return false;
        }

    }
    public static void main(String[] args) throws IOException {
        PowerOfThree powerOfThree = new PowerOfThree();
        System.out.println(powerOfThree.isPowerOfThree(3));
    }
}
