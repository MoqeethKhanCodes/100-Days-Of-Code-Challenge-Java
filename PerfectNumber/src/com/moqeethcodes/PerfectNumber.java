package com.moqeethcodes;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number){

        // checking input
        if(number < 1){
            return false;

        }

        // sum of factors
        int temp = 0;
        for(int i = 1; i  < number; i++){
            if((number % i) == 0){
                temp += i;
            }
        }

        // checking perfect number
        return temp == number;

    }

}
