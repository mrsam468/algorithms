package algorithm;


import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public int removeDuplicates(int[] nums){
      if(nums.length==0){
          return 0;
      }
      int i = 0;
      for(int j =1;j< nums.length;j++){
          if(nums[j]!=nums[i]){
              i=i+1;
                nums[i]=nums[j];
          }
      }

      return i+1;
    }
    public static void main(String[] args){
        RemoveDuplicateFromSortedArray duplicate = new RemoveDuplicateFromSortedArray();
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        duplicate.removeDuplicates(nums);

    }

}
