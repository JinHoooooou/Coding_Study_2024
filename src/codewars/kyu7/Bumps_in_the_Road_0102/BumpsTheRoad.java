package codewars.kyu7.Bumps_in_the_Road_0102;

import java.util.Arrays;

public class BumpsTheRoad {
	public static String bumps(final String road) {
		long bump = Arrays.stream(road.split("")).filter(x->x.equals("n")).count();
		return bump <= 15? "Woohoo!" : "Car Dead";
	}
}
