package proyectoig;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alonso Herrera
 */
public class Logica {

    public Logica() {
        personas = new personaPI[0];
        trabajos = new trabajoPI[0];
        nuevo = new trabajoPI();
    }
    private trabajoPI nuevo;
    private personaPI[] personas;
    private trabajoPI[] trabajos;

    public String validarNumeroTrabajos(int cedula) {
        int contador = 0;
        String mensaje = "";
        for (int i = 0; i < trabajos.length; i++) {
            if (trabajos[i].getCedula2() == cedula) {
                contador++;
            }
        }
        if (contador < 3) {
            mensaje = "si";
        }else{
            mensaje="no";
        }
        return mensaje;
    }

    public void eliminarPersonas(int cedula) {
        String listaPersonas = "";
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getCedula() != cedula) {
                listaPersonas += personas[i].getCedula() + ";" + personas[i].getNombre() + ";"
                        + personas[i].getApellidos() + ";" + personas[i].getCorreoE() + ";" + personas[i].getDireccion() + ";"
                        + personas[i].getTelefono() + ";" + "\n";

            }

        }
    }

    public void eliminarTrabajos(trabajoPI trabajo, int cedula2) {
        String listaTrabajos = "";
        ManejadorArchivos archivo = new ManejadorArchivos();
        String texto = archivo.leerTextoArchivo("trabajos.txt");
//        for (int i = 0; i < trabajos.length; i++) {
//            if (cedula2 != trabajos[i].getCedula2()) {
//                listaTrabajos=(trabajo.getColor() + ";" + trabajo.getMarca().trim() + ";" + trabajo.getProblema().trim()
//                        + ";" + trabajo.getCedula2() + ";" + trabajo.isEstado() + ";" + trabajo.getModelo() + ";" + trabajo.getReparado());
//            }
//        }
//        archivo.escribirTextoArchivo("trabajos.txt",listaTrabajos);
//    }
        for (int i = 0; i < personas.length; i++) {
            if (trabajos[i].getCedula2() != cedula2) {
                listaTrabajos += trabajos[i].getCedula2() + ";" + trabajos[i].getModelo() + ";" + trabajos[i].getMarca()
                        + ";" + trabajos[i].getProblema() + ";" + trabajos[i].getReparado() + ";" + trabajos[i].isEstado() + "\n";
            }

        }
        archivo.escribirTextoArchivo("trabajos.txt", listaTrabajos);
        cargarTrabajos();
    }

    public void cambiarTrabajos(int cedula2) {
        String listaTrabajos = "";
        ManejadorArchivos archivo = new ManejadorArchivos();
        String texto = archivo.leerTextoArchivo("trabajos.txt");
        for (int i = 0; i < trabajos.length; i++) {
            if (trabajos[i].getCedula2() == cedula2) {
                listaTrabajos += trabajos[i].getCedula2() + ";" + trabajos[i].getColor() + ";"
                        + trabajos[i].getMarca() + ";" + trabajos[i].getModelo() + ";" + trabajos[i].getProblema() + ";"
                        + trabajos[i].getReparado() + ";" + "\n";
            } else {
                listaTrabajos += trabajos[i].getCedula2() + ";" + trabajos[i].getColor() + ";"
                        + trabajos[i].getMarca() + ";" + trabajos[i].getModelo() + ";" + trabajos[i].getProblema() + ";"
                        + trabajos[i].getReparado() + ";" + "\n";
            }
        }
        archivo.escribirTextoArchivo("trabajos.txt", listaTrabajos);

    }
     public void actualizarCliente(personaPI p, int cedula) {
        String listaPersonas = "";
        ManejadorArchivos archivo = new ManejadorArchivos();
        cargarPersonas();
        String texto = archivo.leerTextoArchivo("personas.txt");
        for (int i = 0; i < personas.length; i++) {
            if (personas[i].getCedula() == cedula) {
                listaPersonas += p.getCedula() + ";" + p.getApellidos()+ ";"
                        +p.getCorreoE() + ";" + p.getNombre()+ ";" + p.getDireccion()+ ";"
                        + p.getTelefono()+ ";" + "\n";
            } else {
                listaPersonas += personas[i].getCedula() + ";" + personas[i].getApellidos()+ ";"
                        + personas[i].getCorreoE() + ";" + personas[i].getNombre()+ ";" + personas[i].getDireccion()+ ";"
                        + personas[i].getTelefono()+ ";" + "\n";
            }
        }
        archivo.escribirTextoArchivo("personas.txt", listaPersonas);
         cargarTrabajos();
    }
    
    

    public void cargarPersonas() {
        ManejadorArchivos archivo = new ManejadorArchivos();
        String texto = archivo.leerTextoArchivo("personas.txt");
        if (!texto.trim().equals("")) {
            String[] datos = texto.split("\n");
            personas = new personaPI[datos.length];
            for (int i = 0; i < datos.length; i++) {
                String[] aux = datos[i].split(";");
                personaPI p = new personaPI();
                p.setCedula(Integer.parseInt(aux[0]));
                p.setNombre(aux[1]);
                p.setDireccion(aux[2]);
                p.setApellidos(aux[3]);
                p.setCorreoE(aux[4]);
                p.setTelefono(Integer.parseInt(aux[5]));
                personas[i] = p;
            }
        } else {
            personas = new personaPI[0];

        }

    }

    public void cargarTrabajos() {
        ManejadorArchivos archivo = new ManejadorArchivos();
        String texto = archivo.leerTextoArchivo("trabajos.txt");
        if (!texto.trim().equals("")) {
            String[] datos = texto.split("\n");
            trabajos = new trabajoPI[datos.length];
            for (int i = 0; i < datos.length; i++) {
                String[] aux = datos[i].split(";");
                trabajoPI tra = new trabajoPI();
                tra.setModelo(aux[5]);
                tra.setEstado(Boolean.parseBoolean(aux[4]));
                tra.setColor(aux[0]);
                tra.setProblema(aux[2]);
                tra.setCedula2(Integer.parseInt(aux[3]));
                tra.setMarca(aux[1]);
                tra.setReparado(aux[6]);
                trabajos[i] = tra;
            }
        } else {
            trabajos = new trabajoPI[0];

        }
    }

    public void agregarTrabajos(trabajoPI trabajo) {
        ManejadorArchivos archivo = new ManejadorArchivos();
        String texto = archivo.leerTextoArchivo("trabajos.txt");
        archivo.escribirTextoArchivo("trabajos.txt", texto + (trabajo.getColor() + ";" + trabajo.getMarca().trim() + ";" + trabajo.getProblema().trim()
                + ";" + trabajo.getCedula2() + ";" + trabajo.isEstado() + ";" + trabajo.getModelo() + ";" + trabajo.getReparado()));

    }

    public void agregarPersona(personaPI persona) {
        ManejadorArchivos archivo = new ManejadorArchivos();
        String texto = archivo.leerTextoArchivo("personas.txt");
        archivo.escribirTextoArchivo("personas.txt", texto + (persona.getCedula() + ";" + persona.getNombre().trim()
                + ";" + persona.getDireccion().trim() + ";" + persona.getApellidos().trim() + ";" + persona.getCorreoE().trim() + ";" + persona.getTelefono()));
    }

    public trabajoPI[] getTrabajos() {
        return trabajos;
    }

    public void setTrabajos(trabajoPI[] trabajos) {
        this.trabajos = trabajos;
    }

    public personaPI[] getPersonas() {
        return personas;
    }

    @Override
    public String toString() {
        return "Logica{" + "personas=" + personas + '}';
    }

    public void setPersonas(personaPI[] personas) {
        this.personas = personas;
    }
}
