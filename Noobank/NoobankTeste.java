public class NoobankTeste {
    public static void main(String[] args) {
        Conta contaBasica = new Conta(500);
        ContaPoupanca contaPoupanca = new ContaPoupanca(1000, 2);
        ContaComAplicacoes contaInvestimento = new ContaComAplicacoes(2000, 5, false);
        ContaSalario contaSalario = new ContaSalario(1500, 5, 1);
        ContaEspecial contaVip = new ContaEspecial(3000, 20);
        
        contaBasica.depositar(200);
        contaPoupanca.aplicarJuros();
        contaInvestimento.sacar(500);
        contaSalario.sacar(100);
        contaVip.sacar(3500);
        contaVip.aplicarJurosNegativo();
        
        System.out.println("Saldo Conta Básica: " + contaBasica.getSaldo());
        System.out.println("Saldo Conta Poupança: " + contaPoupanca.getSaldo());
        System.out.println("Saldo Conta Investimento: " + contaInvestimento.getSaldo());
        System.out.println("Saldo Conta Salário: " + contaSalario.getSaldo());
        System.out.println("Saldo Conta VIP: " + contaVip.getSaldo());
    }
}