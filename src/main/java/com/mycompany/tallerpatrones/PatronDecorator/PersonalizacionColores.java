
package com.mycompany.tallerpatrones.PatronDecorator;


public class PersonalizacionColores extends ReportePersonalizacion {
    
    public PersonalizacionColores(Reporte reporte) {
        super(reporte);
    }
    @Override
    public void generarInforme(){
        super.generarInforme();
        System.out.println("Generando Informe con colores");
    }
}
