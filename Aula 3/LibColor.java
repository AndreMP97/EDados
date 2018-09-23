import java.lang.Math;

public class LibColor {
    
    public static Color getRed(Color c) {
	return new Color(c.red,0,0);
    }
    
    public static Color getGreen(Color c) {
	return new Color(0,c.green,0);
    }
    
    public static Color getBlue(Color c) {
	return new Color(0,0,c.blue);
    }
    
    public static Color toGray(Color c) {
	double luminance = 0.299 * c.red + 0.587 * c.green + 0.114 * c.blue;
	int gray = (int)Math.round(luminance);
	return new Color(gray, gray, gray);
    }
    
    public static boolean equals(Color c1, Color c2) {
	return (c1.red == c2.red) && (c1.green == c2.green) && (c1.blue == c2.blue);
    }

    public static String toString(Color c) {
	return "(" + c.red + ":" + c.green + ":" + c.blue + ")";
    }    
}
