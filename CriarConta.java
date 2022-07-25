public class CriarConta {
    public static void main(String[] args) {
Conta primeiraConta = new Conta();
Conta segundaConta = new Conta();
primeiraConta.saldo = 300;
primeiraConta.nomeDoTitular = "Rhaniel";
        System.out.println("Na conta de " + primeiraConta.nomeDoTitular);
        System.out.println(" tem guardado no saldo o valor de r$ " + primeiraConta.saldo);
        segundaConta.nomeDoTitular = "Paulo";
        segundaConta.saldo = 500;
        System.out.println("Na conta de " + segundaConta.nomeDoTitular);
        System.out.println(" Tem guardado no saldo o valor de R$ " + segundaConta.saldo);
    }
}
