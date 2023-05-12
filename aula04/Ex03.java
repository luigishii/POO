import javax.swing.JOptionPane;
public class Ex03 {
    public static void main (String [] args){
        double a, b, c, res;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c:"));

        res = (a*2 + b*3 + c*5) /3;

        JOptionPane.showMessageDialog(null, res);
    }
}