package com.turleylabs.functional;

import java.util.HashMap;

public class Arithmetic {
    HashMap<String, ArithmeticOperation> operations = new HashMap<>() {{
        // TODO: Fill in lambda expressions to compute the correct results
        put("+", (first, second) -> first + second);
        put("*", (first, second) -> first * second);
        put("/", (first, second) -> first / second);
        put("-", (first, second) -> first - second);
    }};

    public int doOperation(String expression) {
        String[] parts = expression.split(" ");
        String operationSymbol = parts[0];
        if (!operations.containsKey(operationSymbol)) {
            return 0;
        }

        int a = Integer.parseInt(parts[1]);
        int b = Integer.parseInt(parts[2]);
        ArithmeticOperation arithmeticOperation = operations.get(operationSymbol);

        return arithmeticOperation.operate(a, b);
    }
}
