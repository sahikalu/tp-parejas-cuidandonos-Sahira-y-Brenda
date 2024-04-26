package ar.edu.utn.frba.dds.ubicaciones;

public class Direccion {
    private String calle;
    private String numero;

    public Direccion(String calle, String numero) {
        this.calle = calle;
        this.numero = numero;
    }

    public String getCalle() {
        return calle;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return calle + " " + numero;
    }
}

