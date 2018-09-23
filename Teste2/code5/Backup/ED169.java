import java.util.Scanner;

class ED169 {

    public static int even(BSTree<Integer, Integer> t) {
	return even(t.root);
    }

    private static int even(BSTNode<Integer, Integer> n) {
	int sum=0;
	if(n != null) {
	    if (n.key%2==0) {
		sum++;
		return sum + even(n.left) + even(n.right);
	    }
	    else
		return even(n.left) + even(n.right);
	}
	return sum;
    }
    
    // Providencia a leitura de uma arvore a partir do stdin e chama o metodo even
    public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	int ncases = stdin.nextInt();
	for (int i=1; i<=ncases; i++) {
	    BSTree<Integer, Integer> t = new BSTree<Integer, Integer>();
	    int n = stdin.nextInt();	    
	    for (int j=0; j<n; j++) {
		int aux = stdin.nextInt();
		LibBSTree.insert(t, aux, aux);
	    }
	    System.out.println("arvore " + i + ": " + even(t));
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