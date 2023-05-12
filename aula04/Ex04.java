import javax.swing.JOptionPane;
public class Ex04 {
    public static void main (String [] args){
        double a, b, res;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b:"));
        res = a + b;

        JOptionPane.showMessageDialog(null, "Soma:" + res);
    }
}