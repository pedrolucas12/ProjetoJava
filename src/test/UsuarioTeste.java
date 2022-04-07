package test;

import org.junit.jupiter.api.Test;
import static;

import control.ControlApartamento;
import junit.framework.Test;

public class UsuarioTeste {
    ControleUsuario controller = new ControleUsuario();

    public void testCadastroUsuario(){
       	Usuario teste = new Usuario("teste", "teste", "teste", "teste", "teste");
        controller.cadastraUsuario(teste);
    };

    public void testListaUsuario(){
        controller.getListarUsuarios(); 
    };

    public void testListaNomes() {
        String[] resultado = controller.getListaNomes();
        System.out.println(resultado)
    };


}