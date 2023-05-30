package DanielStivenGH1000764621;

import java.util.Random;

public class Entrenador  extends Equipo {
    private String Federacion;

    /**
     *
     * @param nombre
     * @param apellido
     * @param Federacion
     * @param Id
     * @param edad
     */
    public Entrenador(String nombre, String apellido, String Federacion, int Id, int edad) 
    {
        super(Id, edad, nombre, apellido);
        this.Federacion = Federacion;
    }

    public Entrenador() {
    }

    public String getFederacion() {
        return Federacion;
    }

    public void setFederacion(String Federacion) {
        this.Federacion = Federacion;
    }

        @Override
    public String imprimir(){
       
        Random aleatorio;
        aleatorio = new Random();
        aleatorio.nextInt(3);

        switch (aleatorio.nextInt(3)){
            case 0:
                concentrarse();
                break;
            case 1:
                entrenar();
                break;
            case 2: 
                viajar();
                break;
            case 3:
                jugarPartido();
            default:
                break;
        }
        return getNombre() + " " + getApellido() + "\n" + "EDAD: " + getEdad() + "   ID: " + getId() + "\n" + "FEDERACION: " + Federacion + "\n" + accion + "\n" + "-------------------------------";
        
    }
    
    String accion;
    
   @Override
    public void concentrarse() 
    {
        accion = "debe Concentrase"; 
    }

    @Override
    public void viajar() 
    {
        accion = "debe Viajar";  
    }

    @Override
    public void entrenar() 
    {
        accion = "debe Entrenar";
    }

    @Override
    public void jugarPartido() 
    {
        accion = "debe Jugar Partido";
    }
    
    @Override
    public void darEntrevista()
    {
    }
    
}
