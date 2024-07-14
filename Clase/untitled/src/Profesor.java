public class Profesor extends Usuario {
    private int faltas;

    public Profesor(String nombre, String apellido, int faltas){
        super(nombre, apellido);
        this.faltas=faltas;
    }
    public void verificarFaltas(int i){
        System.out.println("Faltas:"+faltas);
        if (faltas > 3){
            System.out.println("Justificar sus Faltas.");
        }
    }
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Faltas:"+faltas);
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
}
