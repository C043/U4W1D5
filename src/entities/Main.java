package entities;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Bella immagine");
        Audio audio = new Audio("Daje");

        for (int i = 0; i < 15; i++) {
            audio.alzaVolume();
        }

        audio.play();
    }
}
