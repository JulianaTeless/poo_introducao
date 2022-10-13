import javax.swing.JOptionPane;

public class Carro {
    private String cor;
    private String placa;

    public void repassarCor(){
        JOptionPane.showMessageDialog(null,"Aplicando cor:  " + getCor(),"Repintando..",JOptionPane.WARNING_MESSAGE);
    }

    public void multa(){
        JOptionPane.showMessageDialog(null,"Aplicando multa no carro de placa: " + getPlaca(), "Multa",JOptionPane.WARNING_MESSAGE);
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

}
