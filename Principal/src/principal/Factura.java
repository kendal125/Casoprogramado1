/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author lopez
 */
/*Aqui se declaran los atributos los datos del cliente
para la facturacion y que todo funcione bien 
*/
public class Factura {
    private String nombreCliente;
    private String cedCliente;
    private String codFactura;
    private double montFactura;
    private int mes;
    private String prodElectricos;
    private String prodAutomotrices;
    private String prodConstrucion;

    //constructor

    public Factura() {
    }

    public Factura(String nombreCliente, String cedCliente, String codFactura, double montFactura, int mes, String prodElectricos, String prodAutomotrices, String prodConstrucion) {
        this.nombreCliente = nombreCliente;
        this.cedCliente = cedCliente;
        this.codFactura = codFactura;
        this.montFactura = montFactura;
        this.mes = mes;
        this.prodElectricos = prodElectricos;
        this.prodAutomotrices = prodAutomotrices;
        this.prodConstrucion = prodConstrucion;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedCliente() {
        return cedCliente;
    }

    public void setCedCliente(String cedCliente) {
        this.cedCliente = cedCliente;
    }

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public double getMontFactura() {
        return montFactura;
    }

    public void setMontFactura(double montFactura) {
        this.montFactura = montFactura;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public String getProdElectricos() {
        return prodElectricos;
    }

    public void setProdElectricos(String prodElectricos) {
        this.prodElectricos = prodElectricos;
    }

    public String getProdAutomotrices() {
        return prodAutomotrices;
    }

    public void setProdAutomotrices(String prodAutomotrices) {
        this.prodAutomotrices = prodAutomotrices;
    }

    public String getProdConstrucion() {
        return prodConstrucion;
    }

    public void setProdConstrucion(String prodConstrucion) {
        this.prodConstrucion = prodConstrucion;
    }

    @Override
    public String toString() {
        return "Factura{" + "nombreCliente=" + nombreCliente + ", cedCliente=" + cedCliente + ", codFactura=" + codFactura + ", montFactura=" + montFactura + ", mes=" + mes + ", prodElectricos=" + prodElectricos + ", prodAutomotrices=" + prodAutomotrices + ", prodConstrucion=" + prodConstrucion + '}';
    }
    
}
