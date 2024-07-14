public class Alumno extends Usuario{
 private double promedio;

 public Alumno(String nombre, String apellido, double promedio){
     super(nombre, apellido);
     this.promedio= promedio;
 }
 public double CalcularPromedio(){
     return 0;
 }
 public boolean aprobarReprobar(){
     double promedio= CalcularPromedio();
     double minima= 7.0;
     return promedio >=minima;
 }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
    //metodo extra
    public boolean verificarAprovacion(int i){
     return promedio>= 7;
    }
}
