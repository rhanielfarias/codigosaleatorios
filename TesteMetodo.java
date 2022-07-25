public class TesteMetodo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.saldo = 15;
        conta.depositar(15);
        System.out.println(conta.saldo);
        Conta contaThiago = new Conta();
        contaThiago.saldo = 1000;
        contaThiago.transfere(400, conta);
        System.out.println(contaThiago.saldo);
        System.out.println(conta.saldo);
       }

}
