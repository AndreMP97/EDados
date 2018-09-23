public static <T extends Comparable<? super T>>
    void concatenate(LinkedList<T> a, LinkedList<T> b) {
    for (int i = 0; i < b.size; i++) {
        addLast(a, get(b, i));
    }
}
