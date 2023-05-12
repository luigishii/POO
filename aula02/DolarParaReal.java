import javax.swing.JOptionPane;
public class DolarParaReal{
        public static void main(String [] args){
            double cotacaoDoDolar;
            int quantidadeDeDolares;
            double resultado;
            cotacaoDoDolar = Double.parseDouble(JOptionPane.showInputDialog("Digite a cotação do dólar"));
            quantidadeDeDolares = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dólares"));
            resultado = cotacaoDoDolar * quantidadeDeDolares;
            
            String s = "Dada a cotação do dólar de: " + cotacaoDoDolar + " e a quantidade de dólar de: "
            + quantidadeDeDolares + ", a conversão final resulta em: " + resultado;

            JOptionPane.showMessageDialog(null, s);
        }

    }

