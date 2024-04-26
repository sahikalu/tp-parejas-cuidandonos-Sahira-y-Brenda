package ar.edu.utn.frba.dds.estadoDeViaje;

public abstract class EstadoDelViaje {
    protected String mensaje;

    public abstract void trayecto();

    public void notificarPersona(String mensaje) {
        // Implementación pendiente
    }

    public void notificarCuidador(String mensaje) {
        // Implementación pendiente
    }
}
