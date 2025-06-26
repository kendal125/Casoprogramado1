/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;



/**
 *
 * @author lopez
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se pregunta nombre del personal
        Personal_venta personal_venta=new Personal_venta();
        personal_venta.setNombreA(JOptionPane.showInputDialog("digite su nombre de agente"));
        personal_venta.setCodigoA(JOptionPane.showInputDialog("digite el codigo de agente"));
        personal_venta.setCedA(JOptionPane.showInputDialog("digite su cedula"));
        personal_venta.setSucursalA(JOptionPane.showInputDialog("digite la sucursal donde trabaja"));
        //personal_venta.setCarro(JOptionPane.showInputDialog("tiene carro si o no"));
        
        JOptionPane.showMessageDialog(null, personal_venta.toString());
        
        //se preguntan los datos del cliente y sus productos
        Factura factura = new Factura();
        factura.setCedCliente(JOptionPane.showInputDialog("cedula del cliente"));
        factura.setNombreCliente(JOptionPane.showInputDialog("nombre del cliente"));
        factura.setProdElectricos(JOptionPane.showInputDialog("lleva productos electricos"));
        factura.setProdAutomotrices(JOptionPane.showInputDialog("lleva productos de automotrices"));
        factura.setProdConstrucion(JOptionPane.showInputDialog("lleva productos de construcion"));
        JOptionPane.showInputDialog(null, "que mes etamos 1=abril, 2=mayo, 3=junio");
        int mes = 3;
        switch (mes) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            default:
                throw new AssertionError();
        }
        
        
        JOptionPane.showMessageDialog(null,"mes"+mes+ factura.toString());
        
        
        
        
        
    }
    
        
        
}
