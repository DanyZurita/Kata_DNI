package edu.elsmancs.dni.domain;


public class Asignacion {
    
    private final char[] arrayLetras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E' };
    private Integer dni = 0;
    
    protected Asignacion(Integer dni) {
        this.dni = dni;
    
    }
    
    public char[] getArrayLetras() {
        return this.arrayLetras;
    }
    
    public Integer getDNI() {
        return this.dni;
    }
    
}
