package modelo;

public class Persona {
    private int idpersona;
    private String dni;
    private String nombre;
    private String apellidos;
    private String sexo;
    private double talla;
    private double peso;
    private String f_nacimiento;
    private String color;
    private String ubigeo;
    private String telefono;
    private String correo;
    private String gradoinstruccion;
    private String tiposangre;
    
    public void setIdpersona(int idpersona){
        this.idpersona = idpersona;
    }
    public int getIdpersona(){
        return idpersona;
    }
    public void setDni(String dni){
        this.dni = dni;
    }
    public String getDni(){
        return dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setApellido(String apellido){
        this.apellidos = apellido;
    }
    public String getApellido(){
        return apellidos;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
    public void setTalla(double talla){
        this.talla = talla;
    }
    public double getTalla(){
        return talla;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public double getPeso(){
        return peso;
    }
    public void setF_nacimiento(String f_nacimiento){
        this.f_nacimiento = f_nacimiento;
    }
    public String getF_nacimiento(){
        return f_nacimiento;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    public void setUbigeo(String ubigeo){
        this.ubigeo = ubigeo;
    }
    public String getUbigeo(){
        return ubigeo;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public String getCorreo(){
        return correo;
    }
    public void setGradoinstruccion(String gradoinstruccion){
        this.gradoinstruccion = gradoinstruccion;
    }
    public String getGradoinstruccion(){
        return gradoinstruccion;
    }
    public void settiposangre(String tiposangre){
        this.tiposangre = tiposangre;
    }
    public String getTiposangre(){
        return tiposangre;
    }
    
}
