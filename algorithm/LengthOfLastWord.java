package algorithm;

//https://leetcode.com/problems/length-of-last-word/


 public class LengthOfLastWord{
     public int lastWord(String s){
         int length = 0;
         int i =s.length()-1;
         while(i>=0 && s.charAt(i)==' '){
             i--;
         }
         while(i>=0 && s.charAt(i) !=' '){
                length++;
                i--;
         }
         return length;
     }
     public static void main(String[] args){
         LengthOfLastWord lastWord = new LengthOfLastWord();
         lastWord.lastWord("hello world");
     }
 }
