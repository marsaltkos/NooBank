public class Conta {
    protected double saldo;
    
    public Conta() {
        this.saldo = 0.0;
    }
    
    public Conta(double depositoInicial) {
        this.saldo = depositoInicial;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo = this.saldo + valor;
        }
    }
    
    public double sacar(double valor) {
        double valorRetirado;
        if (valor > this.saldo) {
            valorRetirado = this.saldo;
        } else {
            valorRetirado = valor;
        }
        this.saldo = this.saldo - valorRetirado;
        return valorRetirado;
    }
    
    public double getSaldo() {
        return this.saldo;
    }
}





