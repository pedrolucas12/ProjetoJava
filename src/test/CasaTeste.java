package test;

import static org.junit.jupiter.api.Test;
import control.ControleCasa;
import model.Casa;

public class CasaTeste {
    ControleCasa controller = new ControleCasa();

    @Test
    public void testCadastroCasa(){
       	Casa teste = new Casa("Casa Teste", null, 308.0, 0, 0, 0, 0, 0, 0);
        controller.cadastraCasa(teste);
    };

    @Test
    public void testListaCasa(){
        controller.getLista(); 
    };

    @Test
    public void testListaNomesCasa() {
        String[] resultado = controller.getListaNomesCasa();
        System.out.println(resultado);
    };


}