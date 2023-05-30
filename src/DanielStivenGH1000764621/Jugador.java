package DanielStivenGH1000764621;

import java.util.Random;

public class Jugador  extends Equipo {
    private int dorsal;
    private String demarcacion;

    public Jugador(int dorsal, String demarcacion, String nombre, String apellido, int Id, int edad ) 
    {
        super(Id, edad, nombre, apellido);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public String imprimir(){
         
        Random aleatorio;
        aleatorio = new Random();
        aleatorio.nextInt(4);

        switch (aleatorio.nextInt(4)){
            case 0:
                darEntrevista();
                break;
            case 1:
                concentrarse(); 
                break;
            case 2: 
                viajar();
                break;
            case 3:
                entrenar();
                break;
            case 4:
                jugarPartido();
                break;
            default:
                break;
        }
        return getNombre() + " " + getApellido() + "\n" + "EDAD: " + getEdad() + "   ID: " + getId() + "\n" + "DORSAL: " + dorsal + "   DEMARCACION: " + demarcacion + "\n" + accion + "\n" + "-------------------------------";
    }
    public Jugador() 
    {
    }
    
    public void darentrevista()
    {
    }

    public int getDorsal() {
        return dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
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
        accion = "debe Dar Una Entrevista";
    }

}
