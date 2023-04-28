package com.talan.jeux.pendu.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class InitMotDictionnaireService implements InitMotInterface {

    public String recupererMot() {
        List<String> listeMots = new ArrayList<>();
        String file = "E:\\projects\\game-library\\pendu\\src\\main\\resources\\liste_francais.txt";
        try (Stream<String> stream = Files.lines(Paths.get(file))) {
            stream.forEach(listeMots::add);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return listeMots.get(ThreadLocalRandom.current().nextInt(0, listeMots.size()));
    }
}
