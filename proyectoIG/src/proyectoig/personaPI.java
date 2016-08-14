package proyectoig;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author FamiliaHF
 */
public class personaPI {
    int cedula;
    String nombre;
    String apellidos;
    int telefono;
    String direccion;
    String correoE;
   

     public personaPI() {
    }
    

    public personaPI(int cedula, String nombre, String apellidos, int telefono, String direccion, String correoE, String marca, int modelo, String color, String problema) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correoE = correoE;  
    }

    
     public void limpiarCampos(){
    
     }
    
    public int getCedula2() {
        return cedula2;
    }

    public void setCedula2(int cedula2) {
        this.cedula2 = cedula2;
    }
    boolean estadoGarantia = false;
    int cedula2;

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
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

    public String getCorreoE() {
        return correoE;
    }

    public void setCorreoE(String correoE) {
        this.correoE = correoE;
    }

    

    @Override
    public String toString() {
        return "Datos del cliente:" + "\ncedula=" + cedula +
                "\n nombre=" + nombre + "\n apellidos=" + apellidos
               + "\n telefono=" + telefono + "\n direccion=" + direccion + "\n correoE=" + correoE 
               ;
    }

}
