package algorithm;

public class PalindromeNumber {
    public boolean palindrome(int x){
        int originalNumber = x;
        int reversedNumber = 0;
        while(x!=0){
            int number = x%10;
            reversedNumber = reversedNumber*10+number;
            x /=10;
        }
        String numberStr = String.valueOf(reversedNumber);
        String realNumber = String.valueOf(originalNumber);

        if(realNumber.equals(numberStr)){
            return !numberStr.startsWith("-");

        }else{
            return false;
        }

    }
    public static void main(String[] args){
        PalindromeNumber palidromeNumber = new PalindromeNumber();
        System.out.println(palidromeNumber.palindrome(121));


    }
}
