import static javax.swing.JOptionPane.showInputDialog;

import javax.swing.JOptionPane;
public class SwitchCase{
    public static void main(String[] args) {
        int nota;
        nota = Integer.parseInt(showInputDialog("Digite a nota"));
        switch (nota){
            case 10: 
                JOptionPane.showMessageDialog(null, "Parabéns");
                JOptionPane.showMessageDialog(null, "Conceito A");
                break;
            case 9:
                JOptionPane.showMessageDialog(null, "Conceito A");
                break;
            case 8:
                JOptionPane.showMessageDialog(null, "Conceito B");
                break;
            case 7:
                 JOptionPane.showMessageDialog(null, "Conceito C");
                 break;
            default:
                JOptionPane.showMessageDialog(null, "R");
                break;
        }
        JOptionPane.showMessageDialog(null, "Até mais");
    }
}