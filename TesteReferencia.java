public class TesteReferencia {
    public static void main(String[] args) {
        Conta pConta = new Conta();
        pConta.saldo = 50;
        System.out.println(pConta.saldo);
        Conta sConta = pConta;
        System.out.println(sConta);
        sConta.nomeDoTitular = "Paulo";
        System.out.println("O nome do títular é " + pConta.nomeDoTitular + " E tem guardado " + pConta.saldo);
    }
}
