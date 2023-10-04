package studio4;

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
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
	String shapeName =	in.next();
	int colorOne=in.nextInt();
	int colorTwo=in.nextInt();
	int colorThree=in.nextInt();
	StdDraw.setPenColor(colorOne, colorTwo, colorThree);
	boolean isFilled=in.nextBoolean();
	
	double x = in.nextDouble();
	double y = in.nextDouble();
	double widthOne= in.nextDouble();
	double widthTwo=in.nextDouble();
	if (isFilled=true){
		StdDraw.filledRectangle(x,y,widthOne,widthTwo);
	}
	StdDraw.rectangle(x, y, widthOne, widthTwo);
	
	}
}
