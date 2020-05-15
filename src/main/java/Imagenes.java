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
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

    // declaramos el objeto para poder tener acceso en toda la clase

    PImage homer;
    // en este metodo tambien podemos meter configuraciones iniciales de nuestro sketch

    @Override
    public void setup() {
    }

    // método principal. Aqui estará el grueso de nuestro código
    // sería equivalente a un 'main'
    // la DIFERENCIA principal es que se ejecuta en bucle
    // es decir, se repite el código infinitamente
    @Override
    public void draw() {
        // ACUERDATE: esto se repite en bucle indefinidamente
        // pintamos la ventana según rgb
        // hay muchas paginas que nos dan los colores en rgb
        // esta es una de ellas https://htmlcolorcodes.com/es/
        // prueba a cambiar estos colores
        // fondo de la ventana
        background(200,100,0);
        // Necesitamos darle la ruta absoluta
        // la función dataPath nos crea la ruta al directorio
        // data en la raíz del proyecto
        // inicializamos el objeto con la imagen del directorio 'data'
        homer = loadImage(dataPath("homer.png"));


        // cargamos la imagen en la ventana en cada iteración del bucle
        // posicionamos la imagen segun el movimiento del raton

        image(homer,mouseX,mouseY);

    }

}