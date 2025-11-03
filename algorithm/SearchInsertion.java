package algorithm;
//https://leetcode.com/problems/search-insert-position/
public class SearchInsertion {
    public int searchInsert(int[] nums,int target){
        int j =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                j=i;
            } else if (nums[i]<target) {
                j=i+1;
            }
        }
        return j;
    }
    public static void main(String[] args){
        SearchInsertion search = new SearchInsertion();
        System.out.println(search.searchInsert(new int[]{1, 4, 5,6,7},4));
    }
}
