package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.rectangle(.5,.5,.4,.25);
		StdDraw.setPenColor(Color .blue);
		StdDraw.filledRectangle(.5, .5, .3999, .2499);
		StdDraw.setPenColor(Color .green);

		StdDraw.filledRectangle(.5, 0.5, 0.3999, 0.15999);
		StdDraw.setPenColor(Color .yellow);
		StdDraw.filledSquare(.5,.5,.1);
		StdDraw.setPenColor(Color .black);
		StdDraw.filledRectangle(.5, .4, .005, .005);
		StdDraw.filledRectangle(.5, .5, .005, .005);
		StdDraw.filledRectangle(.5, .6, .005, .005);

	}
}