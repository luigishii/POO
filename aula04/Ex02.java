import javax.swing.JOptionPane;
public class Ex02 {
    public static void main (String [] args){ 
        double r, A;

        r = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de r"));

        double rAoQuadrado = Math.pow(r , 2);
        A = 3.14159 * rAoQuadrado;

        JOptionPane.showMessageDialog(null, A);
    }
}        
 