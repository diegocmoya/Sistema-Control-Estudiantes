/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author home
 */
public class Curso {
    
    private String siglas;
    private String nombre;
    private int creditos;
    private static String [] atributosCurso={"Siglas", "Nombre", "Creditos"};

    public Curso(String text, String text0, int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    public static String[] getEtiquetasAtributos() {
        return atributosCurso;
    }

    public String getAtributo(int numeroAtributo) {
        switch (numeroAtributo) {
            case 0:
                System.out.println("enter1");
                return siglas;
            case 1:
                System.out.println("entre2");
                return nombre;
            case 2:
                System.out.println("ente3");
                return Integer.toString(creditos);
            default:
                return null;
        }
    }
    
     public static int getConteoAtributos(){
       return  atributosCurso.length;
    }
    
    
    
}
