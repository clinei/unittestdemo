package ee.tptlive.agiilsed.unittestdemo;

public class Calculator {

    public abstract class Ast_Node {

        abstract public int evaluate();
    }

    // @Incomplete
    // Variables

    public class Ast_Literal extends Ast_Node {

        public int value;

        Ast_Literal(int value) {

            this.value = value;
        }

        public int evaluate() {

            return this.value;
        }
    }

    public class Ast_Operation extends Ast_Node {

        Ast_Node left;
        Ast_Node right;
        String operation_type;

        Ast_Operation(Ast_Node left, Ast_Node right, String operation_type) {

            this.left = left;
            this.right = right;
            this.operation_type = operation_type;
        }

        public int evaluate() {

            int left_result = this.left.evaluate();
            int right_result = this.right.evaluate();

            if (this.operation_type.equals("+")) {

                return left_result + right_result;
            }
            if (this.operation_type.equals("-")) {

                return left_result - right_result;
            }
            if (this.operation_type.equals("*")) {

                return left_result * right_result;
            }
            if (this.operation_type.equals("/")) {

                return left_result / right_result;
            }
        }
    }

    public Ast_Node parse(String input) {

        for (int i = 0; i < input.length(); i += 1) {}

        return new Ast_Literal(42);
    }

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
