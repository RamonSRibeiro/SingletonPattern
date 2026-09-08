import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ConfiguracaoTest {

    @Test
    public void deveRetornarMesmaInst(){
        Configuracao config1 = Configuracao.getInstancia();
        Configuracao config2 = Configuracao.getInstancia();
        assertTrue(config1 == config2);
    }

    @Test
    public void deveRetornarNomeSistema(){
        Configuracao config = Configuracao.getInstancia();
        String resultado = config.getNomeSistema();
        assertEquals("Ubuntu", resultado);

    }

    @Test
    public void deveRetornarAmbiente(){
        Configuracao instancia = Configuracao.getInstancia();
        String resultado = instancia.getAmbiente();
        assertEquals("Linux", resultado);
    }

}
