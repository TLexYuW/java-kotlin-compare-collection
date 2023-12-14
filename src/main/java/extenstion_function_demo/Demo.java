package extenstion_function_demo;

import extenstion_function_demo.child.JChild;
import extenstion_function_demo.parent.JParent;

import java.util.Random;

import static extenstion_function_demo.StringExtensionKt.lastChar;
import static extenstion_function_demo.StringExtensionKt.repeat;

/**
 * @author : Lex Yu
 */
public class Demo {
    public static void main(String[] args) {
        char c = lastChar("qqqqqqc");
        System.out.println(c);

        String s = repeat("ab", 3);
        System.out.println(s);

        JParent jParent = new JChild();
        System.out.println(foo(jParent));

        JChild jChild = new JChild();
        System.out.println(foo(jChild));

        JParent parent = (new Random().nextBoolean()) ? new JParent() : new JChild();
        System.out.println(foo(parent));

    }
    public static String foo(JParent jParent){
        return "jParent foo";
    }

    public static String foo(JChild jChild){
        return "jChild foo";
    }
}

