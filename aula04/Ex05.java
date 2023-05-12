import javax.swing.JOptionPane;
public class Ex05 {
    public static void main (String [] args){
        int num, nota1, nota2, nota5, nota10, nota20, nota50, nota100, nota200, resto;

        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));

        nota200 = num/200;
        resto = num%200;
        nota100 = resto/100;
        resto = resto%100;
        nota50 = resto/50;
        resto = resto%50;
        nota20 = resto/20;
        resto = resto%20;
        nota10 = resto/10;
        resto = resto%10;
        nota5 = resto/5;
        resto = resto%5;
        nota2 = resto/2;
        resto = resto%2;
        nota1 = resto/1;
        resto = resto%1;

        JOptionPane.showMessageDialog(null, "O numero de notas é: \n" + "notas de 200: " + nota200 + "\n" +
         "notas de 100: " + nota100 + "\n" + "notas de 50: " + nota50 + "\n" + "notas de 20: " + nota20 + "\n" + "notas de 10: " + nota10 + "\n" +
          "notas de 5: " + nota5 + "\n" + "notas de 2: " + nota2 + "\n" + "notas de 1: " + resto );
    }
}