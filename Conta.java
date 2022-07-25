public class Conta {
    double saldo;
    String agencia;
    String contaDoUsuario;
    String nomeDoTitular;

    public  void depositar(double valor) {
        this.saldo = saldo + valor;
    }


public  boolean saque(double valor) {
        if (this.saldo >= valor) {
            this.saldo = saldo -= valor;
            return true;
        } else {
            return false;
        }
        }

        public  boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo - valor;
            destino.depositar(valor);
            return true;
        }

        }
        }

}
