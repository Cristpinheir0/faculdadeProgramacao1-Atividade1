public class Conta {
    private int numero;
    private double saldo;

    /**
     * Construtor implementado
     *
     * @param numero
     * @param saldo
     */
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public Conta(){
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public double getSaldo() {
        return saldo;
    }
}
