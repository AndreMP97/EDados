// Uma classe simples para representar um aluno
class Aluno {
    // Atributos da classe (variáveis para conter informação)
    String nome;
    int numero;

    // Construtor "padrão"
    Aluno() {
        nome   = "indefinido";
        numero = -1;
    }
    Aluno(String n, int mec) {
	nome = n;
	numero = mec;
    }
}

// Classe principal contendo o main para testar a classe Aluno
public class TestAluno {
    public static void main(String[] args) {
        Aluno a = new Aluno();
	Aluno b = new Aluno();
	Aluno c = new Aluno();
	Aluno d = c;
	Aluno e = new Aluno();
	Aluno f = new Aluno("Manuel", 201506234);
	//Aluno g = new Aluno("Maria");
	c.nome = "modificado";
	System.out.println("Aluno a | numero: " + a.numero + " | nome: " + a.nome);
	System.out.println("Aluno b | numero: " + b.numero + " | nome: " + b.nome);
	System.out.println("Aluno c | numero: " + c.numero + " | nome: " + c.nome);
	System.out.println("Aluno d | numero: " + d.numero + " | nome: " + d.nome);
	System.out.println("Aluno e | numero: " + e.numero + " | nome: " + e.nome);
	System.out.println("Aluno f | numero: " + f.numero + " | nome: " + f.nome);
    }
}
