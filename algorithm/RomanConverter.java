package algorithm;



//https://leetcode.com/problems/roman-to-integer/

public class RomanConverter {
    public static int romanToInt(String s){
        int number=0;
        int sumOfDigits = 0;

        for(int i = 0; i<s.length(); i++){
            char character = s.charAt(i);

            switch (String.valueOf(character)) {
                case "I" -> number = 1;
                case "V" -> number = 5;
                case "X" -> number = 10;
                case "L" -> number = 50;
                case "C" -> number = 100;
                case "D" -> number = 500;
                case "M" -> number = 1000;
            }

                    while (number > 0) {
                        int digit = number % 10000;
                        if(sumOfDigits<=number){
                            sumOfDigits = digit-i;
                        }else{
                            sumOfDigits += digit;

                        }
                        number /= 10000;

                    }


        }
        return sumOfDigits;
    }
    public static void main(String[] args){
//        RomanConverter romanConverter = new RomanConverter();
        String name = "LVIV";


        System.out.println(RomanConverter.romanToInt(name));

    }
}
