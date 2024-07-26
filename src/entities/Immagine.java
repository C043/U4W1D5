package entities;

public class Immagine extends ElementoMultimediale implements Static, Visibile {
    private byte luminosita;

    public Immagine(String titolo) {
        super(titolo);
        this.luminosita = 5;
    }

    @Override
    public void show() {
        System.out.println(this.titolo + " " + "*".repeat(Math.max(0, this.luminosita)));
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
