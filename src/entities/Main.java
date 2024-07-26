package entities;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("La ragazza afagana");
        Audio audio = new Audio("Houdini");
        Video video = new Video("Barbie");
        video.alzaVolume();
        video.alzaVolume();
        video.abbassaVolume();


        video.play();
    }
}
