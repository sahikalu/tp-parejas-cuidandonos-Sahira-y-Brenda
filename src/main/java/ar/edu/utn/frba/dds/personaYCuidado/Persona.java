package ar.edu.utn.frba.dds.personaYCuidado;

import ar.edu.utn.frba.dds.ubicaciones.Direccion;

import java.util.List;

public class Persona {
    private String nombreYApellido;
    private Direccion direccion;
    private Integer edad;
    private SexoPersona sexo;
    private TipoDeUsuario tipoDeUsuario;
    private List<Cuidado> historialDeViajesSeguros;
    private List<Cuidado> historialDeCuidados;

    public void solicitarCuidado() {
    }

    public void comenzar() {
    }

    public void llegueBien() {
    }

    public boolean aceptarCuidado() {
        return false;
    }
}