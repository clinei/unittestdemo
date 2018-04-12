package ee.tptlive.agiilsed.unittestdemo;

import java.util.Map;
import java.util.HashMap;

public class Calculator {

    private String input;
    private int index;
    private int x;

    private Map<Character, Integer> operator_precedences;

    public Calculator() {

        this.operator_precedences = new HashMap<Character, Integer>();

        this.operator_precedences.put('+', 1);
        this.operator_precedences.put('-', 1);
        this.operator_precedences.put('*', 2);
        this.operator_precedences.put('/', 2);
    }

    public int evaluate(String input) {

        return evaluate(input, 0);
    }

    public int evaluate(String input, int x) {

        if (input == null || input.isEmpty()) {

            return 0;
        }

        this.input = input;
        this.index = -1;
        this.x = x;

        return parse_expression();

        /*

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
        */

//        return Arrays.stream(numbers)
//                .mapToInt(Integer::parseInt)
//                .sum();
    }

    private char peek_next_token() {

        if (index + 1 < input.length()) {

            return input.charAt(index + 1);
        }
        else {

            return '\0';
        }
    }

    private int parse_primary() {

        char lookahead = peek_next_token();

        if (lookahead == 'x' || lookahead == 'X') {

            return this.x;
        }

        String str = "";

        if (lookahead == '-') {

            str += '-';

            this.index += 1;

            lookahead = peek_next_token();
        }

        while (lookahead != '+' && lookahead != '-' &&
               lookahead != '*' && lookahead != '/' &&
               lookahead != 'x' && lookahead != '\0') {

            str += lookahead;

            this.index += 1;

            lookahead = peek_next_token();
        }

        return Integer.parseInt(str);
    }

    private int parse_expression() {

        return parse_expression_1(parse_primary(), 0);
    }

    private int parse_expression_1(int lhs, int min_precedence) {

        char lookahead = peek_next_token();

        Integer prec = this.operator_precedences.get(lookahead);

        if (prec == null) {

            return lhs;
        }

        while (prec >= min_precedence) {

            char op = lookahead;

            this.index += 1;

            int rhs = parse_primary();

            lookahead = peek_next_token();

            while (this.operator_precedences.get(lookahead) > this.operator_precedences.get(op)) {

                rhs = parse_expression_1(rhs, this.operator_precedences.get(lookahead));

                lookahead = peek_next_token();
            }

            if (op == '+') {

                lhs = lhs + rhs;
            }
            else if (op == '-') {

                lhs = lhs - rhs;
            }
            else if (op == '*') {

                lhs = lhs * rhs;
            }
            else if (op == '/') {

                lhs = lhs / rhs;
            }
        }

        return lhs;
    }
}
