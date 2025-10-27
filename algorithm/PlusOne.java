package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlusOne {

    public int[] plus(int[] digits){
        if(digits.length==0){
            return new int[]{0};
        }
        int nums =digits.length-1;

        int digit = digits[nums];
        int i = digit + 1;
        System.out.println(i);
        int[] last = {digits[nums]};
        digits[nums] = i;
        if(digits[nums]>=10){
            return digits= new int[]{1, 0};
        }else{
            return digits;
        }

    }
    public static void main(String[] args){
        PlusOne plusOne = new PlusOne();
        int[] num ={10};
        System.out.println(Arrays.toString(plusOne.plus(num)));
    }
}
