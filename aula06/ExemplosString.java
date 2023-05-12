import javax.swing.JOptionPane;
public class ExemplosString{
    public static void main(String [] args){
        // String s = JOptionPane.showInputDialog("Digite uma string: "); 
        // int comprimento = s.length();
        // JOptionPane.showMessageDialog( null, s + " tem " + comprimento + " caracteres");      
        
        
        /*int idade = Integer.parseInt(
            JOptionPane.showInputDialog(
                null, "Digite a sua idade")
        );
        float peso = Float.parseFloat(
            JOptionPane.showInputDialog(
                null, "Digite seu peso")
        );
        String nome = JOptionPane.showInputDialog(
            null, "Digite seu nome");
        String textoFinal = String.format(
            "Me chamo %s, tenho %d e meu peso é %fKg",
            nome,
            idade,
            peso
        );
        JOptionPane.showMessageDialog(
            null,
            textoFinal
        ); */  

        
        
        /*String nome = JOptionPane.showInputDialog(
            "Digite seu nome"
        );
        char primeiraLetra = nome.charAt(0);
        JOptionPane.showMessageDialog(
            null, 
            String.format(
                "Olá, %s. Seu nome começa com %c",
                nome,
                primeiraLetra
            )
        );*/

        // String nome = JOptionPane.showInputDialog(
        //     "Qual o seu nome?"
        // );
        // String sobrenome = JOptionPane.showInputDialog(
        //     "Qual o seu sobrenome?"
        // );
        
        // String texto = String.format(
        //     "Olá, %s %s, seja bem vindo",
        //     nome,
        //     sobrenome
        // );
        // JOptionPane.showMessageDialog(null,texto);
        
        String s1 = JOptionPane.showInputDialog(
            "Qual a primeira string?"
        );
        String s2 = JOptionPane.showInputDialog(
            "Qual a segunda string?"
        );
        // // if (s1.equals(s2)){
        //     JOptionPane.showMessageDialog(
        //         null,
        //         s1 + " e " + s2 + " são iguais considerando a caixa"
        //     );
        // }
        // else{
        //     JOptionPane.showMessageDialog(
        //         null,
        //         s1 + " e " + s2 + " são diferentes considerando a caixa"
        //     );
        // }

        if (s1.equalsIgnoreCase(s2)){
            JOptionPane.showMessageDialog(
                null,
                s1 + " e " + s2 + " são iguais desconsiderando a caixa"
            );
        }
        else{
            JOptionPane.showMessageDialog(
                null,
                s1 + " e " + s2 + " são diferentes desconsiderando a caixa"
            );
        }
    }
}