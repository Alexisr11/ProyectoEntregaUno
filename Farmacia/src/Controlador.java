
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexi
 */
public class Controlador {
    
    Vista vista;
    Modelo modelo;
    
    public Controlador(Vista vista, Modelo modelo){
        this.vista = vista;
        this.modelo = modelo;
        this.inicializar();
        
    }
    
    public void inicializar(){
        this.vista.setVisible(true);
    }
}
