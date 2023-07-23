package com.platzi;

import java.util.Scanner;

public class Imperative {
    public static void main(String[] args) {
        System.out.print("Please enter a number: ");
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();

        Integer num = null;
        if(number.matches("^\\d+$")){
            num = Integer.parseInt(number);
        }else{
            System.out.println("You did not enter a number.");
        }

        if(num != null && num > 0){
            int fib0 = 0;
            int fib1;
            if(num == 1){
                fib1 = 0;
            }else if(num == 2){
                fib1 = 1;
            }else{
                num -= 2;
                fib1 = 1;
                while(num > 0){
                    int temp = fib0;
                    fib0 = fib1;
                    fib1 += temp;
                    num--;
                }
            }
            System.out.println("The number you enter is the number " + fib1 + " in the Fibonacci sequence.");
        }else{
            System.out.println("The result is 0");
        }
    }
}