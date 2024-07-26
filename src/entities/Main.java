package entities;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Foto");
        Video video = new Video("Oppenheimer");
        Audio audio = new Audio("Illusion");

        video.alzaVolume();
        video.play();
        img.abbassaLuminosita();
        img.show();
        audio.abbassaVolume();
        audio.play();
    }
}
