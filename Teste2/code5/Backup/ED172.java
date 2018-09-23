import java.util.Scanner;
import java.util.LinkedList;

class ED172 {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Map<String,Integer> m1 = new Map<String,Integer>();
    while(in.hasNext()) {
	String temps = in.next();
	if (LibMap.contains(m1, temps) == false) {
	    LibMap.put(m1, temps, 1);
	}
	else {
	    int tempi = LibMap.get(m1, temps);
	    tempi++;
	    LibMap.put(m1, temps, tempi);
	}
    }
    LinkedList<String> list=LibMap.keys(m1);
    for(String s : list) {
	System.out.println(s + ": " + LibMap.get(m1,s));
    }
  }
}
