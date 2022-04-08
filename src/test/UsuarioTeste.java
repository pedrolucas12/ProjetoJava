package test;

import static org.junit.jupiter.api.Test;
import control.ControleUsuario;
import model.Usuario;

public class UsuarioTeste {
    ControleUsuario controller = new ControleUsuario();

    @Test
    public void testCadastroUsuario(){
       	Usuario teste = new Usuario("teste", "teste", "teste", "teste", "teste");
        controller.cadastraUsuario(teste);
    };

    @Test
    public void testListaUsuario(){
        controller.getListaNomes(); 
    };

    @Test
    public void testListaNomes() {
        String[] resultado = controller.getListaNomes();
        System.out.println(resultado);
    };


}