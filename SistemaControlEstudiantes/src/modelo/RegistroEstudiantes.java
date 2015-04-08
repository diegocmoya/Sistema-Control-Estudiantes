/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ronald
 */
public class RegistroEstudiantes {
    
    ArrayList<Estudiante> listado;

    public RegistroEstudiantes() {
        listado=new ArrayList<Estudiante>();
    }
    
    public void agregar(Estudiante estudiante){
        listado.add(estudiante);
    }
    
    public int buscar(String identificador){
        
        for(int indice=0;indice<=listado.size();indice++){
            if(listado.get(indice).getIdentificador().equals(identificador))
                return indice;
        }
        
        return -1;
    }
    
    public boolean buscarEstudiante(String identificador){
        boolean encontro=false;
        for(int indice=0;indice<listado.size();indice++){
            if(listado!=null){
                 if(listado.get(indice).getIdentificador().equals(identificador)){
                    encontro=true;
                }
            }
           
        }
        return encontro;
    }
    
    
    public void eliminarEstudiante(int posicion) {
        listado.remove(posicion);
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        listado.remove(estudiante);
    }

    public boolean eliminarEstudiante(String identificador) {
        int posicion = buscar(identificador);
        if (posicion != -1) {
            eliminarEstudiante(posicion);
            return true;
        } else {
            return false;
        }
    }

    public boolean modificar(Estudiante estudiante) {
        int posicion = buscar(estudiante.getIdentificador());
        if (posicion != -1) {
            listado.set(posicion, estudiante);
            return true;
        }
        else
            return false;
    }
    
    public Estudiante getEstudiante(String identificador){
        int posicion = buscar(identificador);
        if (posicion != -1) {
            return listado.get(posicion);
        }
        else
            return null;
    }

    public ArrayList getEstudiantes(){
        return listado;
    }

    public String[][] getMatrizEstudiantes(){

        String matriz[][]=new String [listado.size()][Estudiante.getConteoAtributos()];

        for (int fila=0;fila<matriz.length;fila++)
            for(int columna=0;columna<matriz[fila].length;columna++)
                matriz[fila][columna]=listado.get(fila).getAtributo(columna);
        return matriz;
    }
    
   
    
    
    
}
