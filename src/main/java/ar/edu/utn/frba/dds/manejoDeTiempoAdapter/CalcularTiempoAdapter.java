package ar.edu.utn.frba.dds.manejoDeTiempoAdapter;
import ar.edu.utn.frba.dds.ubicaciones.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CalcularTiempoAdapter {
    // CalcularTiempoAdapter

    public static String obtenerDistancia(Direccion origen, Direccion destino) throws IOException {
        String apiKey = "";
        // Construir la URL de la solicitud con las direcciones de origen y destino
        String urlStr = "https://maps.googleapis.com/maps/api/distancematrix/json"
                + "?origins=" + origen.getCalle() + "," + origen.getNumero()
                + "&destinations=" + destino.getCalle() + "," + destino.getNumero()
                + "&mode=walking" // Modo de transporte: caminar
                + "&key=" + apiKey;

        // Realizar la solicitud HTTP GET
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Leer la respuesta
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        // Analizar la respuesta JSON para obtener la distancia
        // Aquí deberías implementar el análisis real de la respuesta JSON
        String distancia = "2 km"; // Simulado

        return distancia;
    }

    public static String obtenerDuracion(Direccion origen, Direccion destino) throws IOException {
        String apiKey = "";
        // Construir la URL de la solicitud con las direcciones de origen y destino
        String urlStr = "https://maps.googleapis.com/maps/api/distancematrix/json"
                + "?origins=" + origen.getCalle() + "," + origen.getNumero()
                + "&destinations=" + destino.getCalle() + "," + destino.getNumero()
                + "&mode=walking" // Modo de transporte: caminar
                + "&key=" + apiKey;

        // Realizar la solicitud HTTP GET
        URL url = new URL(urlStr);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        // Leer la respuesta
        BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder response = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            response.append(line);
        }
        reader.close();

        // Analizar la respuesta JSON para obtener la duración
        // Aquí deberías implementar el análisis real de la respuesta JSON
        String duracion = "30 min"; // Simulado

        return duracion;
    }
}