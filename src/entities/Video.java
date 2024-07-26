package entities;

import java.util.Random;

public class Video extends ElementoMultimediale implements Riproducibile, Visibile {
    Random rand = new Random();
    private byte volume;
    private int durata;
    private byte luminosita;

    public Video(String titolo) {
        super(titolo);
        this.volume = 5;
        this.luminosita = 5;
        this.durata = rand.nextInt(60, 120);
    }


    @Override
    public void play() {
        for (int i = 0; i < this.durata; i++) {
            System.out.println(this.titolo + " " + "!".repeat(Math.max(0, this.luminosita)) + " " + "*".repeat(Math.max(0, this.luminosita)));
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
    public void abbassaLuminosita() {
        if (this.luminosita > 1) {
            this.luminosita--;
            System.out.println("Luminosità di " + this.titolo + " abbassata, la luminosità ora è " + this.luminosita);
        } else {
            System.out.println("Luminosità di " + this.titolo + " già al minimo!");
        }
    }

    @Override
    public void alzaLuminosita() {
        if (this.luminosita < 10) {
            this.luminosita++;
            System.out.println("Luminosità di " + this.titolo + " alzata, la luminosità ora è " + this.luminosita);
        } else {
            System.out.println("Luminosità di " + this.titolo + " già al massimo!");
        }
    }
}
