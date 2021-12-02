import model.Conta;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class TestConta {

    @Test
    public void SacarValorComSaldo(){

        Conta conta = new Conta(150);

        boolean result = conta.sacar(25);

        Assert.assertTrue(result);
        Assert.assertEquals(125.0, conta.getSaldo(), 0.1);
    }

    @Test
    public void SacarValorSemSaldo(){

        Conta conta = new Conta(0);

        boolean result = conta.sacar(25);

        Assert.assertFalse(result);
        Assert.assertEquals(0, conta.getSaldo(), 0.1);
    }

    @Test
    public void SacarValorMaiorQueSaldo(){

        Conta conta = new Conta(125);

        boolean result = conta.sacar(300);

        Assert.assertFalse(result);
        Assert.assertEquals(125.0, conta.getSaldo(), 0.1);
    }
}
