package Construtores;

public class Pessoa{
    private String nome;
    private int idade;

    //construtor padrão
    //observe que ele tem  a lista de parâmetros vazia
    public Pessoa(String nome, int idade){
        System.out.println("Construindo uma pessoa...");
        setNome(nome);
        setIdade(idade);
    }


    public int getIdade(){
        return idade;
    }

    public String getNome(){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String toString(){
        return String.format(
            "Nome: %s, Idade: %d",
            nome,
            idade
        );

    }
}