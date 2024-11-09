package herencias;

import java.util.List;

public class Race {
    private List<Vehiculo> peloton;

    public Race(List<Vehiculo> peloton) {
        this.peloton = peloton;
    }

    public void start() {

        for (Vehiculo vehiculo : peloton) {
            vehiculo.acelerar();
            System.out.println(vehiculo);
        }
    }
}
