importjavax.swing.JOptionPane
public class IfSimples { 
    Public static void main(String[] args) {
        double nota;
        nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota")); 
        if (nota>=70) {
            JOptionPane.showMessageDialog(null,"Aprovado"); 
        }
    }
}
