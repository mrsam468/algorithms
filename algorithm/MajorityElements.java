package algorithm;

//https://leetcode.com/problems/majority-element/description/
import java.util.Arrays;

public class MajorityElements {
    public int majorElements(int[] nums){
        Arrays.sort(nums);
        int i =0;
        for(int j =0;j<nums.length;j++){
             i = j/2;
             i=nums[i];
        }
        return i;
    }
     static void main(String[] args){
        MajorityElements majorityElements = new MajorityElements();
        int[] array = {1,2,3,2,3,};
        System.out.println(majorityElements.majorElements(array));
    }
}
