public static <T extends Comparable<? super T>>
    int count(LinkedList<T> l, T value) {
    int contador=0;
    for(int j=0;j<l.size;j++) {
	if ((get(l,j)).compareTo(value)==0) {
	    contador++;
	}
    }
    return contador;
}
