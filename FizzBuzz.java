// Write a program that will take an integer and print Fizz if the number is divisible by 3, Buzz if the number is divisible by 5, FizzBuzz if the number is divisible by 3 and 5, and the number itself for all other cases.

public class FizzBuzz{
    public String fizzer(int num){

        if (num % 3 == 0 && num % 5 == 0){
            System.out.println("FizzBuzz");
        }
        else if (num % 3 == 0){
            System.out.println("Fizz");
        }
        else if (num % 5 == 0){
            System.out.println("Buzz");
        }
        else{
            System.out.println(num);
        }

        return "complete";

    }
}

