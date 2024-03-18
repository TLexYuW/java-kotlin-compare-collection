package generics_demo.err_1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author : Lex Yu
 */
public class ErrDemo {
    public static void main(String[] args) {
        // Java
        List<String> strs = new ArrayList<String>();

        // Java reports a type mismatch here at compile-time.
        List<Object> objs = Collections.singletonList(strs);

        // What if it didn't?
        // We would be able to put an Integer into a list of Strings.
        objs.add(1);

        // And then at runtime, Java would throw
        // a ClassCastException: Integer cannot be cast to String
        String s = strs.get(0);
    }
}
