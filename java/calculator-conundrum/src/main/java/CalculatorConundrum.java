import java.util.Objects;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        this.validateOperation(operation);
        int result;

        switch (operation) {
            case "+":
                result = operand1 + operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                result = divide(operand1, operand2);
                break;
            default:
                throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
        }
        return String.format("%d %s %d = %d", operand1, operation, operand2, result);
    }
    
    private static int divide(int operand1, int operand2) {
        try {
            return operand1 / operand2;
        } catch (ArithmeticException e) {
            throw new IllegalOperationException("Division by zero is not allowed", e);
        }
    }

    private void validateOperation(String operation) {
        if (Objects.isNull(operation)) {
            throw new IllegalArgumentException("Operation cannot be null");
        }
        if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        }
    }
}
