
package com.mycompany.tallerpatrones.PatronDecorator;


public class PersonalizacionFuente extends ReportePersonalizacion {
    
    public PersonalizacionFuente(Reporte reporte) {
        super(reporte);
    }
    @Override
    public void generarInforme(){
        super.generarInforme();
        System.out.println("Generando Informe con distintos tipos de fuente");
    }
}
