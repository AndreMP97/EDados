import java.util.Scanner;

class ED170 {

    public static int path(BSTree<Integer, Integer> t, String s) {
	return path(t.root,s);
    }

    private static int path(BSTNode<Integer, Integer> n, String s) {
	int p = s.size(), i=0;
	if (n!=null) {
	    //for (int i=0;i<p;i++) {
	    if (s.equals("E") && i<p-1) {
		i++;
		return path(n.left,s);
	    }
	    else if(s.equals("D") && i<p-1) 
		return path(n.right,s+1);
	    else if(s.)
		return n.key;
	}
	return 0;
    }
    
    // Providencia a leitura de uma arvore a partir do stdin e chama o metodo path
    public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	BSTree<Integer, Integer> t = new BSTree<Integer, Integer>();
	int n = stdin.nextInt();	    
	for (int i=0; i<n; i++) {
	    int aux = stdin.nextInt();
	    LibBSTree.insert(t, aux, aux);
	}
	int ncases = stdin.nextInt();
	for (int i=1; i<=ncases; i++) {
	    String s = stdin.next();
	    System.out.println("caminho " + i + ": " + path(t, s));
	}
    }
}

// -----------------------------------------
// Implementacao base de arvores binarias
// -----------------------------------------

// Classe para representar um no de uma arvore binaria de pesquisa
class BSTNode<K extends Comparable<? super K>,V> {
    K          key;
    V          val;
    BSTNode<K,V> left;
    BSTNode<K,V> right;

    BSTNode(K k, V v) {
	key   = k; 
	val   = v; 
	left  = null;
	right = null;
    }
}

// Classe para representar uma arvore binaria de pesquisa
class BSTree<K extends Comparable<? super K>,V> {
    BSTNode<K,V> root;

    BSTree() {
	root = null;
    }
}

// Classe que implementa a insercao de pares (chave, valor) na arvore
class LibBSTree<K extends Comparable<? super K>,V> {

    public static <K extends Comparable<? super K>,V> 
    void insert(BSTree<K,V> t, K key, V val) {
	t.root = insert(t.root, key, val);
    }

    private static <K extends Comparable<? super K>,V> 
    BSTNode<K,V> insert(BSTNode<K,V> n, K key, V val) {
	if ( n == null )
	    return new BSTNode<K,V>(key,val);
	else {
	    int cmp = key.compareTo(n.key);
	    if (cmp == 0)
		n.val = val;
	    else if (cmp < 0)
		n.left = insert(n.left, key, val);
	    else
		n.right = insert(n.right, key, val);
	}
	return n;
    }    
}
