public class FizzBuzzTest{
    public static void main(String[] args){
       FizzBuzz saySomething = new FizzBuzz();

       saySomething.fizzer(3);//expected output: Fizz
       saySomething.fizzer(5);//expected output: Buzz
       saySomething.fizzer(15);//expected output: FizzBuzz
       saySomething.fizzer(2);//expected output: 2
    }
}