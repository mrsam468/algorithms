package algorithm;


import java.lang.reflect.Array;
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
}
