package edu.elsmancs.dni.domain;

import org.junit.Test;

public class AsignacionTest {

    @Test
    public void crearAsignacion() {
        Asignacion tabla = new Asignacion();
        System.out.println("- Test crearTabla:");
        System.out.println(tabla.toString());
    }
}
