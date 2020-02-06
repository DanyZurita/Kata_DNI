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
    
    @Test
    public void getDNI() {
        Asignacion dni = new Asignacion("43474645");
        char letra = dni.calcularLetra(dni.getDni());
        String dniCompleto = dni.añadirLetra(letra);
        dni.setDNI(dniCompleto);
        assertEquals(dni.getDNI(), "43474645E");
        
        System.out.println("- Test getDni:");
        System.out.println(dni.getDni());
        System.out.println("- Test getDNI:");
        System.out.println(dni.getDNI());
        System.out.println('\n');
    }
}
