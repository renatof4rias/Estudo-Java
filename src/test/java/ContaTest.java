import org.example.Conta;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ContaTest {

    @Test
    @DisplayName("Deposito Conta Ativa")
    public void deveDepositarComContaAtiva(){

        Conta conta = new Conta();

        conta.ativar();
        conta.depositar(100.00);

        Assertions.assertEquals(100.00, conta.getSaldo());

    }

    @Test
    @DisplayName("Deposito Conta Inativa")
    public void naoDeveDepositarComContaInativa(){

        Conta conta = new Conta();

        conta.inativar();
        conta.depositar(100.00);
        Assertions.assertEquals(0.00, conta.getSaldo());

    }

    @Test
    @DisplayName("Saque Conta Ativa e Saldo Positivo")
    public void saqueContaAtiva(){

        Conta conta = new Conta();
        conta.ativar();

        conta.depositar(100.00);
        conta.sacar(20.00);

        Assertions.assertEquals(80.00, conta.getSaldo());

    }


    @Test
    @DisplayName("Saque Conta Ativa e Saldo Negativo")
    public void saqueSaldoNegativo(){

        Conta conta = new Conta();
        conta.ativar();

        conta.depositar(100.00);
        conta.sacar(110.00);

        Assertions.assertEquals(100.00, conta.getSaldo());

    }

    @Test
    @DisplayName("Saque Conta Inativa")
    public void saqueContaInativa(){

        Conta conta = new Conta();

        conta.ativar();
        conta.depositar(100.00);

        conta.inativar();
        conta.sacar(20.00);

        Assertions.assertEquals(100.00, conta.getSaldo());

    }

}