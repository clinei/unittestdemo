package ee.tptlive.agiilsed.unittestdemo;

import java.util.*;

import static java.util.Arrays.asList;
import static java.util.Collections.*;

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

//        return Arrays.stream(numbers)
//                .mapToInt(Integer::parseInt)
//                .sum();

        final Optional<String> name = getName();
        System.out.println(name.map(String::length).orElseThrow(IllegalStateException::new));

        System.out.println(getListOfNames().size());

        Optional.ofNullable(getListOfNames());
        return sum;
    }

    public Optional<String> getName() {
        if (new Random().nextBoolean()) {
            return Optional.of("Dmitri");
        } else {
            return Optional.empty();
        }
    }

    public List<String> getListOfNames() {
        if (new Random().nextBoolean()) {
            return asList("1", "2", "3");
        } else {
            return emptyList();
        }
    }
}
