package test;

import org.junit.jupiter.api.Test;
import static;

import control.ControlApartamento;
import junit.framework.Test;

public class ApartamentoTeste {
    ControlApartamento controller = new ControlApartamento();

    public void testCadastroApt(){
       	Apartamento teste = new Apartamento("Apartamento Teste", 300.0);
        controller.cadastraApartamento(teste);
    };

    public void testLista(){
        controller.getLista(); 
    };

    public void testListaNomesApt() {
        String[] resultado = controller.getListaNomesApt();
        System.out.println(resultado)
    };


}


