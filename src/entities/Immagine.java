package entities;

public class Immagine extends ElementoMultimediale implements Static, Visibile {
    private byte luminosita;

    public Immagine(String titolo) {
        super(titolo);
        this.luminosita = 5;
    }

    @Override
    public void show() {
        String[] volumeArr = new String[10];
        for (int i = 0; i < 10; i++) {
            if (i >= this.luminosita) {
                volumeArr[i] = "";
            } else {
                volumeArr[i] = "*";
            }
        }
        String showVolume = String.join("", volumeArr);
        System.out.println(this.titolo + " " + showVolume);
    }

    @Override
    public void abbassaLuminosita() {
        if (luminosita > 1) {
            this.luminosita--;
            System.out.println("Luminosità abbassata, la luminosità ora è " + this.luminosita);
        } else {
            System.out.println("Luminosità già al minimo!");
        }

    }

    @Override
    public void alzaLuminosita() {
        if (luminosita < 10) {
            this.luminosita++;
            System.out.println("Luminosità alzata, la luminosità ora è " + this.luminosita);
        } else {
            System.out.println("Luminosità già al massimo!");
        }
    }
}
