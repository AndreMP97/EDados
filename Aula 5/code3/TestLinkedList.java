public class TestLinkedList {
  public static void main(String args[]) {
    LinkedList<Integer> l = new LinkedList<Integer>();
    LinkedList<Integer> k = new LinkedList<Integer>();
    LinkedList<Character> t = new LinkedList<Character>();
    LinkedList<Character> c = new LinkedList<Character>();
    char[] vogais = {'a','l','g','o','r','i','t','m','o','s'};
    for(int i = 8 ; i > 0 ; i--)
      LibLinkedList.addFirst(l, i);
    for(int s = 0; s<5; s++)
	LibLinkedList.addFirst(k,s);
    //System.out.println("list size: " + LibLinkedList.size(l));
    LibLinkedList.add(l, 55, 5);
    LibLinkedList.add(l, 22, 9);  
    LibLinkedList.addLast(l, 33);  
    //System.out.println("list size: " + LibLinkedList.size(l));
    //System.out.println(LibLinkedList.toString(l));
    LibLinkedList.removeFirst(l); 
    LibLinkedList.remove(l, 3);
    //System.out.println("indexOf(6): " + LibLinkedList.indexOf(l, 6));
    //System.out.println(LibLinkedList.toString(l));
    for (int j=9;j>=0;j--) 
	LibLinkedList.addFirst(c,vogais[j]);
    System.out.println(LibLinkedList.toString(k));
    LibLinkedList.duplicate(k);
  }
}
