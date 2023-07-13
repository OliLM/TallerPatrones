
package com.mycompany.tallerpatrones.PatronDecorator;


public abstract class ReportePersonalizacion implements Reporte {
    protected Reporte reporte;
    
    public ReportePersonalizacion(Reporte reporte){
        this.reporte= reporte;
    }
    
    @Override
    public void generarInforme() {
        this.reporte.generarInforme();
    }
    
}
