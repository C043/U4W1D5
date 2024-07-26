package entities;

public class Immagine extends ElementoMultimediale implements Static, Visibile {
    private byte luminosita;

    public Immagine(String titolo) {
        super(titolo);
        this.luminosita = 5;
    }

    @Override
    public void show() {
        String[] luminositaArr = new String[10];
        for (int i = 0; i < 10; i++) {
            if (i >= this.luminosita) {
                luminositaArr[i] = "";
            } else {
                luminositaArr[i] = "*";
            }
        }
        String showLuminosita = String.join("", luminositaArr);
        System.out.println(this.titolo + " " + showLuminosita);
    }

    @Override
    public void abbassaLuminosita() {
        if (this.luminosita > 1) {
            this.luminosita--;
            System.out.println("Luminosità abbassata, la luminosità ora è " + this.luminosita);
        } else {
            System.out.println("Luminosità già al minimo!");
        }

    }

    @Override
    public void alzaLuminosita() {
        if (this.luminosita < 10) {
            this.luminosita++;
            System.out.println("Luminosità alzata, la luminosità ora è " + this.luminosita);
        } else {
            System.out.println("Luminosità già al massimo!");
        }
    }
}
