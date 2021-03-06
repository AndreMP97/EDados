public class TestLinkedList {
  public static void main(String args[]) {
    LinkedList<Integer> l = new LinkedList<Integer>();
    LinkedList<Integer> k = new LinkedList<Integer>();
    for(int i = 8 ; i > 0 ; i--)
      LibLinkedList.addFirst(l, new Integer(i));
    System.out.println("list size: " + LibLinkedList.size(l));
    LibLinkedList.add(l, new Integer(55), 5);
    LibLinkedList.add(l, new Integer(22), 9);  
    LibLinkedList.addLast(l, new Integer(33));  
    System.out.println("list size: " + LibLinkedList.size(l));
    System.out.println(LibLinkedList.toString(l));
    LibLinkedList.removeFirst(l); 
    LibLinkedList.remove(l, 3);
    System.out.println("indexOf(6): " + LibLinkedList.indexOf(l, 6));
    System.out.println(LibLinkedList.toString(l));
    System.out.println("Lista Copiada: " + LibLinkedList.toString(LibLinkedList.copy(l)));
    for (int i = 0; i < 8; i++) {
        LibLinkedList.addLast(k, new Integer(i));
    }
    System.out.println("Lista k: " + LibLinkedList.toString(k));
    LibLinkedList.oddPositions(k);
    LibLinkedList.duplicate(k);
    LibLinkedList.concatenate(l,k);
  }
}
