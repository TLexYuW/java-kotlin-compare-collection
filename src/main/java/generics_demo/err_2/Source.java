package generics_demo.err_2;

/**
 * @author : Lex Yu
 */
interface Source<T> {
    T nextT();
}


class Demo {

    void print(Source<String> strs) {
         // Source<Object> objects = strs; // !!! Not allowed in Java

    }

    void print2(Source<? extends Object> strs) {
        Source<Object> objects = (Source<Object>) strs;
    }
}
