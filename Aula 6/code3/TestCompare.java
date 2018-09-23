// Testando o metodo compareTo() dos wrappers String e Integer
class TestCompare {
    public static void main(String[] args) {

	// -------------------------------------------------------------

	String s1 = "ana";
	String s2 = "carlos";
	String s3 = "adalberto";

	System.out.println("s1.compareTo(s1) = " + s1.compareTo(s1));
	System.out.println("s1.compareTo(s2) = " + s1.compareTo(s2));
	System.out.println("s1.compareTo(s3) = " + s1.compareTo(s3));

	// -------------------------------------------------------------
	System.out.println();
	// -------------------------------------------------------------

	Integer i1 = new Integer(22);
	Integer i2 = new Integer(10);
	Integer i3 = new Integer(43);

	System.out.println("i1.compareTo(i2) = " + i1.compareTo(i2));
	System.out.println("i1.compareTo(i3) = " + i1.compareTo(i3));

	// -------------------------------------------------------------
	
    }
}
    
