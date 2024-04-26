package ar.edu.utn.frba.dds.reaccionFrenteAIncidente;

import ar.edu.utn.frba.dds.personaYCuidado.Cuidado;

class EsperarNMinutos implements ReaccionFrenteAIncidente {
    private Integer minutosAEsperar;

    public void enviarReaccion(Cuidado cuidado) {
    }

    public boolean esFalsaAlarma(Integer minutosAEsperar) {
        return false;
    }
}