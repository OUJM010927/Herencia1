public class Herencia1 {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Michelle","Orduño",22,22670367,"22670367@gamil.edu.mx","iguala.gro #22");
        Maestro maestro = new Maestro("Josue","Dirzo",22,"DDirzo@22","iguala.gro");

        estudiante.Soy();
        estudiante.toString();

        System.out.println(" ");

        maestro.soy();
        maestro.toString();

    }
}
