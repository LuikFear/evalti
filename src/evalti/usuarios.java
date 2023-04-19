/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evalti;

/**
 *
 * @author LuikFear
 */
public class usuarios {
  
    private int usuario_id;
      private String nombre ;
    private String apellido;
    private int telefono;
   private String direccion;
       private String correo;
    private String Fecha_nacimiento;
   private int rol_id;
   private int estado;
    private String contra;
//constructor general
    public usuarios(int usuario_id, String nombre, String apellido, int telefono, String direccion, String correo, String Fecha_nacimiento, int rol_id, int estado, String contra) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.rol_id = rol_id;
        this.estado = estado;
        this.contra = contra;
    }
//contructor para metodo enviar
    public usuarios(String nombre, String apellido, int telefono, String direccion, String correo, String Fecha_nacimiento, int rol_id, int estado, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.rol_id = rol_id;
        this.estado = estado;
        this.contra = contra;
    }
//contructor para listar
    public usuarios(int usuario_id,String nombre, String apellido,int rol_id, String correo, int telefono ) {
        this.usuario_id = usuario_id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol_id = rol_id;
        this.correo = correo;
        this.telefono = telefono;
        
    }

    
    
    
    
    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public int getRol_id() {
        return rol_id;
    }

    public void setRol_id(int rol_id) {
        this.rol_id = rol_id;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }

    
    
    
    
    
    
    
    
    
    
    
}