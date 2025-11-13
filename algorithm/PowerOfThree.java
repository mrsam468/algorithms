package algorithm;
//https://leetcode.com/problems/power-of-three/
public class PowerOfThree {
    public boolean isPowerOfThree(int n){
        if(n/3==0){
            return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args){
        PowerOfThree powerOfThree = new PowerOfThree();

        System.out.println(powerOfThree.isPowerOfThree(-1));
    }
}
