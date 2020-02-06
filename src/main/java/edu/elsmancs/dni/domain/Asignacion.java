package edu.elsmancs.dni.domain;


public class Asignacion {
    
    private final char[] arrayLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
    private String dni;
    private String DNI;
    private char letra;
    
    protected Asignacion(String dni) {
        this.dni = dni;
    }
    
    public char[] getArrayLetras() {
        return this.arrayLetras;
    }
    public String getDni() {
        return this.dni;
    }
    
    public String getDNI() {
        return this.DNI;
    }
    
    protected char calcularLetra(String DNI) {
        int numerosDNI = Integer.parseInt(DNI);
        int posicion = numerosDNI % this.arrayLetras.length; 
        return getLetra(posicion);
    }
    
    protected String añadirLetra(char letra) {
        String stringLetra = String.valueOf(letra);
        String dniCompleto = getDni().concat(stringLetra);
        return dniCompleto;
    }
    
    protected void setDNI(String dniCompleto) {
        this.DNI = dniCompleto;
    }
    protected char getLetra(int posicion) {
           return this.arrayLetras[posicion];
    }
}
