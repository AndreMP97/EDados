import java.lang.Math;

class Aula10 {
    public static void main(String[] args) {
	int[] data = {14, 4, 18, 3, 9, 16, 20, 7, 15, 17, 5};
	int[] data2 = {10, 2, 9, 1, 4, 5, 3};
	BSTree<Integer,Integer> t = new BSTree<Integer,Integer>();
	BSTree<Integer, Integer> t2 = new BSTree<Integer, Integer>();
	for(int i = 0 ; i < data.length ; i++ )
	    LibBSTree.insert(t, data[i], data[i]);
	for(int i = 0; i < data2.length; i++)
	    LibBSTree.insert(t2, data2[i], data2[i]);
	System.out.println("Arvore t1");
	System.out.println("size:  " + LibBSTree.size(t));
	System.out.println("depth: " + LibBSTree.depth(t));
	System.out.println("sum: " + sum(t));
	System.out.println("min: " + LibBSTree.minimum(t));
	System.out.println("max: " + LibBSTree.maximum(t));
	System.out.println("Min depth: " + LibBSTree.minDepth(t));
	printInOrder(t);
	System.out.println(LibBSTree.contains(t, 7));
	System.out.println(LibBSTree.contains(t, 8));
	System.out.println(LibBSTree.keysLessThan(t, 16));
	System.out.println(LibBSTree.keysGreaterThan(t, 16));
	System.out.println("Arvore t2");
	System.out.println("size:  " + LibBSTree.size(t2));
	System.out.println("depth: " + LibBSTree.depth(t2));
	System.out.println("sum: " + sum(t2));
	System.out.println("min: " + LibBSTree.minimum(t2));
	printInOrder(t2);
	System.out.println("Min depth: " + LibBSTree.minDepth(t2));
    }

    static int sum(BSTree<Integer, Integer> t) {
	return sum(t.root);
    }

    static int sum(BSTNode<Integer, Integer> n) {
	if (n == null)
	    return 0;
	else
	    return n.val + sum(n.left) + sum(n.right);
    }

    static void printInOrder(BSTree<Integer, Integer> t) {
	printInOrder(t.root);
	System.out.println();
    }

    static void printInOrder(BSTNode<Integer, Integer> n) {
	if (n!=null) {
	    System.out.print(n.key + " ");
	    printInOrder(n.left);
	    printInOrder(n.right);
	}
    }
}
