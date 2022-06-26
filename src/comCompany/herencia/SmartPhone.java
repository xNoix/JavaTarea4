package comCompany.herencia;

import comCompany.clases.SmartDivice;

public class SmartPhone extends SmartDivice {
    public int Camaras;
    
    public SmartPhone(){}

    public SmartPhone(String marca, String Modelo, String procesador, String pantalla, int largoBateria, int year, int Camaras){
        super(marca, Modelo, procesador, pantalla, largoBateria, year);
        this.Camaras = Camaras;
    }


}
