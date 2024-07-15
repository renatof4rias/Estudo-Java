import org.example.Conta;
import org.junit.jupiter.api.*;

public class ContaTest {

    private Conta conta;
    private static double depositoInicial;
    private static double saqueValido;
    private static double saqueInvalido;
    private static double saldoZerado;

    @BeforeAll
    private static void definirValoresPadroes(){
      saldoZerado = 0.0;
      depositoInicial = 100.00;
      saqueValido = 70.00;
      saqueInvalido = 110.00;
    }

    @BeforeEach
    private void inicializarConta(){
        conta = new Conta();
        conta.ativar();
    }

    @Test
    @DisplayName("Deposito Conta Ativa")
    public void deveDepositarComContaAtiva(){

        Assertions.assertTrue(conta.depositar(depositoInicial));
        Assertions.assertEquals(depositoInicial, conta.getSaldo());

    }

    @Test
    @DisplayName("Deposito Conta Inativa")
    public void naoDeveDepositarComContaInativa(){

        conta.inativar();
        Assertions.assertFalse(conta.depositar(depositoInicial));
        Assertions.assertEquals(saldoZerado, conta.getSaldo());

    }

    @Test
    @DisplayName("Saque Conta Ativa e Saldo Positivo")
    public void saqueContaAtiva(){

        Assertions.assertTrue(conta.depositar(depositoInicial));
        Assertions.assertTrue(conta.sacar(saqueValido));
        Assertions.assertEquals(depositoInicial - saqueValido, conta.getSaldo());

    }


    @Test
    @DisplayName("Saque Conta Ativa e Saldo Negativo")
    public void saqueSaldoNegativo(){

        Assertions.assertTrue(conta.depositar(depositoInicial));
        Assertions.assertFalse(conta.sacar(saqueInvalido));
        Assertions.assertEquals(depositoInicial, conta.getSaldo());

    }

    @Test
    @DisplayName("Saque Conta Inativa")
    public void saqueContaInativa(){

        Assertions.assertTrue(conta.depositar(depositoInicial));
        conta.inativar();
        Assertions.assertFalse(conta.sacar(saqueValido));
        Assertions.assertEquals(depositoInicial, conta.getSaldo());

    }
}