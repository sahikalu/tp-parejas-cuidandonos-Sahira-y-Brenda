package ar.edu.utn.frba.dds.ubicaciones;

import lombok.Getter;
import lombok.Setter;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;

import static ar.edu.utn.frba.dds.manejoDeTiempoAdapter.CalcularTiempoAdapter.obtenerDuracion;

@Setter
@Getter
public class Destino {
    private Direccion actual;
    private Direccion finalDestino;
    private Integer minutosEnDestino;

    public void setActual(Direccion actual) {
        this.actual = actual;
    }

    public void setFinalDestino(Direccion finalDestino) {
        this.finalDestino = finalDestino;
    }

    public void setMinutosEnDestino(Integer minutos) {
        this.minutosEnDestino = minutos;
    }

    public void minutosEnDestino(Integer minutos) {
        minutosEnDestino = minutos;
    }


    public Integer calcularTiempoDeDemoraAproximado() throws IOException {
        return Integer.parseInt(obtenerDuracion(this.actual, this.finalDestino));
    }

    public Integer calcularTiempoDeDemoraConMinutosEnDestino() throws IOException {
        return this.calcularTiempoDeDemoraAproximado() + minutosEnDestino;
    }

}
