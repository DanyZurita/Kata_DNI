package edu.elsmancs.dni.domain;

import org.junit.Test;

public class AsignacionTest {

    @Test
    public void crearAsignacion() {
        Asignacion array = new Asignacion(43474645);
        System.out.println("- Test getArrayLetras:");
        System.out.println(array.getArrayLetras());
        System.out.println("- Test getDNI:");
        System.out.println(array.getDNI());
    }
}
