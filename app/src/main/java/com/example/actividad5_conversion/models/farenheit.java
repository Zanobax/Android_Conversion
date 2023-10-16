package com.example.actividad5_conversion.models;

public class farenheit extends grado{


    public farenheit(Double valor) {
        this.setUnidad("F");
        this.setValor(valor);
    }
    public String toString() {
        return String.format("%.2f%s", getValor(), getUnidad());
    }
    public farenheit parse(celsius C) {
        Double valor = (C.getValor() * 9/5) +32;
        return new farenheit(valor);
    }
    public farenheit parse(kelvin k) {
        Double valor = 1.8*(k.getValor()-273.15) +32;
        return new farenheit(valor);
    }

}
