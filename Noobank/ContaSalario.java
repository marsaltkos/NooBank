
class ContaSalario extends Conta {
    private int transacoesGratuitas;
    private int transacoesRealizadas;
    private double taxaExcedente;
    
    public ContaSalario(double depositoInicial, int transacoesGratuitas, double taxaExcedente) {
        super(depositoInicial);
        this.transacoesGratuitas = transacoesGratuitas;
        this.taxaExcedente = taxaExcedente;
        this.transacoesRealizadas = 0;
    }
    
    public double sacar(double valor) {
        double valorSacado = super.sacar(valor);
        this.transacoesRealizadas = this.transacoesRealizadas + 1;
        if (this.transacoesRealizadas > this.transacoesGratuitas) {
            this.saldo = this.saldo - this.taxaExcedente;
        }
        return valorSacado;
    }
}