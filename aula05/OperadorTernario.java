import javax.swing.JOptionPane;

public class OperadorTernario {
    public static void main(String[] args) {
        //String podeDirigir;
        int idade = Integer.parseInt(
            JOptionPane.showInputDialog("Digite a sua idade, vejamos se você pode dirigir")
        );
    //podeDirigir = idade >= 18 ? "Pode digirir" : "Não pode dirigir";
    JOptionPane.showMessageDialog(null, idade >= 18 ? "Pode dirigir" : "Não pode dirigir");
    }
}
