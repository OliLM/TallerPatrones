/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tallerpatrones;

import com.mycompany.tallerpatrones.PatronDecorator.*;

/**
 *
 * @author CltControl
 */
public class TallerPatrones {

    public static void main(String[] args) {
        System.out.println("Patrones everywhere and for everyone");
        System.out.println("[Patron Decorator]");
        Reporte ReporteColores = new PersonalizacionColores(new ReporteBase());
        
        Reporte ReporteColoresyFuentes = new PersonalizacionColores(new PersonalizacionFuente(new ReporteBase()));
        
        ReporteColores.generarInforme();
        ReporteColoresyFuentes.generarInforme();
        
    }
}
