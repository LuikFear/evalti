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
    private String nombre ;
    private String apellido;
    private String rol;
    private String correo;
    private int telefono;
    private int usuario_id;
    private String direccion;
    private String Fecha_nacimiento;
    private int rol_id;
    private String contra;

    public usuarios(String nombre, String apellido, String rol, String correo, int telefono, int usuario_id, String direccion, String Fecha_nacimiento, int rol_id, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.correo = correo;
        this.telefono = telefono;
        this.usuario_id = usuario_id;
        this.direccion = direccion;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.rol_id = rol_id;
        this.contra = contra;
    }

    public usuarios(String nombre, String apellido, String rol, String correo, int telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol = rol;
        this.correo = correo;
        this.telefono = telefono;
    }

    public usuarios(String nombre, String apellido, String correo, int telefono, String direccion, String Fecha_nacimiento, String contra) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.contra = contra;
    }

    public usuarios(String nombre, String apellido, int rol_id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.rol_id = rol_id;
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

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public String getContra() {
        return contra;
    }

    public void setContra(String contra) {
        this.contra = contra;
    }
   
    
    
    
}

