package ufal.p3;

import java.util.Calendar;

/**
 * Created by myron on 31/07/2017.
 */
public class CartaoPonto {
    private Calendar horaChegada;
    private Calendar horaSaida;

    public Calendar getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(Calendar horaChegada) {
        this.horaChegada = horaChegada;
    }

    public Calendar getHoraSaida() {
        return horaSaida;
    }

    public void setHoraSaida(Calendar horaSaida) {
        this.horaSaida = horaSaida;
    }

    public void batePontoChegada(){
        this.horaChegada.setTime(Calendar.getInstance().getTime());
    }

    public void batePontoSaida(){
        this.horaSaida.setTime(Calendar.getInstance().getTime());
    }
}
