package entities;

public interface Riproducibile {
    public int durata;
    public byte volume;

    void play();

    void alzaVolume();

    void abbassaVolume();
}
