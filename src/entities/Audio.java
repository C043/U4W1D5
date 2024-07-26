package entities;

import java.util.Random;

public class Audio extends ElementoMultimediale implements Riproducibile {
    Random rand = new Random();
    private byte volume;
    private int durata;

    public Audio(String titolo) {
        super(titolo);
        this.durata = rand.nextInt(2, 13);
        this.volume = 5;
    }

    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.titolo + " " + "!".repeat(Math.max(0, this.volume)));
        }
    }

    @Override
    public void abbassaVolume() {
        if (this.volume > 1) {
            this.volume--;
            System.out.println("Volume di " + this.titolo + " abbassato, il volume ora è " + this.volume);
        } else {
            System.out.println("Volume di " + this.titolo + " già al minimo!");
        }
    }

    @Override
    public void alzaVolume() {
        if (this.volume < 10) {
            this.volume++;
            System.out.println("Volume di " + this.titolo + " alzato, il volume ora è " + this.volume);
        } else {
            System.out.println("Volume di " + this.titolo + " già al massimo!");
        }
    }
}
