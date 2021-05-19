package com.talan.jeux.pendu.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class MessagesConsoleServiceTest {

    @Test
    public void questionNombreDeJoueurs() {
        final ByteArrayOutputStream consoleOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(consoleOutput));
        MessagesConsoleService.demanderLeNombreDeJoueurs();
        String resultat = consoleOutput.toString().trim();
        String resultatAttendu = "Nombre de joueurs (2-10) ?";
        Assertions.assertEquals(resultat, resultatAttendu);
    }
}
