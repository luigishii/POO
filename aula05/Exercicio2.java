import javax.swing.JOptionPane;
public class Exercicio2 {
    public static void main(String[] args) {
        double a, b, c, bhaskara, delta;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b"));
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c"));
        double bAoQuadrado = Math.pow (b , 2);
        bhaskara = Math.sqrt(bAoQuadrado - 4 * (a) * (c) );
        delta = bhaskara / (2 * a);
    }
    
}
