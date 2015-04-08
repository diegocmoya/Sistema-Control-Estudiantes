/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author home
 */
public class RegistroCurso {
    
    ArrayList<Curso> listado;
    
    public RegistroCurso(){
        listado=new ArrayList<Curso>();
    }
    
    public void AgregarCurso(Curso curso){
        listado.add(curso);
    }
    
     public int buscar(String siglas){
        
        for(int posicion=0;posicion<=listado.size();posicion++){
            if(listado.get(posicion).getSiglas().equals(siglas))
                return posicion;
        }
        
        return -1;
    }
     
     public boolean buscarCurso(String siglas){
         boolean encontro=false;
         for(int posicion=0; posicion<=listado.size(); posicion++)
             if(listado!=null){
                 if(listado.get(posicion).getSiglas().equals(siglas))
                     encontro=true;
             }
         return encontro;
     }
     
     public void eliminarCurso(int posicion) {
        listado.remove(posicion);
    }

    public void eliminarCurso(Curso curso) {
        listado.remove(curso);
    }

    public Curso modificarCurso(Curso curso){
        int posicion=buscar(curso.getSiglas());
        if (posicion!=-1)
            return listado.get(posicion);
        else{
            return null;
        }
    }
     
    public boolean modificar(Curso curso) {
        int posicion = buscar(curso.getSiglas());
        if (posicion != -1) {
            listado.set(posicion, curso);
            return true;
        }
        else
            return false;
    }
    
    public ArrayList getCurso(){
        return listado;
    }

    public String[][] getMatrizCurso(){

        String matriz[][]=new String [listado.size()][Curso.getConteoAtributos()];

        for (int fila=0;fila<matriz.length;fila++)
            for(int columna=0;columna<matriz[fila].length;columna++)
                matriz[fila][columna]=listado.get(fila).getAtributo(columna);
        return matriz;
    }
}
