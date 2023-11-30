import class_demo.PersonJ;
//import function_demo.Common3Kt;
import function_demo.Util;

/**
 * @author : Lex Yu
 */
public class Main {
	public static void main(String[] args) {
		// init
		PersonJ person = new PersonJ("A", 100);
		System.out.println(person.getName());

		// Function
//		System.out.println("Call Kotlin Func = " + Common3Kt.topLevel());
		// kt with @file:JvmName("Util")
		System.out.println("Call Kotlin Func = " + Util.topLevel());
	}
}
