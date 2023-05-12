package HerancaParte3;

public class TesteLecionar {
    public static void main(String[] args) {
        ProfessorPesquisador pp = 
            new ProfessorPesquisador();
        
            pp.setNome("João");

            pp.lecionar();
            pp.pesquisar();
    }
}
