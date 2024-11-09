package herencias;

public class Moto extends Vehiculo {
    public Moto(String marca) {
        super(marca);
        this.ruedas = 2;

    }

    @Override
    public void acelerar() {

        this.velocity += 30;
    }
    @Override
    public String toString() {
        return "El MOTO va a :"+ this.velocity + "km/h";
    }

    @Override

    public void frenar() {

        this.velocity -= 10;
    }
}