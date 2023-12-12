package unit_type;

import java.util.function.Consumer;

/**
 * @author : Lex Yu
 */

public class UnitDemo {
    public static void main(String[] args) {
        printNum.accept(10);
    }

    public static Consumer<Integer> printNum = x -> System.out.println("Num " + x);

}
