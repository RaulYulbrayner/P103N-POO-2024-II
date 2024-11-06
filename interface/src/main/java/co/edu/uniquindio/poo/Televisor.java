package co.edu.uniquindio.poo;

public class Televisor extends Dispositivo implements IEncender {

    private int referencia;

    public Televisor(String nombre, int referencia){
        super(nombre);
        this.referencia=referencia;
    }

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    @Override
    public void prender() {
        System.out.println("TV prendido");
    }

    @Override
    public void apagar() {
        System.out.println("TV apagado");
    }

    @Override
    public void importar() {
        System.out.println("TV importada");
    }

    

    
}
