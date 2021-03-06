// Uma classe simples para representar um ponto 2D
class Point {
    int x, y;

    Point() {
	x = y = 0;
    }

    Point(int x0, int y0) {
	x = x0;
	y = y0;
    }
}

// Classe utilitária com métodos estáticos para lidar com a classe Point
class LibPoint {
    // Devolve uma representação em texto do conteúdo de um Ponto
    public static String toString(Point p) {
	return "(" + p.x + "," + p.y + ")";
    }
}

// Clase nova Rectangle

class Rectangle {
    Rectangle() {
    }
    Rectangle(int x1, int y1, int x2, int y2) {

    }
    Rectangle(Point p1, Point p2) {

    }
}

// Classe principal com a função main
public class TestGeometry {
    public static void main (String[] args){
	Point p1 = new Point();
	
	System.out.println("p1 original: " + LibPoint.toString(p1));
	p1.x = 1;
	System.out.println("p1 modificado: " + LibPoint.toString(p1));

	Point p2 = new Point(2,3);
	System.out.println("p: " + LibPoint.toString(p2));
    }
}
