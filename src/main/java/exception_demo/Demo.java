package exception_demo;

import java.io.IOException;

/**
 * @author : Lex Yu
 */
public class Demo {
    public static void main(String[] args) {
        // can't compile
//        try {
//            ThrowAnnotationKt.foo();
//        } catch (IOException ex) {
//
//        }

        try {
            ThrowAnnotationKt.bar();
        } catch (Exception ex) {

        }


    }
}
