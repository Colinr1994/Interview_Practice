import java.util.*;
import java.lang.Math;

public class CodingPractice {
    // Practice for any upcoming coding interviews 

    // COMPLETE
    static void fibonacci(int input) {
        //Fibonacci series
        // fn= fn-1 + fn-2 
        int num=0;
        int num1=1;
        System.out.println(1);
        for(int i=0; i<input; i++) {
            int sum = num + num1;
            num=num1;
            num1=sum;
            System.out.println(sum);
        }
    }

    // COMPLETE
    static void prime(int input) {
        // Check if a given number is prime or not.
        
        boolean result = true; 
        for(int i=2; i<input; i++) {
            if((input%i) == 0 ) {result=false;}
        }
        System.out.println(result);
    }

    // COMPLETE
    static void palindromeIterative(String input) {
        // Check if a given string is a palindrome or not
        boolean result =true;
        int strLength = input.length();
        System.out.println(strLength);
        for(int i=0;i<(strLength/2);i++) {
            if(input.charAt(i) != input.charAt(strLength-i-1)) {
                result=false;
            }
        }
        System.out.println(result);
    }

    // INCOMPLETE
    static boolean palindromeRecursive(Stirng input) {
        // Check palindrome using recursion
        if (input.length()==0) {return true;}

        return rec(input, 0, input.length()-1);
    }

    // INCOMPLETE
    static boolean rec(String input, int a, int b) {

        // First deal with edge cases 
        if (a==b) {return true;}

    }

    //Armstrong Number
    //Factorial
    //Factorial Recursive
    //Reverse a String
    //Remove Dup from Array
    //Print Repeated Characters in String
    //GCD of two numbers
    //Find Square Root
    //Reverse Array in place
    //Reverse words in a sentence 
    //String Anagram
    //First Non repeated character in string
    //Transpose a matrix
    //Print all string permutations
    //Reverse a string in place
    //Remove all white space from a string
    


    public static void main(String[] args) {
        palindromeIterative("racecar");
       
    }
}