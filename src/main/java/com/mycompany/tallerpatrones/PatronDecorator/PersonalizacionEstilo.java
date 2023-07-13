
package com.mycompany.tallerpatrones.PatronDecorator;


public class PersonalizacionEstilo extends ReportePersonalizacion {
    
    public PersonalizacionEstilo(Reporte reporte) {
        super(reporte);
    }
    @Override
    public void generarInforme(){
        super.generarInforme();
        System.out.println("Generando Informe con estilos");
    }
    
}
