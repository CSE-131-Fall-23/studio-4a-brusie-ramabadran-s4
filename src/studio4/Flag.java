package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.clear();
		StdDraw.setPenRadius(.05);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(.25, .5, .25, .3);
		StdDraw.setPenColor(Color.ORANGE);
		StdDraw.filledRectangle(.75, .5, .25, .3);
		StdDraw.setPenColor(Color.DARK_GRAY);
		StdDraw.ellipse(.75, .5, .2, .2);
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.ellipse(.5, .5, .2, .2);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.ellipse(.25, .5, .2, .2);
		
	}
}