public static <T extends Comparable<? super T>>
    void remove(LinkedList<T> l, T value) {
    for(int j=0;j<l.size;j++) { 
	if((get(l,j)).compareTo(value)==0) {
	    LibLinkedList.remove(l, j);
	    j--;
	}
    }
    //System.out.println(toString(l));
}
