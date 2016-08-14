/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoig;

/**
 *
 * @author Alonso
 */
public class trabajoPI {
     String marca;
     String  modelo;
    String color;
    String problema;
    boolean estado;
    int cedula2;
    String reparado;
    public trabajoPI() {
    }

    public trabajoPI(String marca,  String  modelo, String color, String problema, boolean estado, int cedula2, String reparado) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.problema = problema;
        this.estado = estado;
        this.cedula2 = cedula2;
        this.reparado = reparado;
        
    }

    public String getReparado() {
        return reparado;
    }

    public void setReparado(String reparado) {
        this.reparado = reparado;
    }

    public int getCedula2() {
        return cedula2;
    }

    public void setCedula2(int cedula2) {
        this.cedula2 = cedula2;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public  String  getModelo() {
        return modelo;
    }

    public void setModelo( String  modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "trabajoPI{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", problema=" + problema + ", estado=" + estado + ", cedula2=" + cedula2 + ", reparado= "+reparado+ '}' ;
    }
    
    
}
