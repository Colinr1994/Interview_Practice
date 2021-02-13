
class Functions {

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

    static void prime(int input) {
        // Check if a given number is prime or not.
        
        boolean result = true; 
        for(int i=2; i<input; i++) {
            if((input%i) == 0 ) {result=false;}
        }
        System.out.println(result);
    }

    static void palindromeIterative(String input) {
        // Check if a given string is a palindrome or not
        boolean result =true;
        int strLength = input.length();
        for(int i=0;i<(strLength/2);i++) {
            if(input.charAt(i) != input.charAt(strLength-i-1)) {
                result=false;
            }
        }
        System.out.println(result);
    }

    static void armstrong(double input) {
        double holder = input;
        double sum =0;

        while(holder>0) {    
            sum+= (int) Math.pow(holder%10,3);
            holder= (int) holder/ 10;
        }
        if(sum==input) {System.out.println(true);} else {System.out.println(false);}
    }

    static void factorialIt(int input) {
        int result = 1;
        if(input ==0) {System.out.println(1); return;}
        for(int i=1; i<input+1; i++) {
            result*= i; 
        }
        System.out.println(result);
    }

    static int factorialRe(int input) {
        if (input<=1) {return 1;}
        else { return input*factorialRe(input-1);}
    }

    static void recursiveFact(int input) {
        System.out.println(factorialRe(input));
    }

    static void reverseString(String str) {
        char[] array = str.toCharArray(); // string to character array
        int length = str.length(); 
        for(int i=0;i<str.length()/2;i++) { 
            char holder = array[i];
            array[i]=array[length-i-1];
            array[length-i-1]=holder;
        }
        System.out.println(array);
    }

    static void stringSearch(String input, String search) {

        for(int i=0; i<input.length(); i++) {
            if(input.charAt(i)==search.charAt(0)) {
                if(input.substring(i, i+search.length()).equals(search)) {
                    System.out.println("Match");
                }
            }
        }
    }

}

public class Practice {
    public static void main (String [] args) {
        Functions.stringSearch("hello world", "woddr");

    }
}