package fr.dawan;

import java.util.Scanner;

public class Calculatrice {

    private String nom;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom.equals("Nawak")) return;
        this.nom = nom;
    }

    public Calculatrice(String nom) {
        this.nom = nom;
    }

    public static double getDoubleSaisie() {
        try {
            return new Scanner(System.in).nextDouble();
        } catch (Exception e) {
            System.out.println("Saisie invalide, veuillez réessayer");
            return getDoubleSaisie();
        }
    }



    private static void AfficherSaisie(int saisie) {
        System.out.println(saisie);
    }


    private static void récupérerEtAfficherSaisieNumérique() {
        AfficherSaisie(getIntSaisie());
    }

    public void addition(int a, int b) {
        System.out.println(nom + " affiche un résultat :");
        System.out.println(a + b);
    }

    private static int getIntSaisie() {
        try {
            return new Scanner(System.in).nextInt();
        } catch (Exception e) {
            System.out.println("Saisie invalide, veuillez réessayer");
            return getIntSaisie();
        }
    }
}
