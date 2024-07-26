package entities;

public class Main {
    public static void main(String[] args) {
        Immagine img = new Immagine("Bella immagine");
        for (int i = 0; i < 5; i++) {
            img.abbassaLuminosita();

        }
        img.show();
    }
}
