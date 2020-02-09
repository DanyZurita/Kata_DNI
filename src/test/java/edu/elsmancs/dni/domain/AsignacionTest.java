package edu.elsmancs.dni.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class AsignacionTest {

    @Test
    public void crearAsignacion() {
        Asignacion dni = new Asignacion("43474645");
        assertEquals(dni.getDni(), "43474645");
        
        System.out.println("- Test getArrayLetras:");
        System.out.println(dni.getArrayLetras());
        System.out.println("- Test getDni:");
        System.out.println(dni.getDni());
        System.out.println('\n');
    }
    
}
