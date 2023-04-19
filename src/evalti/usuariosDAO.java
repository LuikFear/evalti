/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalti;

import java.util.LinkedList;

/**
 *
 * @author LuikFear
 */
public interface usuariosDAO {
    
    public LinkedList<usuarios> listar ();
    
    public usuarios obtener(int usuario_id);
    
    public void crear(usuarios usuario);
    
     public void mod (usuarios usuario);
     
     public void delete(int usuario_id);
     
     public usuarios consultar(String correo, String contraseña);
    
    
}
