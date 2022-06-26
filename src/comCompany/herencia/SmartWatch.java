package comCompany.herencia;

import comCompany.clases.SmartDivice;

public class SmartWatch extends SmartDivice {
    public String TipoAmarra;

    public SmartWatch(){}

    public SmartWatch(String marca, String Modelo, String procesador, String pantalla, int largoBateria, int year, String tipoAmarra) {
        super(marca, Modelo, procesador, pantalla, largoBateria, year);
        this.TipoAmarra = tipoAmarra;
    }
}
