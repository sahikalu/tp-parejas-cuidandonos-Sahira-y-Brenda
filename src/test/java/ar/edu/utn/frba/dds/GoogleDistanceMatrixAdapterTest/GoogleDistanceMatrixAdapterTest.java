package ar.edu.utn.frba.dds.GoogleDistanceMatrixAdapterTest;
import ar.edu.utn.frba.dds.ubicaciones.Direccion;
import static ar.edu.utn.frba.dds.manejoDeTiempoAdapter.CalcularTiempoAdapter.obtenerDistancia;
import static ar.edu.utn.frba.dds.manejoDeTiempoAdapter.CalcularTiempoAdapter.obtenerDuracion;
import java.io.IOException;

public class GoogleDistanceMatrixAdapterTest {
    public static void main(String[] args) {
        try {
            Direccion origen = new Direccion("Calle París", "123");
            Direccion destino = new Direccion("Calle Roma", "456");
            String distancia = obtenerDistancia(origen, destino);
            String duracion = obtenerDuracion(origen, destino);

            // Imprimir los resultados
            System.out.println("Distancia: " + distancia);
            System.out.println("Duración del viaje: " + duracion);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
