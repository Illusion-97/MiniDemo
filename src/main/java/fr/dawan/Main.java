package fr.dawan;


public class Main {
    public static void main(String[] args) { // Point d'entrée de l'exécution du programme
        Calculatrice casio = new Calculatrice("Casio");
        Calculatrice TI = new Calculatrice("Ti");
        casio.addition(10,10);
        TI.addition(10,10);
        casio.setNom("Nawak");
    }
}
