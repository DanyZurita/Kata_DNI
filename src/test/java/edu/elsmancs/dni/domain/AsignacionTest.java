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
    public void DNI1() {
        Asignacion asig = new Asignacion("43474645");
        Dni dni = new Dni();
        char letra = dni.calcularLetra(asig.getDni());
        String dniCompleto = dni.añadirLetra(letra);
        assertEquals(asig.getDNI(), "43474645E");
        
        System.out.println("- Test DNI1 getDni:");
        System.out.println(asig.getDni());
        System.out.println("- Test DNI1 getDNI:");
        System.out.println(asig.getDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI2() {
        Asignacion dni = new Asignacion("43474644");
        char letra = dni.calcularLetra(dni.getDni());
        String dniCompleto = dni.añadirLetra(letra);
        dni.setDNI(dniCompleto);
        assertEquals(dni.getDNI(), "43474644K");
        
        System.out.println("- Test DNI2 getDni:");
        System.out.println(dni.getDni());
        System.out.println("- Test DNI2 getDNI:");
        System.out.println(dni.getDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI3() {
        Asignacion dni = new Asignacion("85093596");
        char letra = dni.calcularLetra(dni.getDni());
        String dniCompleto = dni.añadirLetra(letra);
        dni.setDNI(dniCompleto);
        assertEquals(dni.getDNI(), "85093596J");
        
        System.out.println("- Test DNI3 getDni:");
        System.out.println(dni.getDni());
        System.out.println("- Test DNI3 getDNI:");
        System.out.println(dni.getDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI4() {
        Asignacion dni = new Asignacion("04632735");
        char letra = dni.calcularLetra(dni.getDni());
        String dniCompleto = dni.añadirLetra(letra);
        dni.setDNI(dniCompleto);
        assertEquals(dni.getDNI(), "04632735Y");
        
        System.out.println("- Test DNI4 getDni:");
        System.out.println(dni.getDni());
        System.out.println("- Test DNI4 getDNI:");
        System.out.println(dni.getDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI5() {
        Asignacion dni = new Asignacion("81198036");
        char letra = dni.calcularLetra(dni.getDni());
        String dniCompleto = dni.añadirLetra(letra);
        dni.setDNI(dniCompleto);
        assertEquals(dni.getDNI(), "81198036D");
        
        System.out.println("- Test DNI5 getDni:");
        System.out.println(dni.getDni());
        System.out.println("- Test DNI5 getDNI:");
        System.out.println(dni.getDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI6() {
        Asignacion dni = new Asignacion("12054248");
        char letra = dni.calcularLetra(dni.getDni());
        String dniCompleto = dni.añadirLetra(letra);
        dni.setDNI(dniCompleto);
        assertEquals(dni.getDNI(), "12054248V");
        
        System.out.println("- Test DNI6 getDni:");
        System.out.println(dni.getDni());
        System.out.println("- Test DNI6 getDNI:");
        System.out.println(dni.getDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI7() {
        Asignacion dni = new Asignacion("90567867");
        char letra = dni.calcularLetra(dni.getDni());
        String dniCompleto = dni.añadirLetra(letra);
        dni.setDNI(dniCompleto);
        assertEquals(dni.getDNI(), "90567867P");
        
        System.out.println("- Test DNI7 getDni:");
        System.out.println(dni.getDni());
        System.out.println("- Test DNI7 getDNI:");
        System.out.println(dni.getDNI());
        System.out.println('\n');
    }
}
