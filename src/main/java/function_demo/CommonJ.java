package function_demo;

/**
 * @author : Lex Yu
 */
public class CommonJ {

	public void updateWeather(int degrees) {
		String description;
		ColorJ color;

		if (degrees < 10) {
			description = "cold";
			color = ColorJ.BLUE;
		} else if (degrees < 25) {
			description = "mild";
			color = ColorJ.ORANGE;
		} else {
			description = "hot";
			color = ColorJ.RED;
		}

		// ...
	}

	public static void displaySeparator(char character, int size) {
		for (int i = 0; i < size; i++) {
			System.out.println(character);
		}
	}

	public static void displaySeparator(char character) {
		displaySeparator(character, 10);
	}

	public static void displaySeparator() {
		displaySeparator('*');
	}

	public static void main(String[] args) {
		displaySeparator('*', 10);
	}
}


