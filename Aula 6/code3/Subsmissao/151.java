static void reverse(Stack<Integer> s, int n) {
    int array[] = new int[n];
    for(int i=0;i<n;i++)
	array[i]=LibStack.pop(s);
    for(int i=0;i<n;i++)
	LibStack.push(s,array[i]);
}
