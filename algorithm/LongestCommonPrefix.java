package algorithm;

//https://leetcode.com/problems/longest-common-prefix/

public class LongestCommonPrefix {
    public String prefix(String[] strs){


        String prefix=strs[0];
        for (String str : strs) {
            while (!str.startsWith(prefix)) {

                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;

    }
    public static void main(String[] args){
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        String[] name = {"faith","fant","fack"};
        System.out.println(longestCommonPrefix.prefix(name));


    }
}
