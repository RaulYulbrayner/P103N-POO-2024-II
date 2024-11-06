package co.edu.uniquindio.poo;

public class Radio extends Dispositivo implements IEncender {

    private int volumen;

    public Radio(String nombre, int volumen) {
        super(nombre);
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    @Override
    public void prender() {
        System.out.println("Radio prendida");
    }

    @Override
    public void apagar() {
        System.out.println("Radio apagado");
    }

    @Override
    public void importar() {
        System.out.println("Radio importada");
    }

}
