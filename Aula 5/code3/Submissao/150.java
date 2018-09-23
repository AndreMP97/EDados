public static <T extends Comparable<? super T>>
    void filter(LinkedList<T> l, T min, T max) {
    for(int j=0;j<l.size;j++) {
	if ((get(l,j)).compareTo(min)<=-1 || (get(l,j)).compareTo(max)>=1) {
	    remove(l,j);
	    j--;
	}
    }
    //System.out.println(toString(l));
}
