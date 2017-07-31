package ufal.p3;

import java.util.Calendar;

/**
 * Created by myron on 31/07/2017.
 */
public class Venda {
    private Calendar data;
    private double valor;


    public Calendar getData() {
        return data;
    }

    public void setData(Calendar data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
