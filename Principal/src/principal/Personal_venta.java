/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author lopez
 */
/*aqui van los atributos de los agente
de venta
*/
public class Personal_venta {
    private String nombreA;
    private String cedA;
    private String sucursalA;
    private String carro;
    public static String variableStatic="el default";
    private String codigoA;
    
    //constructor

    public Personal_venta() {
       nombreA="juanito chacon";
       codigoA="A14422";
    
    }

    public Personal_venta(String nombreA, String cedA, String sucursalA, String carro, String codigoA) {
        this.nombreA = nombreA;
        this.cedA = cedA;
        this.sucursalA = sucursalA;
        this.carro = carro;
        this.codigoA = codigoA;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public String getCedA() {
        return cedA;
    }

    public void setCedA(String cedA) {
        this.cedA = cedA;
    }

    public String getSucursalA() {
        return sucursalA;
    }

    public void setSucursalA(String sucursalA) {
        this.sucursalA = sucursalA;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }

    public static String getVariableStatic() {
        return variableStatic;
    }

    public static void setVariableStatic(String variableStatic) {
        Personal_venta.variableStatic = variableStatic;
    }

    public String getCodigoA() {
        return codigoA;
    }

    public void setCodigoA(String codigoA) {
        this.codigoA = codigoA;
    }

    @Override
    public String toString() {
        return "Personal_venta{" + "nombreA=" + nombreA + ", cedA=" + cedA + ", sucursalA=" + sucursalA + ", carro=" + carro + ", codigoA=" + codigoA + '}';
    }
    

   
    

    
    }
    
    

