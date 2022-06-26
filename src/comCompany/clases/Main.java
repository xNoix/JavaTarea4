package comCompany.clases;

import comCompany.herencia.SmartPhone;
import comCompany.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {
        SmartWatch reloj = new SmartWatch();
        reloj.Marca = "Samsung";
        reloj.Modelo = "Galaxy Watch 4";
        reloj.Procesador = "Exynos W920 (5nm)";
        reloj.pantalla = "Super AMOLED";
        reloj.LargoBateria = 40;
        reloj.Year = 2021;
        reloj.TipoAmarra = "Goma";

        System.out.println(reloj.Marca);
        System.out.println(reloj.Modelo);
        System.out.println(reloj.Procesador);
        System.out.println(reloj.pantalla);
        System.out.println(reloj.LargoBateria);
        System.out.println(reloj.Year);
        System.out.println(reloj.TipoAmarra);

        System.out.println("__________________________________________________________________");

        SmartPhone telephone = new SmartPhone("Samsung","Galaxy S20","Exynos 990", "2400 x 1080 pixeles", 20, 2021, 4);

        System.out.println(telephone.Marca);
        System.out.println(telephone.Modelo);
        System.out.println(telephone.Procesador);
        System.out.println(telephone.pantalla);
        System.out.println(telephone.LargoBateria);
        System.out.println(telephone.Year);
        System.out.println(telephone.Camaras);
    }
}
