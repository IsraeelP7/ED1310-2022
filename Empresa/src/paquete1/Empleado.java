package paquete1;

public class Empleado {

    public static final double horasExtraDinero = 276.5;
    public static final double prestacion = 0.03;
    private int id;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int horasExtra;
    private int sueldoEmpleado;
    private int anioIngreso;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String apellidoPaterno, String apellidoMmaterno, int horasExtra, int sueldoEmpleado, int anioIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMmaterno;
        this.horasExtra = horasExtra;
        this.sueldoEmpleado = sueldoEmpleado;
        this.anioIngreso = anioIngreso;
    }

    Empleado(String[] datos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getapellidoPaterno() {
        return apellidoPaterno;
    }

    public void setapellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getapellidoMaterno() {
        return apellidoMaterno;
    }

    public void setapellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public double getSueldoEmpleado() {
        return sueldoEmpleado;
    }

    public void setSueldoEmpleado(int sueldoEmpleado) {
        this.sueldoEmpleado = sueldoEmpleado;
    }

    public double getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", apellidoPaterno="
                + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + ", sueldoEmpleado=" + sueldoEmpleado
                + ", horasExtra=" + horasExtra + ", anioIngreso=" + anioIngreso + '}';
    }

    public double calculoDelSueldo() {
    double prestacion1 = (2022 - this.anioIngreso) * Empleado.prestacion;
    double he = (this.horasExtra * Empleado.horasExtraDinero);
    double sueldoTotal = this.sueldoEmpleado + prestacion1 + he;
    return sueldoTotal ;
}
}
