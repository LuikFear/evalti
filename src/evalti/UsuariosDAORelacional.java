
package evalti;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;


public class UsuariosDAORelacional implements usuariosDAO{

    
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    conexion acceso = new conexion();
   
    @Override
    public LinkedList<usuarios> listar() {
        
                
           String sql = "select * from usuarios";
           
           LinkedList<usuarios> listar = new LinkedList<>();
            
        try {

            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                
                listar.add(new usuarios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5)));
                       
            }
            return listar;
        } catch (Exception e) {
        }

        return null;
    
    
    }

    @Override
    public usuarios obtener(int usuario_id) {
        String sql = "select * from usuarios where usuario:id = ?";
        
        try {

            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,usuario_id);
            rs = ps.executeQuery();

            if (rs.next()) {
                usuarios user = new usuarios(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
                        rs.getInt(6), rs.getString(7), rs.getString(8), rs.getInt(9), rs.getString(10));
                        
                        return user;
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron Resultados :C");
            }
               
            
            return null;
        } catch (Exception e) {
            System.out.println(e);
        }

        return null;
    
        
    }

    @Override
    public void crear(usuarios usuario) {
       String sql = "insert into usuarios(nombre,apellido,correo_electronico,telefono,direccion,Fecha_nacimiento,rol_id,contraseña) values (?,?,?,?,?,?,?,2);";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1,usuario.getNombre());
             ps.setString(2,usuario.getApellido());
             ps.setString(3,usuario.getCorreo());
               ps.setInt(4,usuario.getTelefono());
             ps.setString(5,usuario.getDireccion());
            ps.setInt(6,usuario.getRol_id());
              ps.setString(7,usuario.getContra());
              ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
     
    }

    @Override
    public void mod(usuarios usuario) {
           String sql = "update usuarios set nombre=?,apellido=?,rol=?,correo=?,telefono=?,direccion=?,Fecha_nacimiento=?,rol_id=?,contra=? where usuario_id=?;";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1,usuario.getNombre());
             ps.setString(2,usuario.getApellido());
             ps.setString(3,usuario.getRol());
              ps.setString(4,usuario.getCorreo());
               ps.setInt(5,usuario.getTelefono());
             ps.setString(6,usuario.getDireccion());
              ps.setString(7,usuario.getFecha_nacimiento());
              ps.setInt(8,usuario.getRol_id());
              ps.setString(9,usuario.getContra());
              ps.setInt(10,usuario.getUsuario_id());
              ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
                
    }

    @Override
    public void delete(int usuario_id) {
       String sql = "delete from usuarios where codigo=?";
        try {
            con = acceso.Conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,usuario_id);
            ps.executeUpdate();
        } catch (Exception e) {
        }
        
        
    }
    @Override
     public usuarios consultar(String correo, String contraseña){
         
         String sql = "select * from usuarios where correo_electronico=? and contraseña = ? ";
         
         try {
              con = acceso.Conectar();
            ps = con.prepareStatement(sql);
              ps.setString(1,correo);
              ps.setString(2,contraseña);
              
              rs= ps.executeQuery();
              
              
              if (rs.next()) {
                  usuarios usuario = new usuarios(rs.getString(2), rs.getString(3), rs.getInt (8));
                  return usuario;
             }
              
              
         } catch (Exception e) {
         }
         
         return null;
         
         
         
     }
             
             
}
