package ar.edu.utn.frba.dds.personaYCuidado;

import ar.edu.utn.frba.dds.estadoDeViaje.EstadoDelViaje;
import ar.edu.utn.frba.dds.reaccionFrenteAIncidente.ReaccionFrenteAIncidente;
import ar.edu.utn.frba.dds.ubicaciones.Destino;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class Cuidado {
    private Persona persona;
    private List<Persona> cuidadores;
    private List<Destino> destinos;
    private EstadoDelViaje estadoDelViaje;
    private ReaccionFrenteAIncidente reaccionFrenteAIncidente;
    private LocalDateTime fechaDeInicio;
    private LocalDateTime fechaDeLlegada;

    public Integer calcularTiempoDeDemoraAproximado() throws IOException {
        return destinos.stream().mapToInt(destino -> {
            try {
                return destino.calcularTiempoDeDemoraConMinutosEnDestino();
            } catch (IOException e) {
                e.printStackTrace();
                return 0;
            }
        }).sum();
    }

    public boolean recibeMensajeComenzar() {
        return false;
    }

    public boolean recibeMensajeLlegueBien() {
        return false;
    }

    public boolean confirmarCuidadores() {
        return false;
    }

    public void cambiarEstadoDelViaje(EstadoDelViaje estado) {
        this.estadoDelViaje = estado;
    }
}