package HerancaParte3;

public abstract class Professor extends Pessoa{
    String matricula;

    public void lecionar(){
        System.out.printf("%s lecionando...\n", getNome());
    }
}
