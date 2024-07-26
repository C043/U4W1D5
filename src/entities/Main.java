package entities;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        ElementoMultimediale[] playlist = new ElementoMultimediale[5];

        for (int i = 0; i < 5; i++) {
            System.out.println(i + 1 + ". Cosa vuoi aggiungere alla playlist?");
            String mediaType = user.nextLine().toLowerCase();
            System.out.println("Quale titolo?");
            String title = user.nextLine();
            switch (mediaType) {
                case "video" -> playlist[i] = new Video(title);
                case "audio" -> playlist[i] = new Audio(title);
                case "immagine" -> playlist[i] = new Immagine(title);
                default -> System.out.println("Tipo di media inesistente, riprova.");
            }
            if (!mediaType.equals("video") && !mediaType.equals("audio") && !mediaType.equals("immagine")) break;
        }

        String input;

        loopEsterno:
        do {
            for (ElementoMultimediale elemento : playlist) {
                if (elemento == null) {
                    break loopEsterno;
                }
            }
            System.out.println("Okay, ora cosa vuoi riprodurre?");
            for (int i = 0; i < playlist.length; i++) {
                System.out.println(i + 1 + " - " + playlist[i].titolo);
            }
            System.out.println("Premi il numero corrispondente per riprodurre o premi 0 per uscire.");
            input = user.nextLine();

            switch (input) {
                case "0":
                    System.out.println("Arrivederci!");
                    break;
                case "1":
                    if (playlist[0] instanceof Riproducibile) {
                        ((Riproducibile) playlist[0]).play();
                    } else {
                        ((Static) playlist[0]).show();
                    }
                    break;
                case "2":
                    if (playlist[1] instanceof Riproducibile) {
                        ((Riproducibile) playlist[1]).play();
                    } else {
                        ((Static) playlist[1]).show();
                    }
                    break;
                case "3":
                    if (playlist[2] instanceof Riproducibile) {
                        ((Riproducibile) playlist[2]).play();
                    } else {
                        ((Static) playlist[2]).show();
                    }
                    break;
                case "4":
                    if (playlist[3] instanceof Riproducibile) {
                        ((Riproducibile) playlist[3]).play();
                    } else {
                        ((Static) playlist[3]).show();
                    }
                    break;
                case "5":
                    if (playlist[4] instanceof Riproducibile) {
                        ((Riproducibile) playlist[4]).play();
                    } else {
                        ((Static) playlist[4]).show();
                    }
                    break;
                default:
                    System.out.println("Devi premere un numero da 1 a 5 per riprodurre o 0 per uscire!");
            }
        } while (!Objects.equals(input, "0"));
    }
}
