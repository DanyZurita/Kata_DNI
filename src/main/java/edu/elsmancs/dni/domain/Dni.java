package edu.elsmancs.dni.domain;


public class Dni {
    
    private final Asignacion asig;
    
    public Dni(String dni) {
        this.asig = new Asignacion(dni);
    }
    
    public char calcularLetra(String DNI) {
        int numerosDNI = Integer.parseInt(DNI);
        int posicion = numerosDNI % asig.getArrayLength(); 
        return asig.getLetra(posicion);
    }
    
    public void añadirLetra(char letra) {
        String stringLetra = String.valueOf(letra);
        String dniCompleto = asig.getDni().concat(stringLetra);
        asig.setDNI(dniCompleto);
    }
    
    public String getFinalDNI() {
        return asig.getDNI();
    }
    
    public String getInitialDNI() {
        return asig.getDni();
    }
}
