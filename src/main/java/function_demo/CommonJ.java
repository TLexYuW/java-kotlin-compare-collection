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
}
