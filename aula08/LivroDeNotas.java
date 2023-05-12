public class LivroDeNotas {
    //variável de instância
    private String nomeDaDisciplina;
    
    //modificador
    //setter
    public void setNomeDisciplina(String nomeDaDisciplina){
        //operador de auto referência: this(nomes iguais)
        this.nomeDaDisciplina = nomeDaDisciplina;
    }
    //método de acesso
    //getter
    public String getNomeDisciplina(){
        return nomeDaDisciplina;
    }

    // método
    public void exibirMensagem(){
        System.out.println("Bem vindo ao livro de notas da disciplina " + 
        nomeDaDisciplina);
    }
}