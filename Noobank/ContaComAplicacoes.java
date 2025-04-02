
class ContaComAplicacoes extends Conta {
    private double multa;
    private boolean vencida;
    
    public ContaComAplicacoes(double depositoInicial, double multa, boolean vencida) {
        super(depositoInicial);
        this.multa = multa;
        this.vencida = vencida;
    }
    
    public double sacar(double valor) {
        if (!this.vencida) {
            valor = valor - (valor * (this.multa / 100));
        }
        return super.sacar(valor);
    }
}
