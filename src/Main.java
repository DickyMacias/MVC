
import controlador.Logica;
import modelo.Usuario;



public class Main {

    
    public static void main(String args[])
    {
        vista.Vista3 v = new  vista.Vista3();
        v.setVisible(true);
        
        new Usuario("Oscar", 34);
        new Usuario("Sofia", 28);
        new Usuario("Mayra", 30);
        new Usuario("Ceci", 25);
        new Usuario("Gaby", 27);
                
        
        Logica l = new Logica();
        
        l.enviarUsuarios(Usuario.usuarios, v);
    }
    
}
