package java_basics.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalApp {

    public static void main(String[] args) {

        BigDecimal number1 = new BigDecimal(12.7898);
        BigDecimal number2 = new BigDecimal(11.98);

        BigDecimal result = number1.add(number2).setScale(2,RoundingMode.DOWN);

        System.out.println(result);
        

    }
}
