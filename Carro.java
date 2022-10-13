import javax.swing.JOptionPane;

public class Carro {
    private String cor;
    private String placa;

    public void multa(){
        JOptionPane.showMessageDialog(null,"Aplicando multa no carro de placa: %s", getPlaca(), 0);
    }

    public void repassarCor(){
        JOptionPane.showMessageDialog(null,"Aplicando multa no carro de placa: %s", getCor(), 0);
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
