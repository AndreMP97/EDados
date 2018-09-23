import java.util.Scanner;

public class TestAccount {
    public static void main(String[] args) {
	Scanner stdin = new Scanner(System.in);
	int user=0;
	float amount=0;
	Account a = new Account();
	System.out.print("Escolha o valor inicial da conta: ");
	amount=stdin.nextInt();
	if (amount > 0) {
	    a.balance=amount;
	}
	while (user != 7) {
	System.out.println("1) Depositar dinheiro.");
	System.out.println("2) Levantar dinheiro.");
	System.out.println("3) Adicionar taxa de juro.");
	System.out.println("4) Verificar saldo.");
	System.out.println("5) Número de movimentos efetuados.");
	System.out.println("6) Extrato da conta (últimos 10 movimentos).");
	System.out.println("7) Sair.");
	user=stdin.nextInt();
	switch(user) {
	case 1: System.out.print("Escolha o valor a ser depositado: ");
	        amount = stdin.nextInt();
	        a.balance=LibAccount.deposit(a, amount);
		break;
	case 2: System.out.print("Escolha o valor a ser levantado: ");
	        amount = stdin.nextInt();
		a.balance=LibAccount.withdraw(a, amount);
		break;
        case 3: System.out.print("Escolha o valor (em percentagem) da taxa de juro a adicionar: ");
	        amount = stdin.nextInt();
		a.balance = LibAccount.addInterest(a, amount);
		break;
	case 4: System.out.printf("Saldo: %.2f\n", LibAccount.getBalance(a));
	        break;
	case 5: System.out.println("Movimentos efetuados: " + LibAccount.getMovements());
	        break;
	case 6:	System.out.printf("Movimentos efetuados: %.0f\n", LibAccount.getExtract(a));
	        break;
	}
	}
    }
}
