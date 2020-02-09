package edu.elsmancs.dni.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class DniTest {
    
    @Test
    public void test() {
            String initialDNI = "";
            String finalDNI = "";
            Dni dni = new Dni(initialDNI);
            char letra = dni.calcularLetra(dni.getInitialDNI());
            dni.añadirLetra(letra);
            assertEquals(dni.getFinalDNI(), finalDNI);

            System.out.println("- Test getInitialDni:");
            System.out.println(dni.getInitialDNI());
            System.out.println("- Test getFinalDni:");
            System.out.println(dni.getFinalDNI());
            System.out.println('\n');
        }
    
    @Test
    public void DNI1() {
        Dni dni = new Dni("43474645");
        char letra = dni.calcularLetra(dni.getInitialDNI());
        dni.añadirLetra(letra);
        assertEquals(dni.getFinalDNI(), "43474645E");

        System.out.println("- Test getInitialDni:");
        System.out.println(dni.getInitialDNI());
        System.out.println("- Test getFinalDni:");
        System.out.println(dni.getFinalDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI2() {
        Dni dni = new Dni("4347464544");
        char letra = dni.calcularLetra(dni.getInitialDNI());
        dni.añadirLetra(letra);
        assertEquals(dni.getFinalDNI(), "43474644K");

        System.out.println("- Test getInitialDni:");
        System.out.println(dni.getInitialDNI());
        System.out.println("- Test getFinalDni:");
        System.out.println(dni.getFinalDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI3() {
        Dni dni = new Dni("85093596");
        char letra = dni.calcularLetra(dni.getInitialDNI());
        dni.añadirLetra(letra);
        assertEquals(dni.getFinalDNI(), "85093596J");

        System.out.println("- Test getInitialDni:");
        System.out.println(dni.getInitialDNI());
        System.out.println("- Test getFinalDni:");
        System.out.println(dni.getFinalDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI4() {
        Dni dni = new Dni("04632735");
        char letra = dni.calcularLetra(dni.getInitialDNI());
        dni.añadirLetra(letra);
        assertEquals(dni.getFinalDNI(), "04632735Y");

        System.out.println("- Test getInitialDni:");
        System.out.println(dni.getInitialDNI());
        System.out.println("- Test getFinalDni:");
        System.out.println(dni.getFinalDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI5() {
        Dni dni = new Dni("81198036");
        char letra = dni.calcularLetra(dni.getInitialDNI());
        dni.añadirLetra(letra);
        assertEquals(dni.getFinalDNI(), "81198036D");

        System.out.println("- Test getInitialDni:");
        System.out.println(dni.getInitialDNI());
        System.out.println("- Test getFinalDni:");
        System.out.println(dni.getFinalDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI6() {
        Dni dni = new Dni("12054248");
        char letra = dni.calcularLetra(dni.getInitialDNI());
        dni.añadirLetra(letra);
        assertEquals(dni.getFinalDNI(), "12054248V");

        System.out.println("- Test getInitialDni:");
        System.out.println(dni.getInitialDNI());
        System.out.println("- Test getFinalDni:");
        System.out.println(dni.getFinalDNI());
        System.out.println('\n');
    }
    
    @Test
    public void DNI7() {
        Dni dni = new Dni("90567867");
        char letra = dni.calcularLetra(dni.getInitialDNI());
        dni.añadirLetra(letra);
        assertEquals(dni.getFinalDNI(), "90567867P");

        System.out.println("- Test getInitialDni:");
        System.out.println(dni.getInitialDNI());
        System.out.println("- Test getFinalDni:");
        System.out.println(dni.getFinalDNI());
        System.out.println('\n');
    }
}



