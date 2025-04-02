

class ContaPoupanca extends Conta {
    private double taxaJuros;
    
    public ContaPoupanca(double depositoInicial, double taxaJuros) {
        super(depositoInicial);
        this.taxaJuros = taxaJuros;
    }
    
    public void aplicarJuros() {
        this.saldo = this.saldo + (this.saldo * (this.taxaJuros / 100));
    }
}