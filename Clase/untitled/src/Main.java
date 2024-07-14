//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Daniel", "Sanchez", 2);
        profesor1.mostrarInformacion();
        profesor1.verificarFaltas(3);

        Alumno alumno1 = new Alumno("Ashley", "Nieves", 7.0);
        alumno1.mostrarInformacion();
        alumno1.verificarAprovacion(7);
    }
}