public class Carro {
    //variável de instância
    private String roda;
    private String modelo;
    
    //modificador
    //setter
    public void dirigir(String roda){
        System.out.println("Digirindo...");
    }
        //operador de auto referência: this(nomes iguais)
    public void acelerar(){
        System.out.println("Acelerando...");
    }    
    
    //método de acesso
    //getter
    public String getroda(){
        return roda;
    }
    public String getmodelo(){
        return modelo;
    }
    public void setRoda(String roda){
        this.roda = roda;    
    }
    public void setModelo(String modelo){
        this.modelo = modelo;
    }
}