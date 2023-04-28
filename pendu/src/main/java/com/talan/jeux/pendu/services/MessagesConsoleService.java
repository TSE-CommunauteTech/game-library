package com.talan.jeux.pendu.services;

import com.talan.jeux.pendu.constants.GraphicsConstants;

import java.util.List;
import java.util.Scanner;

public class MessagesConsoleService {

    public void afficherInterface(List<String> resolution, int nombreErreur, List<String> lettresDejaProposees) {
        System.out.println(String.join(" ", resolution) + "\n" + afficherPenduErreur(nombreErreur) + "\n" + afficherLettresDejaProposees(lettresDejaProposees));
    }

    public String demanderLettre() {
        System.out.println("Donner une lettre :");
        Scanner scanner = new Scanner(System.in);
        return scanner.next().toLowerCase();
    }

    public void afficherVictoireOuDefaite(int nombreErreur, List<String> resolution, String motATrouver, List<String> lettresDejaProposees) {
        if (nombreErreur < 7) {
            System.out.println("Victory !");
            System.out.println(String.join(" ", resolution) + "   Erreur : " + nombreErreur);
        } else {
            System.out.println("Game Over !");
            afficherInterface(resolution, nombreErreur, lettresDejaProposees);
            System.out.println("Le mot à trouver était " + motATrouver);
        }
    }

    private String afficherLettresDejaProposees(List<String> lettresDejaProposees) {
        return String.join(" ", lettresDejaProposees);
    }

    private String afficherPenduErreur(int nombreErreurs) {
        switch (nombreErreurs) {
            case 0: {
                return GraphicsConstants.ERREUR0;
            }
            case 1: {
                return GraphicsConstants.ERREUR1;
            }
            case 2: {
                return GraphicsConstants.ERREUR2;
            }
            case 3: {
                return GraphicsConstants.ERREUR3;
            }
            case 4: {
                return GraphicsConstants.ERREUR4;
            }
            case 5: {
                return GraphicsConstants.ERREUR5;
            }
            case 6: {
                return GraphicsConstants.ERREUR6;
            }
            case 7: {
                return GraphicsConstants.ERREUR7;
            }
            default: {
                return "";
            }
        }
    }
}
