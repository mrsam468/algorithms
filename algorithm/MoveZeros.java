//package algorithm;
//https://leetcode.com/problems/move-zeroes/
import java.util.Arrays;

public static class MoveZeros {
    public void move(int[] nums) {
        int count =0;
        for(int i =0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }

        }
        while(count<nums.length){
            nums[count++]=0;
        }
        System.out.println(Arrays.toString(nums));
    }
    }
    public static void main(String[] args){
        MoveZeros move = new MoveZeros();
        int[] array ={0,1,0,3,12};
        move.move(array);
    }
