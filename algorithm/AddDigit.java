package algorithm;
//https://leetcode.com/problems/add-digits/
public class AddDigit {
    public int addNumbers(int num){
        if(num == 0 ){
            return 0;
        }else{
            return num%9;
        }
    }
    public static void main(String[] args){
AddDigit add = new AddDigit();

        System.out.println(add.addNumbers(0));
    }
}
