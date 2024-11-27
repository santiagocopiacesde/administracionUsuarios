public class Main038 {
    public static void main(String[] args) {

        Supervisor038 supervisor038 = new Supervisor038("Santiago", "Santiago123@gmail.com", "Supervisor");
        EmpleadoRegular038 empleadoRegular038 = new EmpleadoRegular038("Milton", "Milton123@gmail.com", "Empleado regular");
        Administrador038 administrador038 = new Administrador038("Mariana", "mariana123@gmail.com", "Administradora");

        empleadoRegular038.mostrarDetalles();
        administrador038.crearUsario();
        administrador038.eliminarUsuario();
        administrador038.modificarUsuario();
        supervisor038.mostrarDetalles();
        administrador038.mostrarDetalles();
    }
}