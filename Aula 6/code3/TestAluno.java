class Aluno implements Comparable<Aluno>{
    String nome;
    Integer numero;

    Aluno(String s, int n) {
	nome   = s;
	numero = n;	
    }

    public int compareTo(Aluno a) {
	return numero.compareTo(a.numero);
    }
}

public class TestAluno {
    public static void main(String[] args) {
	LinkedList<Aluno> l = new LinkedList<Aluno>();

	Aluno a = new Aluno("Joaquim Santos", 201303011);
	Aluno b = new Aluno("Maria Cunha",    201307085);
	Aluno c = new Aluno("Joaquim Santos", 201303011);
	
	LibLinkedList.addLast(l, a);
	LibLinkedList.addLast(l, b);
	LibLinkedList.addLast(l, c);

	System.out.println("Posicao de [" + a.nome + ", " + a.numero + "] = " + LibLinkedList.indexOf(l, a));
	System.out.println("Posicao de [" + b.nome + ", " + b.numero + "] = " + LibLinkedList.indexOf(l, b));
	System.out.println("Posicao de [" + c.nome + ", " + c.numero + "] = " + LibLinkedList.indexOf(l, c));
    }
}
