import java.util.Scanner;

class Account {
    double balance;               // O saldo da conta
    LinkedList<Double> movements; // Os movimentos

    Account() {
	balance = 0;
	movements = new LinkedList<Double>();
    }	
}

class LibAccount {
    public static void deposit(Account a, double m) {
	a.balance += m;
	LibLinkedList.addLast(a.movements, m);
    }

    public static void withdraw(Account a, double m) {
	a.balance -= m;
	LibLinkedList.addLast(a.movements, -m);
    }

    public static void getMovements(Account a) {
	Double saldo = 0.0;
	System.out.printf("Saldo: %.2f\n", a.balance);
	System.out.println("Numero de movimentos: " + a.movements.size);
	for (int i=0;i<a.movements.size;i++) {
	    saldo = saldo + LibLinkedList.get(a.movements,i);
	    System.out.printf("%.2f -> %.2f\n", LibLinkedList.get(a.movements,i), saldo);
	}
    }
    
}

class ED143 {
    public static void main(String[] args) {
	
	Account a = new Account();
	
	Scanner in = new Scanner(System.in);	
	int n = in.nextInt();
	for (int i=0; i<n; i++) {
	    String op = in.next();
	    if (op.equals("depositar"))     LibAccount.deposit(a, in.nextDouble());
	    else if (op.equals("levantar")) LibAccount.withdraw(a, in.nextDouble());
	}
	LibAccount.getMovements(a);
    }
}
