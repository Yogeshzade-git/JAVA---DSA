import Taxi.*;   // Taxi folder contains all classes

public class Packages {
    public static void main(String[] args) {

        OlaTaxi ola = new OlaTaxi();
        RapidoTaxi rapido = new RapidoTaxi();
        ola.bookTaxi();
        rapido.bookTaxi();
        
    }
}
