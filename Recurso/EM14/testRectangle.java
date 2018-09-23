class Rectangle {
    int xe, ye, xd, yd;
    
    public Rectangle(int x0, int y0, int x1, int y1) {
        xe = x0;
        ye = y0;
        xd = x1;
        yd = y1;
    }

    public int area() {
        int a;
        a = (xd-xe)*(yd-ye);
        return a;
    }

    public int perimeter() {
        int p;
        p = (xd-xe)*2+(yd-ye)*2;
        return p;
    }

    public void rotate90() {
        int nxe, nxd
        xd = xe;
        yd = ye;
        xe = -yd;
        ye = xd;
    }
}

public class testRectangle {
    public static void main(String args[]) {
        Rectangle t = new Rectangle(0,0,4,2);
        System.out.println("Rectangle: " + t);
        System.out.println("xe: " + t.xe + " ye: " + t.ye + " xd: " + t.xd + " yd: " + t.yd);
        System.out.println("Perimeter: " + t.perimeter());
        System.out.println("Area: " + t.area());
        //System.out.println("Rotate: " + t.rotate90());
        System.out.println("Area rotate: " + t.rotate90().area());
    }
}
