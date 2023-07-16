import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Main {
    /*

   1. Create a list of numbers.
   2. Use a stream to perform the following operations:

      a) Filter the numbers to keep only the even numbers.
      b) Square each number in the stream.
      c) Sum all the squared numbers.
      d) Calculate the average of the squared numbers.
      e) Find the maximum value among the squared numbers.
      f) Convert each squared number to a binary string.
      g) Count the occurrences of each digit (0-9) in the binary strings.

    */
    public static void main(String[] args) {
        Consumer<Integer> print = System.out::print;

        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Original numbers:");
        System.out.println(numbers);
        System.out.println();

        System.out.println("Even numbers:");
        numbers.removeIf(number -> number % 2 != 0);
        System.out.println(numbers);
        System.out.println();

        System.out.println("Squared even numbers:");
        UnaryOperator<Integer> square = number -> number * number;
        numbers.stream().map(square).forEach(System.out::println);

        Consumer<Integer> sum = number -> numbers.forEach(int sum = sum + number);

    }
}
