package ee.tptlive.agiilsed.unittestdemo;

public class Calculator {

    public int evaluate(String input) {return evaluate(input, 0);}

    public int evaluate(String input, int x) {

        if (input == null || input.isEmpty()) {
            return 0;
        }

        int sum = 0;

        String[] numbers = input.split("\\+");

        for (String number : numbers) {

            if (number.equalsIgnoreCase("x")) {

                if(x < 0 || x >100) {

                    throw new IllegalArgumentException(" x must be between 0 and 100");
                }
                else {

                    sum += x;
                }
            }
            else {

                sum += Integer.parseInt(number);
            }
        }

        return sum;
//        return Arrays.stream(numbers)
//                .mapToInt(Integer::parseInt)
//                .sum();
    }
}
