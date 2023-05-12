import javax.swing.JOptionPane;
public class Exercicio1 {
    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Digite o número"));
        if (num > 1){
            JOptionPane.showMessageDialog(null, "Número positivo");
        } 
        else{
            if (num < 1)
                JOptionPane.showMessageDialog(null, "Número negativo");
            }
            {
                JOptionPane.showMessageDialog(null, "Número neutro");
            }
    }
}


