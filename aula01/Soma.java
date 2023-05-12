import javax.swing.JOptionPane;
public class Soma {
    public static void main (String [] args){
        int a;
        int b;
        int resultado;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));

        resultado = a + b;

        JOptionPane.showMessageDialog(null, resultado);
    }
}