import javax.swing.JOptionPane;

public class TesteCarro2 {
    public static void main(String[] args) {
        Carro v1 = new Carro();
        Carro v2 = new Carro();

        String roda1 = JOptionPane.showInputDialog("Digite a roda do veiculo 1");
        String roda2 = JOptionPane.showInputDialog("Digite a roda do veiculo 2");
            
        String modelo1 = JOptionPane.showInputDialog("Digite o modelo do veiculo 1");
        String modelo2 = JOptionPane.showInputDialog("Digite o modelo do veiculo 2");

        v1.setRoda(roda1);
        v1.setModelo(modelo1);

        v2.setRoda(roda2);
        v2.setModelo(modelo2);

        v1.dirigir();
        v2.dirigir();
        
        v1.acelerar();
        v2.acelerar();

        System.out.printf("V1. Roda:%s.Modelo:%s", v1.getroda(), v1.getmodelo());
        System.out.println(String.format(
            "V2.Roda:%s.Modelo",
            v2.getroda(),
            v2.getmodelo()
        ));

    }
}