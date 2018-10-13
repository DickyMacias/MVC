package controlador;

import modelo.Usuario;


public class Logica {

    
    public void enviarUsuarios(Usuario[] usuarios, vista.VistaGeneral v)
    {
        if(usuarios.length > 0)
            v.mostrarUsuarios(usuarios);
    }
    
}
