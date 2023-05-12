import javax.swing.JOptionPane;
public class TesteLivroDeNotas {
    public static void main(String[] args) {

        String nomeDaDisciplina = showInputDialog(
            "Qual o nome da disciplina?"
        );
        //variável de referência
        LivroDeNotas livroDeNotas;
        //construindo um objeto
        livroDeNotas = new LivroDeNotas();
        livroDeNotas.nomeDaDisciplina = set(nomeDaDisciplina);

        livroDeNotas.exibirMensagem(nomeDaDisciplina);

        LivroDeNotas livro2 = new LivroDeNotas();
        //syntax sugar
        livro2.nomeDaDisciplina = "Modelagem";

        nomeDaDisciplina = JOptionPane.showInputDialog("Outra disciplina");

        livroDeNotas = new LivroDeNotas();
        
    }
}