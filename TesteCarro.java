import javax.swing.JOptionPane;

public class TesteCarro {
    public static void main(String[] args) {
        //Carro carro1 = new Carro();
        //Carro carro2 = new Carro();

        String cor1 = JOptionPane.showInputDialog("Qual a cor do carro 1");
        String cor2 = JOptionPane.showInputDialog("Qual a cor do carro 2");
        //carro1.setCor(cor1);
        //carro2.setCor(cor2);

        String placa1 = JOptionPane.showInputDialog("Qual a placa do carro 1?");
        String placa2 = JOptionPane.showInputDialog("Qual a placa do carro 2?");
        //carro1.setPlaca(placa1);
        //carro2.setPlaca(placa2);

        Carro carro1 = new Carro(cor1,placa1);
        Carro carro2 = new Carro(cor2,placa2);

       carro1.multa();
       carro2.multa();
       carro1.repassarCor();
       carro2.repassarCor();
    }
   

    

}
