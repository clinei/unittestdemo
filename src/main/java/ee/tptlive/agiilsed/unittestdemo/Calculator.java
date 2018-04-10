package ee.tptlive.agiilsed.unittestdemo;

public class Calculator {

    public int evaluate(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        int sum = 0;
        String[] numbers = input.split("\\+");
        for (String number : numbers) {
            sum += Integer.parseInt(number);
        }
        return sum;

//        return Arrays.stream(numbers)
//                .mapToInt(Integer::parseInt)
//                .sum();
    }

}
