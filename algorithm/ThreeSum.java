package algorithm;

//import java.util.Arrays;
//https://leetcode.com/problems/3sum/
import java.util.*;

public class ThreeSum {
    public List<List<Integer>> sum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return result;
    }
public static void main(String[] args){
        ThreeSum threeSum = new ThreeSum();
        int[] num = {-1,0,1,2,-1,-4};
    threeSum.sum(num);


}
}
