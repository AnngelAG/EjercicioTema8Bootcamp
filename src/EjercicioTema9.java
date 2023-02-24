public class EjercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.Edad = 21;
        cliente.Telefono = "5588006699";
        cliente.Nombre = "Rodolfo Ren";
        cliente.Credito = 55555;
        System.out.println("Estimado " + cliente.Nombre+" con numero de credito " +cliente.Credito);
        System.out.println("Debemos confirmar si su edad es de "+ cliente.Edad+" años");
        System.out.println("Le hemos llamado al numero "+cliente.Telefono);
        System.out.println(" y no hemos tenido éxito en contactarlo "+
                "favor de regresar la llamada");
        System.out.println("");
        Trabajador trabajador = new Trabajador();
        trabajador.Nombre = "Armando";
        trabajador.Edad = 55;
        trabajador.Telefono = "66995566";
        trabajador.salarioBruto = 23300.00;
        System.out.println();
        System.out.println("Estimado "+trabajador.Nombre);
        System.out.println("Le llamamos al telefono "+trabajador.Telefono);
        System.out.println("Para confirmar que como ahora tiene "+trabajador.Edad+" años de edad");
        System.out.println("Su salario Bruto aumento a "+trabajador.salarioBruto+" dlls diarios");
    }
}
class Persona1 {
    int Edad;
    String Nombre;
    String Telefono;


}
class Cliente extends Persona1 {
    int Credito;

}
class Trabajador extends Persona1{
    Double salarioBruto;
}