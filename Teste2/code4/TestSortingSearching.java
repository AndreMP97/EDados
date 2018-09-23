import java.util.Arrays;

public class TestSortingSearching {
    public static void main( String[] args) {
	
	Integer[] values0 = { 56, 23, 96, 12, 9, 77, 62, 85, 33 };	
	System.out.println("values0: " +  Arrays.toString(values0));
	
	System.out.println("Sequential Search...");
	System.out.println("sequentialSearch(values0, 9) = " + SortingSearching.sequentialSearch(values0, 9));
	System.out.println("sequentialSearch(values0, 61) = " + SortingSearching.sequentialSearch(values0, 61));
	
	System.out.println("Selection Sort ...");
	SortingSearching.selectMinimumSort(values0);
	System.out.println("values0 after sort: " + Arrays.toString(values0));

	// ------------------------------------------------
	System.out.println();
	// ------------------------------------------------
	
	Integer[] values1 = { 56, 23, 96, 12, 9, 77, 62, 85, 33 };
	System.out.println("values1: " +  Arrays.toString(values1));
	System.out.println("Insertion Sort ...");
	SortingSearching.insertionSort(values1);
	System.out.println("values1 after sort: " + Arrays.toString(values1));
	
	System.out.println("Binary Search Recursive ...");
	System.out.println("binarySearchRec(values1, 77) = " + SortingSearching.binarySearchRec(values1,77));
	System.out.println("binarySearchRec(values1, 61) = " + SortingSearching.binarySearchRec(values1,61));
	System.out.println("Binary Search Iterative ...");	
	System.out.println("binarySearch(values1, 85) = " + SortingSearching.binarySearch(values1, 85));
	System.out.println("binarySearch(values1, 61) = " + SortingSearching.binarySearch(values1, 61));

	// ------------------------------------------------
	System.out.println();
	// ------------------------------------------------
	
	Integer[] values2 = { 56, 23, 96, 12, 9, 77, 62, 85, 33 };
	System.out.println("Bubble Sort Simple ...");
	System.out.println(Arrays.toString(values2));
	SortingSearching.bubbleSort0(values2);
	System.out.println(Arrays.toString(values2));

	// ------------------------------------------------
	System.out.println();
	// ------------------------------------------------


	System.out.println("Bubble Sort Optimized ...");
	Integer[] values3 = { 56, 23, 96, 12, 9, 77, 62, 85, 33 };
	System.out.println(Arrays.toString(values3));
	SortingSearching.bubbleSort1(values3);
	System.out.println(Arrays.toString(values3));

	// ------------------------------------------------
	System.out.println();
	// ------------------------------------------------

	System.out.println("Quick Sort ...");	
	Integer[] values4 = { 56, 23, 96, 12, 9, 77, 62, 85, 33 };
	System.out.println(Arrays.toString(values4));
	SortingSearching.quickSort(values4);
	System.out.println(Arrays.toString(values4));


	// ------------------------------------------------
	System.out.println();
	// ------------------------------------------------

	System.out.println("Merge Sort ...");
	Integer[] values5 = { 56, 23, 96, 12, 9, 77, 62, 85, 33 };
	System.out.println(Arrays.toString(values5));
	Integer[] values6 = new Integer[values5.length];
	SortingSearching.mergeSort(values5, values6);
	System.out.println(Arrays.toString(values5));
    }
}
