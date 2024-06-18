
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
        
        
        vista.getBtnBorrar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearForm();
            }
        });

        vista.getBtnConfirmar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                confirmarPedido();
            }
        });
        
    }
    
    private void clearForm() {
        this.vista.getTxtNombreMedicamento().setText("");
        this.vista.getCmbTipoMedicamento().setSelectedIndex(0);
        this.vista.getTxtCantidad().setText("");
        this.vista.getRdbCofarma().setSelected(false);
        this.vista.getRdbEmpsephar().setSelected(false);
        this.vista.getRdbCemefar().setSelected(false);
        this.vista.getChkPrincipal().setSelected(false);
        this.vista.getChkSecundaria().setSelected(false);
    }
    
    private void confirmarPedido() {
        String nombreMedicamento = this.vista.getTxtNombreMedicamento().getText();
        String tipoMedicamento = (String) this.vista.getCmbTipoMedicamento().getSelectedItem();
        String cantidadStr = this.vista.getTxtCantidad().getText();
        int cantidad;
        String distribuidor = null;
        if (this.vista.getRdbCofarma().isSelected()) {
            distribuidor = "Cofarma";
        } else if (this.vista.getRdbEmpsephar().isSelected()) {
            distribuidor = "Empsephar";
        } else if (this.vista.getRdbCemefar().isSelected()) {
            distribuidor = "Cemefar";
        }
        boolean sucursalPrincipal = this.vista.getChkPrincipal().isSelected();
        boolean sucursalSecundaria = this.vista.getChkSecundaria().isSelected();

        // Validaciones
        if (nombreMedicamento.isEmpty() || !nombreMedicamento.matches("[a-zA-Z0-9 ]+")) {
            JOptionPane.showMessageDialog(this.vista, "Nombre de medicamento inválido.");
            return;
        }
        if (tipoMedicamento == null) {
            JOptionPane.showMessageDialog(this.vista, "Debe seleccionar un tipo de medicamento.");
            return;
        }
        try {
            cantidad = Integer.parseInt(cantidadStr);
            if (cantidad <= 0) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this.vista, "Cantidad inválida.");
            return;
        }
        if (distribuidor == null) {
            JOptionPane.showMessageDialog(this.vista, "Debe seleccionar un distribuidor.");
            return;
        }
        if (!sucursalPrincipal && !sucursalSecundaria) {
            JOptionPane.showMessageDialog(this.vista, "Debe seleccionar al menos una sucursal.");
            return;
        }

    }
}
