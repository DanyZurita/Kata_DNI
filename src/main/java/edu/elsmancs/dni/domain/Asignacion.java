package edu.elsmancs.dni.domain;


public class Asignacion {
    
    private final char[] arrayLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
    private final String dni;
    public String DNI;
    private char letra;
    
    protected Asignacion(String dni) {
        this.dni = dni;
    }
    
    public char[] getArrayLetras() {
        return this.arrayLetras;
    }
    
    int getArrayLength(){
        return arrayLetras.length;
    }
    protected String getDni() {
        return this.dni;
    }
    
    protected String getDNI() {
        return this.DNI;
    }
    
    char getLetra(int posicion) {
           return this.arrayLetras[posicion];
    }
    void setDNI(String dniCompleto) {
        this.DNI = dniCompleto;
    }
}
