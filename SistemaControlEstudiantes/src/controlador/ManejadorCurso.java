/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import modelo.RegistroCurso;
import vista.GUIAdminCurso;
import vista.GUICurso;
import vista.PanelCurso;

/**
 *
 * @author home
 */
public class ManejadorCurso extends Controlador {

    RegistroCurso registro;
     GUIAdminCurso gUIAdminCurso;
     GUICurso gUICurso;
     PanelCurso panelCurso;

    public ManejadorCurso(RegistroCurso registro, GUIAdminCurso gUIAdminCurso) {
        this.registro = registro;
        this.gUIAdminCurso = gUIAdminCurso;
    }

    public ManejadorCurso(RegistroCurso registro, GUIAdminCurso gUIAdminCurso, GUICurso gUICurso,PanelCurso panelCurso) {
        this.registro = registro;
        this.gUIAdminCurso = gUIAdminCurso;
        this.gUICurso = gUICurso;
        this.panelCurso=panelCurso;
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
    
    }
    
    
    
}
