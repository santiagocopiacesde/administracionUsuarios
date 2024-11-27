import javax.management.relation.Role;

public class EmpleadoRegular038 {
    String nombre;
    String correo;
    String Rol;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String rol) {
        Rol = rol;
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Correo: " + correo);
        System.out.println("Rol: " + Rol);
    }

        public EmpleadoRegular038(String nombre, String email, String Rol) {
            super();
            System.out.println("Este usuario tiene permisos limitados.");
        }
    }
