public static <T extends Comparable<? super T>>
    void oddPositions(LinkedList<T> l) {      
    for(int j=0;j<l.size;j++) {
	if (j%2==1) {
	    remove(l, j);
	    if ((j+1)<l.size)
		remove(l, j+1);
	}
    }
}
