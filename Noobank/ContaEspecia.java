class ContaEspecial extends Conta {
    private double taxaJurosNegativo;
    
    public ContaEspecial(double depositoInicial, double taxaJurosNegativo) {
        super(depositoInicial);
        this.taxaJurosNegativo = taxaJurosNegativo;
    }
    
    public double sacar(double valor) {
        this.saldo = this.saldo - valor;
        return valor;
    }
    
    public void aplicarJurosNegativo() {
        if (this.saldo < 0) {
            this.saldo = this.saldo - (this.saldo * (this.taxaJurosNegativo / 100));
        }
    }
}
