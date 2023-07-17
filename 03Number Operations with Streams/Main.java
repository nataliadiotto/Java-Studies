import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Filter even numbers
        List<Integer> evenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        // Square each number
        List<Integer> squaredNumbers = evenNumbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());

        // Sum of squared numbers
        int sum = squaredNumbers.stream()
                .reduce(0, Integer::sum);

        // Calculate the average of squared numbers
        double average = squaredNumbers.stream()
                .mapToDouble(Integer::doubleValue)
                .average()
                .orElse(0.0);

        // Find the maximum value among squared numbers
        int max = squaredNumbers.stream()
                .max(Integer::compareTo)
                .orElse(0);

        // Convert squared numbers to binary strings
        List<String> binaryStrings = squaredNumbers.stream()
                .map(Integer::toBinaryString)
                .collect(Collectors.toList());

        // Count occurrences of each digit (0-9) in binary strings
        Map<Character, Long> digitCountMap = binaryStrings.stream()
                .flatMapToInt(CharSequence::chars)
                .filter(Character::isDigit)
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Squared numbers: " + squaredNumbers);
        System.out.println("Sum of squared numbers: " + sum);
        System.out.println("Average of squared numbers: " + average);
        System.out.println("Maximum value among squared numbers: " + max);
        System.out.println("Binary strings: " + binaryStrings);
        System.out.println("Digit count map: " + digitCountMap);
    }
}




