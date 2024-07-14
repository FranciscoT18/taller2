public class Usuario {
    private String nombre;
    private String apellido;

    public Usuario(String nonmbre,String apellido) {
        this.nombre = nonmbre;
        this.apellido = apellido;
    }
    public void mostrarInformacion(){
        System.out.println("nombre:"+nombre);
        System.out.println("apellido:"+apellido);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
