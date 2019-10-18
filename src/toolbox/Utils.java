package toolbox;

public class Utils {

	public static int generateRandomNum(int max, int min) {
		return (int) Math.round(Math.random()*(max - min)) + min;

	}

}
