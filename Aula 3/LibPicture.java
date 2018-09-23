import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class LibPicture {

    public static Color getColor(Picture p, int i, int j) {
	return p.pixels[i][j];
    }

    public static void setColor(Picture p, int i, int j, Color c) {
	p.pixels[i][j] = c;
    }
    
    public static Picture flipVertical(Picture p) {
	Picture q = new Picture(p.width,p.height); 
	for (int i = 0; i < p.width; i++)
	    for (int j = 0; j < p.height; j++)
		setColor(q, i, p.height - j - 1, getColor(p, i, j));
	return q;
    }

    public static Picture flipHorizontal(Picture p) {
	Picture q = new Picture(p.width,p.height); 
	for (int i = 0; i < p.width; i++)
	    for (int j = 0; j < p.height; j++)
		setColor(q, p.width - i - 1, j, getColor(p, i, j));
	return q;
    }

    public static Picture redComponent(Picture p) {
	Picture q = new Picture(p.width, p.height);
	for (int i = 0; i < p.width; i++)
	    for (int j = 0; j < p.height; j++) {
		Color c = getColor(p, i, j);
		setColor(q, i, j, LibColor.getRed(c));
	    }
	return q;
    }

    public static Picture greyScale(Picture p) {
	Picture q = new Picture(p.width, p.height);
	for (int i = 0; i < p.width; i++)
	    for (int j = 0; j < p.height; j++) {
		Color c = getColor(p, i, j);
		setColor(q, i, j, LibColor.toGray(c));
	    }
	return q;
    }

    // ----------------------------------------------------
    // Loading and saving a PNG file
    // ----------------------------------------------------
    
    public static Picture load(String filename) {
	BufferedImage image = null;
	try {
	    image  = ImageIO.read(new File(filename));
	} catch(IOException e) {
	    System.out.println(e);
	} 
	int width  = image.getWidth();
	int height = image.getHeight();
	Picture p =  new Picture(width,height);
	for (int i = 0; i < width; i++)
	    for (int j = 0; j < height; j++) {
		int rgb   = image.getRGB(i,j);
		int blue  = rgb & 0xff;
		int green = (rgb & 0xff00) >> 8;
		int red   = (rgb & 0xff0000) >> 16;
		p.pixels[i][j] = new Color(red, green, blue);
	    }
	return p;
    }

    public static void save(Picture p, String filename) {
	BufferedImage buffer = new BufferedImage(p.width, p.height, BufferedImage.TYPE_INT_ARGB);
	for (int i = 0; i < p.width; i++)
	    for (int j = 0; j < p.height; j++) {
		Color c   = p.pixels[i][j];
		int red   = (c.red   << 16) & 0x00FF0000;
		int green = (c.green <<  8) & 0x0000FF00;
		int blue  = c.blue & 0x000000FF;
		buffer.setRGB(i, j, 0xFF000000 | red | green | blue);
	    }
	try {
	    ImageIO.write(buffer, "png", new File(filename));
	} catch(IOException e) {
	    System.out.println(e);
	}
    }

    // ----------------------------------------------------
    
    public static String toString(Picture p) {
	return p.width + "x" + p.height + " RGB image";
    }
}
