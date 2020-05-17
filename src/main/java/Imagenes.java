// importamos la libreria proncipal
import processing.core.PApplet;
import processing.core.PImage;

/** Hereda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Imagenes extends PApplet {
    // definimos atributos para todoa la clase
    // es la ventana de salida de la aplicacion
    // en Processing las aplicaciones se llaman sketchs
    int viewport_w = 640; // ancho en pixels
    int viewport_h = 360; // alto en pixels
    // truco para poder ejecutar nuestro código
    // en el entorno gráfico ya creado
    public static void main(String args[]) {
        PApplet.main("Imagenes");
    }
    // método que tiene las configuraciones iniciales
    @Override
    public void settings() {

       // size(viewport_w, viewport_h, P2D);
       // smooth(8);

        //datos que trabajaremos con paisaje

        size(1200,700);
        paisaje = loadImage("paisaje.jpg");
    }

    // declaramos el objeto para poder tener acceso en toda la clase

    PImage homer;
    PImage paisaje;

    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch

    @Override
    public void setup() {
        // hay que indicar los tamaños y carga de imagenes en settings o nos dará error
    }

    // ACUERDATE: esto se repite en bucle indefinidamente
    @Override
    public void draw() {

        // image(paisaje,0,0);  NO HACE FALTA UNA VEZ INDICADO EL paisaje.loadPixels();
        loadPixels();
     //aqui indicaremos que pixeles deseamos cargar
        paisaje.loadPixels();
        for(int x = 0; x <width; x++){
            for(int y = 0; y<height;y++){
               int loc = x+y*width;
               pixels[loc] = paisaje.pixels[loc];
           }
        }
        // actualizamos indicando la selección, de no hacerlo no aparecerá ninguna imagen de fondo

      updatePixels();

        // inicializamos el objeto con la imagen del directorio 'data'

        homer = loadImage(dataPath("homer.png"));

        // cargamos la imagen en la ventana en cada iteración del bucle
        // posicionamos la imagen segun el movimiento del raton

        image(homer,mouseX,mouseY);

    }

}