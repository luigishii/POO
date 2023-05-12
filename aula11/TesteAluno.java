public class TesteAluno{
    public static void main(String[] args) {
        aluno a1 = new Aluno();
        aluno a2 = new Aluno();

        a1.nome = "Ana";
        a1.idade = 27;

        a2.nome = "Pedro";
        a2.idade = 17;

        System.out.printf(f"a1: Nome: %s,
        Idade: %d,
        Instituição: %s\n",
        a1.nome, a1.idade, Aluno.instituicao);

        System.out.printf(f"a2: Nome: %s,
        Idade: %d,
        Instituição: %s\n",
        a2.nome, a2.idade, Aluno.instituicao);
    }    
}