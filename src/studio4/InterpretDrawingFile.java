package studio4;

import java.awt.Color;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		int canvasHeight = 512;
		int canvasWidth = 22 * canvasHeight / 16;
		StdDraw.setCanvasSize(canvasWidth, canvasHeight);
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shapeType = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		Color colorofRec = new Color(red,green,blue); 
		StdDraw.clear();
		StdDraw.setPenColor(colorofRec);
		boolean filed = in.nextBoolean();
		double x = in.nextDouble();
		double y = in.nextDouble();
		if (shapeType=="rectangle"){
			double halfWidth = in.nextDouble();
			double halfHeight = in.nextDouble();
			if (filed) {
				StdDraw.filledRectangle(x, y, halfWidth, halfHeight);
			}
			else {
				StdDraw.rectangle(x, y, halfWidth, halfHeight);
			}
		}
		if (shapeType=="ellipse") {
			double semiMajor = in.nextDouble();
			double semiMinor = in.nextDouble();
			if (filed) {
				StdDraw.filledEllipse(x, y, semiMajor, semiMinor);
			}
			else {
				StdDraw.ellipse(x, y, semiMajor, semiMinor);
			}
		}
		if (shapeType=="trianlge") {
			if (filed) {
				
			}
			else {
				
			}
		}
		
	}
}
