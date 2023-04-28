package com.talan.jeux.pendu;

import com.talan.jeux.pendu.services.InitMotDictionnaireService;
import com.talan.jeux.pendu.services.InitMotInterface;
import com.talan.jeux.pendu.services.MessagesConsoleService;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        //TODO
        InitMotInterface service = new InitMotDictionnaireService();
        MessagesConsoleService messagesConsoleService = new MessagesConsoleService();

        String motATrouver = service.recupererMot();
        int nombreErreur = 0;
        List<String> lettresDejaProposees = new ArrayList<>();
        List<String> resolution = new ArrayList<>(motATrouver.length());
        for (int i = 0; i < motATrouver.length(); i++) {
            resolution.add(i, "_");
        }

        while (!motATrouver.equals(String.join("", resolution)) && nombreErreur < 7) {
            messagesConsoleService.afficherInterface(resolution, nombreErreur, lettresDejaProposees);
            String lettreProposee = messagesConsoleService.demanderLettre();
            while (!lettreProposee.matches("[a-zA-Zéèê]")) {
                System.out.println("Donner une LETTRE");
            }
            if (!motATrouver.contains(lettreProposee)) {
                nombreErreur += 1;
                lettresDejaProposees.add(lettreProposee);
            } else {
                List<Integer> indexLettres = new ArrayList<>();
                for (int i = 0; i < motATrouver.length(); i++) {
                    if (motATrouver.substring(i, i+1).equals(lettreProposee)) {
                        indexLettres.add(i);
                    }
                }
                for (int index : indexLettres) {
                    resolution.set(index, lettreProposee);
                }
            }
        }

        messagesConsoleService.afficherVictoireOuDefaite(nombreErreur, resolution, motATrouver, lettresDejaProposees);
    }
}
