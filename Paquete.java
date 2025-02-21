import java.util.Random;
/**
 *  Un objeto de esta clase guarda los datos de un
 *  paquete
 * 
 * @author - Carlos Conde Zudaire
 *  
 */
public class Paquete 
{
    private Random generador;
    private Dimension dimension;
    private double peso;

    /**
     * Constructor 1 sin parámetros
     * Crea el paquete con 40 , 30, 50 de
     * alto, ancho, largo (en cm) y peso 8 Kg
     */
    public Paquete()    {
        //TODO
        dimension = new Dimension(40, 30, 50);
        peso = 8;
    }

    /**
     * Constructor 2 
     *  Crea el paquete con el alto, ancho, largo (en cm) indicados
     *  y peso un valor aleatorio entre 2 y 8 Kg inclusive
     *  Se crea aquí el generador
     */
    public Paquete(double alto, double ancho, double largo)    {
        //TODO
        dimension = new Dimension(alto, ancho, largo);
        generador = new Random();
        peso = generador.nextInt(6) + 2;
    }

    /**
     * Constructor 3 
     * Crea el paquete a la dimension y peso indicados
     * 
     */
    public Paquete(Dimension dimension, double peso)    {
        //TODO
        this.dimension = dimension;
        this.peso = peso;
    }

    /**
     * accesor para la dimensión
     */
    public Dimension getDimension() {
        return this.dimension;

    }

    /**
     * accesor para el peso
     */
    public double getPeso() {
        return this.peso;

    }

    /**
     * calcula y devuelve el volumen del paquete (en cm3)
     * El volumen = alto x ancho x largo
     */
    public double getVolumen() {
       //TODO
       return dimension.getVolumen();

    }

    /**
     * calcula y devuelve el peso volumétrico del paquete (en Kg)
     * Peso volumétrico = volumen del paquete / 5000
     */
    public double getPesoVolumetrico() {
        //TODO
       double PesoVolumetrico = getVolumen() / 5000; 
       return PesoVolumetrico;

    }

    /**
     *  Devuelve el peso facturable de un paquete
     *  Siempre es el valor mayor entre su peso real y su peso volumétrico
     *      
     */
    public double calcularPesoFacturable() {
        //TODO
       if(peso > getPesoVolumetrico()){
           return peso;
       }else{
           return getPesoVolumetrico();    
       }
    }


    /**
     * Devuelve una copia exacta al objeto actual
     * Se obtienen copias también de los objetos que contenga
     */
    public Paquete clone() {
        //TODO
       Paquete paqueteClon = new Paquete(dimension, peso); 
       return paqueteClon;

    }

    /**
     * Representación textual del paquete
     *  (leer enunciado)
     */
    public String toString() {
        //TODO
       String str = String.format("Descripción del paquete\n"+"%20s%10.2f%s\n"+"%20s%10.2f%s\n"+"%20s%10.2f%s\n"+"%20s%10.2f%s\n"+"%20s%10.2f%s\n"+"%20s%10.2f%s\n","Alto:", dimension.getAlto(), "(cm)","Ancho:", dimension.getAncho(), "(cm)","Largo:", dimension.getLargo(), "(cm)","Peso real", peso, "(kg)","Volumen:", getVolumen(), "(cm3)","Peso volumétrico:", getPesoVolumetrico(),"(kg)"); 
       return str;

    }
    
    /**
     * Muestra en pantalla el objeto actual
     * Este método se incluye como método de prueba
     * de la clase Paquete
     */
    public void print() {
        System.out.println(this.toString());
    }

    

}
