package HerancaParte2;

public class TesteHeranca1 {
    public static void main(String[] args) {
        //variável de referência(tipo,nome)
        AlunoDeGraduacao aluno;
        aluno = new AlunoDeGraduacao();
        //Pessoa
        aluno.nome = "Pedro";
        aluno.idade = 17;
        //AlunoDeGraduacao
        aluno.nota1 = 10;

        System.out.printf("Me chamo %s, tenho %d anos e tirei %f\n", aluno.nome,
         aluno.idade, aluno.nota1);
    }
}
