package edu.elsmancs.dni.domain;


public class Dni {
    
    private Asignacion asig;
    
    
    
    protected char calcularLetra(String DNI) {
        int numerosDNI = Integer.parseInt(DNI);
        int posicion = numerosDNI % asig.getArrayLength(); 
        return asig.getLetra(posicion);
    }
    
    protected String añadirLetra(char letra) {
        String stringLetra = String.valueOf(letra);
        String dniCompleto = asig.getDni().concat(stringLetra);
        asig.setDNI(dniCompleto);
        return dniCompleto;
    }
    
}
