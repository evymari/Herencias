
package herencias;

public class Coche extends Vehiculo {


    public Coche(String marca) {
        super(marca);
        this.ruedas = 4;
    }

    @Override
    public void acelerar() {

        this.velocity += 20;
    }
    @Override

    public void frenar() {

        this.velocity -= 20;
    }
    @Override
     public String toString() {
        return "El COCHE va a :"+ this.velocity + "km/h";
    }



}
