public class TesteLivroDeNotas2{
    public static void main(String[] args) {
        LivroDeNotas livro = new LivroDeNotas();
        // livro.nomeDaDisciplina = "POO";
        // System.out.println(livro.nomeDaDisciplina);
        livro.setNomeDisciplina("POO");r
        System.out.println(livro.getNomeDisciplina());
        livro.exibirMensagem();
    }
}