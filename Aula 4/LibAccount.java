class LibAccount {
    static int movements = 0;
    static float array[] = new float [100];
    public static float deposit (Account a, float amount) {
	array[movements]=amount;
	movements++;
	System.out.println("Depósito efetuado com sucesso!");
	return a.balance+amount;
    }
    public static float withdraw (Account a, float amount) {
	if ((a.balance-amount) < 0)
	    throw new RuntimeException("Erro! Saldo inferior a 0.");
	else {
	    array[movements]=-amount;
	    movements++;
	    System.out.println("Dinheiro levantado com sucesso!");
	    return a.balance-amount;
	}
    }
    public static float addInterest(Account a, float amount) {
	System.out.println("Taxa de juro adicionada com sucesso!");
	float interest = (amount)/100;
	return a.balance+(a.balance*interest);
    }
    public static int getMovements() {
	return movements;
    }
    public static float getBalance(Account a) {
	return a.balance;
    }
    public static float getExtract(Account a) {
	for(int i=10; i >= 0; i--) {
	    if (array[10-i]>0 || array[10-i]<0)
		System.out.printf("%.2f\n", array[10-i]);
	}
	System.out.printf("Saldo: %.2f\n", a.balance);
	return movements;
    }
}

