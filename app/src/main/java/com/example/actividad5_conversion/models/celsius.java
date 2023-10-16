package com.example.actividad5_conversion.models;

public class celsius extends grado {

    public celsius(Double valor) {
        this.setUnidad("C");
        this.setValor(valor);
    }
    public String toString() {
        return String.format("%.2f%s", getValor(), getUnidad());
    }
    public celsius parse(farenheit F){
        Double valor=(F.getValor()-32)*5/9;
        return new celsius(valor);
    }
    public celsius parse(kelvin K){
        Double valor=K.getValor()-273.15;
        return new celsius(valor);
    }
}
