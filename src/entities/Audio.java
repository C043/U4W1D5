package entities;

import java.util.Random;

public class Audio extends ElementoMultimediale implements Riproducibile {
    Random rand = new Random();
    private byte volume;
    private int durata;

    public Audio(String titolo) {
        super(titolo);
        this.durata = rand.nextInt(60, 120);
        this.volume = 5;
    }

    @Override
    public void play() {
        String[] volumeArr = new String[10];
        for (int i = 0; i < 10; i++) {
            if (i >= this.volume) {
                volumeArr[i] = "";
            } else {
                volumeArr[i] = "!";
            }
        }
        String showVolume = String.join("", volumeArr);
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.titolo + " " + showVolume);
        }
    }

    @Override
    public void abbassaVolume() {

        if (this.volume > 1) {
            this.volume--;
            System.out.println("Volume abbassata, il volume ora è " + this.volume);
        } else {
            System.out.println("Volume già al minimo!");
        }

    }

    @Override
    public void alzaVolume() {
        if (this.volume < 10) {
            this.volume++;
            System.out.println("Volume alzato, il volume ora è " + this.volume);
        } else {
            System.out.println("Volume già al massimo!");
        }
    }
}
