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



}
