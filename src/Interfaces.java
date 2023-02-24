public class Interfaces {
    public static void main(String[] args) {
    Coche coche = new Coche();

    }
}
interface Vehiculo{
    int variables = 0;
    void Acelerar (int cuantaVelocidad);

    void Frenar (int cuantaVelocidad);
}
class Coche implements Vehiculo{
    public void Acelerar(int cuantaVelocidad){

    }
    public void Frenar(int cuantaVelocidad){

    }

}
