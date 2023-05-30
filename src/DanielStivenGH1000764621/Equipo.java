package DanielStivenGH1000764621;

public abstract class Equipo implements Miembro {
    
    private int Id, edad;
    private String nombre, apellido;

    public Equipo(int Id, int edad, String nombre, String apellido) {
        this.Id = Id;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Equipo() {
    }

    public int getId() {
        return Id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    @Override  
    public void concentrarse() 
    {
    }

    @Override
    public void viajar() 
    { 
    }

  
    @Override
    public void entrenar() 
    {
    }

    @Override
    public void jugarPartido() 
    {
    }
    
    public String imprimir(){
       return null;
    }
}
