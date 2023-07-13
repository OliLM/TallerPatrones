
package com.mycompany.tallerpatrones.PatronDecorator;


public class ReporteBase implements Reporte {

    
    @Override
    public void generarInforme() {
        System.out.println("Generando un Reporte completo");
    }
    
}
