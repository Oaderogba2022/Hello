package ie.atu.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @GetMapping("/calculate")
    public CalculatorAnswer calculate(
            @RequestParam("num1") int num1,
            @RequestParam("num2") int num2,
            @RequestParam("operation") String operation)
    {
        int answer = 0;
        String symbol = "";

        switch (operation) {
            case "add":
                answer = num1 + num2;
                symbol = "+";
                break;
            case "subtract":
                answer = num1 - num2;
                symbol = "-";
                break;
            case "multiply":
                answer= num1 * num2;
                symbol = "*";
                break;
            case "divide":
                    answer = num1 / num2;
                    symbol = "/";
                break;
            default:
                throw new IllegalArgumentException("Invalid operation: " + operation);
        }

        return new CalculatorAnswer(operation, num1, symbol, num2, answer);
}





}
