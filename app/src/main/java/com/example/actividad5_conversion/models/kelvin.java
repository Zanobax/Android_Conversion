package com.example.actividad5_conversion.models;

public class kelvin extends grado{

    public kelvin(Double valor) {
        this.setUnidad("K");
        this.setValor(valor);
    }
    public String toString() {
        return String.format("%.2f%s", getValor(), getUnidad());
    }
    public kelvin parse(celsius C) {
        Double valor = C.getValor() + 273.15;
        return new kelvin(valor);
    }
    public kelvin parse(farenheit F) {
        Double valor = (F.getValor()-32)*5/9 + 273.15;
        return new kelvin(valor);
    }

}
