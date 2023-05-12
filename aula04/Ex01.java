import javax.swing.JOptionPane;
public class Ex01 {
    public static void main (String [] args){
        double x1;
        double x2;
        double y1;
        double y2;
        double dist;
        x1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x1"));
        y1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y1"));
        x2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de x2"));
        y2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de y2"));

        double resultado1 = Math.pow(x2 - x1, 2);
        double resultado2 = Math.pow(y2 - y1, 2);
        dist = Math.sqrt(resultado1 + resultado2);
        
        JOptionPane.showMessageDialog(null, dist);
    }
}    