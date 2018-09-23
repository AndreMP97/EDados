import java.util.Scanner;
import java.util.Arrays;

// Classe para a equipa
class Equipa implements Comparable<Equipa> {
    public String nome;
    public int vit, emp, der, golm, gols, gola, pontos;

    Equipa(String n, int v, int e, int d, int gm, int gs) {
	nome = n;
	vit = v;
	emp = e;
	der = d;
	golm = gm;
	gols = gs;
	gola = gm-gs;
	pontos = 3*v+1*e;
    }
    
    // Definir como comparar dois elementos da classe Person
    // compareTo e uma funcao que compara objecto com outro objecto "p"
    // Esta funcao deve devolver:
    //  - numero < 0 se objecto for menor que objecto "p"
    //  - numero > 0 se objecto for maior que objecto "p"
    //  - zero, se objecto for igual ao objecto "p"
    public int compareTo(Equipa p) {
	if (pontos < p.pontos) return +1;
	else if (pontos > p.pontos) return -1;
	else {
	    if(gola < p.gola) return +1;
	    else if (gola > p.gola) return -1;
	    else {
		if (nome.compareTo(p.nome)<0) return -1;
		else if (nome.compareTo(p.nome)>0) return +1;
	    }
	}
	return nome.compareTo(p.nome);
    }
}

public class ED163 {
    public static void main(String args[]) {
	Scanner stdin = new Scanner(System.in);
	int n    = stdin.nextInt();	
	Equipa v[] = new Equipa[n]; 
	for (int i = 0; i<n; i++)
	    v[i] = new Equipa(stdin.next(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt(), stdin.nextInt());
       	
	// Chamada ao sort padrao da linguagem Java
	// Usa o comparador padrao do tipo do array
	Arrays.sort(v);
	
	for (int i = 0; i<n; i++)
	    System.out.println(v[i].nome + " " + v[i].pontos + " " + v[i].gola);
    }
}
