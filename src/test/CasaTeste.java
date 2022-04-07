package test;

import org.junit.jupiter.api.Test;
import static;

import control.ControlApartamento;
import junit.framework.Test;

public class CasaTeste {
    ControlCasa controller = new ControlCasa();

    public void testCadastroCasa(){
       	Casa teste = new Casa("Casa Teste", 308.0);
        controller.cadastraCasa(teste);
    };

    public void testListaCasa(){
        controller.getLista(); 
    };

    public void testListaNomesCasa() {
        String[] resultado = controller.getListaNomesCasa();
        System.out.println(resultado)
    };


}