package comCompany.clases;

public class SmartDivice {

    public String Marca;
    public String Modelo;
    public String Procesador;
    public String pantalla;
    public int LargoBateria;
    public int Year;

    public SmartDivice(){

    }

    public SmartDivice(String marca, String Modelo, String procesador, String pantalla, int largoBateria, int year) {
        this.Marca = marca;
        this.Modelo = Modelo;
        this.Procesador = procesador;
        this.pantalla = pantalla;
        this.LargoBateria = largoBateria;
        this.Year = year;
    }

}
