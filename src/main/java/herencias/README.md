
🚗 Proyecto de Herencia en Java: Vehículo, Coche y Moto 🏍️

Este proyecto demuestra cómo utilizar la herencia en Java para modelar diferentes tipos de vehículos. Contiene una clase base Vehiculo y dos clases derivadas Coche y Moto, que heredan de Vehiculo.


📜 Descripción de las Clases
Vehiculo 🚘
La clase base Vehiculo define los atributos y métodos comunes para todos los vehículos, como la marca, velocity (velocidad) y el número de ruedas. También tiene métodos como acelerar() y frenar().

Atributos principales:

marca: Marca del vehículo (ej. Toyota, Yamaha).
velocity: Velocidad actual del vehículo.
ruedas: Número de ruedas del vehículo.

Coche 🚗
La clase Coche hereda de Vehiculo y representa un coche. En su implementación de acelerar() y frenar(), el coche incrementa o reduce la velocidad en 20 unidades.

Moto 🏍️
La clase Moto también hereda de Vehiculo y representa una motocicleta. En su implementación de acelerar() y frenar(), la moto incrementa la velocidad en 30 unidades y la reduce en 10 unidades.

⚙️ Ejecución del Código
La clase Main crea instancias de Coche y Moto, y utiliza sus métodos para simular el comportamiento de cada tipo de vehículo.

java
Copiar código
public class Main {
public static void main(String[] args) {
Coche car1 = new Coche("Toyota");
Moto moto1 = new Moto("Yamaha");

        car1.acelerar();
        moto1.acelerar();

        System.out.println("moto: ");
        System.out.println("Velocidad: " + moto1.getVelocity());
        System.out.println("Ruedas: " + moto1.getRuedas());
        System.out.println("Marca: " + moto1.getMarca());

        System.out.println("coche: ");
        System.out.println("Velocidad: " + car1.getVelocity());
        System.out.println("Marca: " + car1.getMarca());
    }
}

🔍 Resultado Esperado
Al ejecutar el programa, deberías ver un resultado como este:

makefile
Copiar código
moto:
Velocidad: 50
Ruedas: 2
Marca: Yamaha

coche:
Velocidad: 20
Marca: Toyota

🛠️ Tecnologías Utilizadas
Java ☕
JDK 11 o superior
📝 Notas
Asegúrate de compilar cada archivo .java en la estructura de carpetas correcta.
Para ejecutar Main.java, debes tener todas las clases en su paquete correspondiente.