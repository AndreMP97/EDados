public class TestLinkedList {
  public static void main(String args[]) {
    LinkedList<Integer> l = new LinkedList<Integer>();
    for(int i = 8 ; i > 0 ; i--)
        LibLinkedList.addFirst(l, new Integer(i));
    System.out.println("list size: " + LibLinkedList.size(l));
    LibLinkedList.add(l, new Integer(55), 5);
    LibLinkedList.add(l, new Integer(22), 9);  
    LibLinkedList.addLast(l, new Integer(33));
    System.out.println(LibLinkedList.toString(l));
    System.out.println("Nova lista: " + LibLinkedList.toString(LibLinkedList.filterGreaterThan(l,40)));
    System.out.println("Reverse: " + LibLinkedList.toString(LibLinkedList.reverse(l)));
  }
}
