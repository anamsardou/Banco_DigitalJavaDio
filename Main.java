public class Main {

    public static void main(String[] args) {

        Conta cc = new ContaCorrente();

        Conta poupanca = new ContaPoupanca();

        Cliente ana = new Cliente();
        ana.setNome("Ana Maria");

        cc.depositar(100);
        cc.transferir(50);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }
}
