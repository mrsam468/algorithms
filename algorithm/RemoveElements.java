package algorithm;


import java.util.Arrays;
//https://leetcode.com/problems/remove-element/

public class RemoveElements {
    public int removeElement(int[] nums,int val){
        if(nums.length==0){
            return 0;
        }
        int num =0;
        for (int j : nums) {
            if (j != val) {
                nums[num]=nums[j];
                num++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return num+1;
    }
    public static void main(String[] args){
        RemoveElements removeElements = new RemoveElements();
        int[] nums = {3,2,2,3};
        removeElements.removeElement(nums,3);
    }

}
