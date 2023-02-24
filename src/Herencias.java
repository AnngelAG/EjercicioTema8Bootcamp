public class Herencias {
    public static void main(String[] args) {
        Coche1 coche  = new Coche1();
        coche.setSonido("BRRR");
        System.out.println(coche.getSonido());
        coche.Vehiculo1();
        Moto moto = new Moto();
        moto.setSonido("RRRR");
        System.out.println(moto.getSonido());





    }
}
    abstract class Vehiculo1 extends Motor {
    int velocidadMaxima;
    String matricula;
    String sonido;
    public Vehiculo1(){
        System.out.println("Estoy dentro del constructor de vehículo");

    }
    abstract public String getSonido();
    abstract public void setSonido(String sonido);

}
class Moto extends Vehiculo1{
    public String getSonido(){
    return "Soy un sonidillo de moto: " + this.sonido;
    }
    public void setSonido(String sonido){
        this.sonido = sonido;
    }
}
class Motor {
    String tipoMotor;
    public Motor(){
        System.out.println("Estoy en el constructor de Motor");
    }

}
class Coche1 extends Vehiculo1 {
    public void Vehiculo1(){
        System.out.println("Ya no estoy dentro");
    }
    public String getSonido(){
        return  "Soy un supersonido: "+this.sonido;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;

    }

}