/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.Estudiante;
import modelo.RegistroEstudiantes;
import vista.*;

/**
 *
 * @author ronald
 */
public class ManejadorEstudiante extends Controlador{

     RegistroEstudiantes registro;
     GUIAdminEstudiante gUIAdminEstudiante;
     GUIEstudiante gUIEstudiante;
     PanelEstudiante panelEstudiante;

    public ManejadorEstudiante(RegistroEstudiantes registro, GUIAdminEstudiante gUIAdminEstudiante) {
        this.registro = registro;
        this.gUIAdminEstudiante = gUIAdminEstudiante;
    }

    public ManejadorEstudiante(RegistroEstudiantes registro, GUIAdminEstudiante gUIAdminEstudiante, GUIEstudiante gUIEstudiante,PanelEstudiante panelEstudiante) {
        this.registro = registro;
        this.gUIAdminEstudiante = gUIAdminEstudiante;
        this.gUIEstudiante = gUIEstudiante;
        this.panelEstudiante=panelEstudiante;
    }
    
    
        
     
     
     @Override
     
    public void actionPerformed(ActionEvent evento) {
        
       if (evento.getActionCommand().equalsIgnoreCase(PanelBotonesMantenimiento.BOTON_TYPE_AGREGAR)){
           GUIEstudiante gUIEstudiante=new GUIEstudiante();
           gUIEstudiante.init(Ventana.TYPE_VENTANA_AGREGAR, registro, gUIAdminEstudiante);
           gUIEstudiante.setVisible(true);
        }else{
           if (evento.getActionCommand().equalsIgnoreCase(PanelBotonesMantenimiento.BOTON_TYPE_ELIMINAR)){
               
           }
          else
              if(evento.getActionCommand().equalsIgnoreCase(PanelBotonesAccion.BOTON_TYPE_ACEPTAR) && gUIEstudiante.getTipo()==Ventana.TYPE_VENTANA_AGREGAR){
                  
                  if(panelEstudiante.verificar()==true){
                      System.out.println("VERIFICO");
                      if(registro.buscarEstudiante(panelEstudiante.getJtIdentificado())==false){
                          registro.agregar(panelEstudiante.getEstudiante());
                          System.out.println("agrego");
                              gUIAdminEstudiante.setDatosTabla(registro.getMatrizEstudiantes(),Estudiante.getEtiquetasAtributos());
                        }else{
                          panelEstudiante.mensaje();
                      }
                      
                    }
                }
        }
       
       if (evento.getActionCommand().equalsIgnoreCase(PanelBotonesMantenimiento.BOTON_TYPE_EDITAR)){
           GUIEstudiante gUIEstudiante=new GUIEstudiante();
           gUIEstudiante.init(Ventana.TYPE_VENTANA_MODIFICAR, registro, gUIAdminEstudiante);
           gUIEstudiante.setVisible(true);
        }else{
           if(evento.getActionCommand().equalsIgnoreCase(PanelBotonesAccion.BOTON_TYPE_ACEPTAR) && gUIEstudiante.getTipo()==Ventana.TYPE_VENTANA_MODIFICAR){
                if(panelEstudiante.verificar()==true){
                    if(registro.buscarEstudiante(panelEstudiante.getJtIdentificado())==true){
                        registro.modificar(panelEstudiante.getEstudiante());
                        System.out.println("modifico");
                        gUIAdminEstudiante.setDatosTabla(registro.getMatrizEstudiantes(),Estudiante.getEtiquetasAtributos());
                    }
                }
           }
       }
       
        if (evento.getActionCommand().equalsIgnoreCase(PanelBotonesMantenimiento.BOTON_TYPE_ELIMINAR)){
           GUIEstudiante gUIEstudiante=new GUIEstudiante();
           gUIEstudiante.init(Ventana.TYPE_VENTANA_ELIMINAR, registro, gUIAdminEstudiante);
           gUIEstudiante.setVisible(true);
        }else{
            if(evento.getActionCommand().equalsIgnoreCase(PanelBotonesAccion.BOTON_TYPE_ACEPTAR) && gUIEstudiante.getTipo()==Ventana.TYPE_VENTANA_ELIMINAR){
                if(panelEstudiante.verificar()==true){
                     if(registro.buscarEstudiante(panelEstudiante.getJtIdentificado())==true){
                         registro.eliminarEstudiante(panelEstudiante.getJtIdentificado());
                         System.out.println("eliminado");
                         gUIAdminEstudiante.setDatosTabla(registro.getMatrizEstudiantes(),Estudiante.getEtiquetasAtributos());
                     }
                }
            }
        }
    }
    
}
