
package modelo;


public class Usuario {

    public String nombre;
    public int edad;
    
    public static Usuario[] usuarios = new Usuario[10];
    public static int count = 0;
    
    public Usuario(String nombre, int e)
    {
        if(count < 10)
        {
            this.nombre = nombre;
            this.edad = e;
            usuarios[count] = this;
            
            count++;
        }
            
    }
    
    public static Usuario[] getUsuarios()
    {
        Usuario tmp [] = new Usuario[count];
        
        for (int i = 0; i < count; i++) 
            tmp[i] = usuarios[i];
            
        
        return tmp;
    }
    
}
