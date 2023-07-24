/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import modelo.OperadorDeMoneda;
import modelo.OperadorTemperatura;
import vista.ConversorMoneda;

/**
 *
 * @author carlo
 */
public class Controlador implements ActionListener {
//    vistas

    private ConversorMoneda vista;
//    modelos
    private OperadorDeMoneda operadorMoneda;
    private OperadorTemperatura operadorTemperatura;

    public Controlador(ConversorMoneda v, OperadorDeMoneda o) {
        this.vista = v;
        this.operadorMoneda = o;
        actionListener(this);
    }

    private void actionListener(ActionListener control) {
        vista.BotonCalcular.addActionListener(control);
        vista.ComboBoxConversiones.addActionListener(control);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String opcion = vista.ComboBoxConversiones.getSelectedItem().toString();

        if (e.getActionCommand().equals("calcular")) {
            if (opcion.equals("COP a USD")) {
                Double cantidad = Double.valueOf(vista.TxtCantidad.getText());
                operadorMoneda.setCantidad(cantidad);
                vista.TxtResultado.setText(String.valueOf(operadorMoneda.COPToUSD()));
            } else if (opcion == "COP a EURO") {
                Double cantidad = Double.valueOf(vista.TxtCantidad.getText());
                operadorMoneda.setCantidad(cantidad);
                vista.TxtResultado.setText(String.valueOf(operadorMoneda.COPToEURO()));
            } else if (opcion == "COP a LIBRA ESTERLINA") {
                Double cantidad = Double.valueOf(vista.TxtCantidad.getText());
                operadorMoneda.setCantidad(cantidad);
                vista.TxtResultado.setText(String.valueOf(operadorMoneda.COPToLIBRAESTERLINA()));
            } else if (opcion == "USD a COP") {
                Double cantidad = Double.valueOf(vista.TxtCantidad.getText());
                operadorMoneda.setCantidad(cantidad);
                vista.TxtResultado.setText(String.valueOf(operadorMoneda.DolarToCOP()));
            } else if (opcion == "EURO a COP") {
                Double cantidad = Double.valueOf(vista.TxtCantidad.getText());
                operadorMoneda.setCantidad(cantidad);
                vista.TxtResultado.setText(String.valueOf(operadorMoneda.EuroToCOP()));
            } else if (opcion == "LIBRA ESTERLINA a COP") {
                Double cantidad = Double.valueOf(vista.TxtCantidad.getText());
                operadorMoneda.setCantidad(cantidad);
                vista.TxtResultado.setText(String.valueOf(operadorMoneda.LibraEsterlinaToCOP()));
            } else {
                JOptionPane.showMessageDialog(vista, "estamos en construccion, no se aguite");
            }
        }
    }

    public static void main(String[] args) {
        ConversorMoneda n = new ConversorMoneda();
        OperadorDeMoneda o = new OperadorDeMoneda();
        new Controlador(n,o);
    }
}
