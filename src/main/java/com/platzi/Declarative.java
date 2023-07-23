package com.platzi;

import java.util.Scanner;

public class Declarative {
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

        System.out.println("The number you enter is the number " + FibonacciPosition(num) + " in the Fibonacci sequence.");
    }

    private static Integer FibonacciPosition(Integer num) {
        int a0 = 0;
        int a1 = 1;
        int res = -1;
        if(num > 0) res = (num == 1) ? a0 : num == 2 ? a1 : FibonacciPosition(num-2) + FibonacciPosition(num-1);
        return res;
    }
}
