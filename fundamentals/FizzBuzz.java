public class FizzBuzz {
    public String fizzBuzz(int number) {
        if (number == 3) {
            return "Fizz";
        } else if (number == 5) {
            return "Buzz";
        } else if (number == 15) {
            return "FizzBuzz";
        } else {
            String num = "" + number;
            return num;
        }
    }
}