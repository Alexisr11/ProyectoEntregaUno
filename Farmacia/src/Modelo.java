/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author alexi
 */
public class Modelo {
    
    private String nombreMedicamento;
    private String tipoMedicamento;
    private int cantidad;
    private String distribuidor;
    private boolean sucursalPrincipal;
    private boolean sucursalSecundaria;

    public Modelo() {
    }

    public Modelo(String nombreMedicamento, String tipoMedicamento, int cantidad, String distribuidor, boolean sucursalPrincipal, boolean sucursalSecundaria) {
        this.nombreMedicamento = nombreMedicamento;
        this.tipoMedicamento = tipoMedicamento;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
        this.sucursalPrincipal = sucursalPrincipal;
        this.sucursalSecundaria = sucursalSecundaria;
    }

    public String getNombreMedicamento() {
        return nombreMedicamento;
    }

    public void setNombreMedicamento(String nombreMedicamento) {
        this.nombreMedicamento = nombreMedicamento;
    }

    public String getTipoMedicamento() {
        return tipoMedicamento;
    }

    public void setTipoMedicamento(String tipoMedicamento) {
        this.tipoMedicamento = tipoMedicamento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDistribuidor() {
        return distribuidor;
    }

    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    public boolean isSucursalPrincipal() {
        return sucursalPrincipal;
    }

    public void setSucursalPrincipal(boolean sucursalPrincipal) {
        this.sucursalPrincipal = sucursalPrincipal;
    }

    public boolean isSucursalSecundaria() {
        return sucursalSecundaria;
    }

    public void setSucursalSecundaria(boolean sucursalSecundaria) {
        this.sucursalSecundaria = sucursalSecundaria;
    }
    
    
}
