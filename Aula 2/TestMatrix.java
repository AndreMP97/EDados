import java.util.Scanner;

class Matrix {
    int data[][]; // os elementos da matriz em si
    int rows;     // num. linhas
    int cols;     // num. cols

    // construtor padrao de matriz
    Matrix(int r, int c) {
	data = new int[r][c];
	rows = r;
	cols = c;
    }    
}

class LibMatrix {
    // Ler os rows x cols elementos da matriz
    static void read(Matrix m, Scanner in) {
	for (int i=0; i<m.rows; i++)
	    for (int j=0; j<m.cols; j++)
		m.data[i][j] = in.nextInt();
    }
    public static Matrix identity(int n) {
	int idmat[][] = new int [n][n];
	if (n < 0) {
	    throw new RuntimeException("n é negativo!");
	}
	for (int i=0; i < n; i++) {
	    idmat[i][i]=1;
	}
    } 

    // Obter uma string representando a matriz
    static String toString(Matrix m) {
	String ans = "";
	for (int i=0; i<m.rows; i++) {
	    for (int j=0; j<m.cols; j++)
		ans += m.data[i][j] + " ";
	    ans += "\n";
	}
	return ans;
    }
}


public class TestMatrix {
    public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	Matrix m = new Matrix(stdin.nextInt(), stdin.nextInt());
	LibMatrix.read(m, stdin);
	System.out.print(LibMatrix.toString(m));
    }    
}
