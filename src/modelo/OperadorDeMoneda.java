package modelo;

import java.text.DecimalFormat;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author carlo
 */
public class OperadorDeMoneda {

    private Double cantidad;
    
    private Double resultado;

    public OperadorDeMoneda() {
    }

    public OperadorDeMoneda(Double cantidad) {
        this.cantidad = cantidad;
    }
    

    public Double getCantidad() {
        return cantidad;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    

//    
    public String DolarToCOP() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        resultado = cantidad * 3900;
        return decimalFormat.format(resultado);
    }

    public String EuroToCOP() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        resultado = cantidad * 4400;
        return decimalFormat.format(resultado);
    }

    public String LibraEsterlinaToCOP() {
        DecimalFormat decimalFormat = new DecimalFormat("#,###");
        resultado = cantidad * 5100;
        return decimalFormat.format(resultado);
    }

//    
    public Double COPToUSD() {
        resultado = cantidad / 3900;
        return resultado;
    }

    public Double COPToEURO() {
        resultado = cantidad / 4400;
        return resultado;
    }

    public Double COPToLIBRAESTERLINA() {
        resultado = cantidad / 5100;
        return resultado;
    }

}
