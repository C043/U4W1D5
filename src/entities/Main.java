package entities;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Bella immagine");
        Audio audio = new Audio("Daje");
        Video video = new Video("Filmino");

        for (int i = 0; i < 15; i++) {
            video.alzaVolume();
            video.alzaLuminosita();
        }

        video.play();
    }
}
