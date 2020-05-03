import processing.core.PApplet;

/**
 * Esta será nuestra clase principal
 * Hererda de PApplet, que es la clase padre que tiene todos los métodos
 * y atributos para usar Processing
 * Desde este fichero si le damos al triangulito verde a la izquierda
 * podemos ejecutar esta clase sin ser 'main'
 */
public class Formas extends PApplet {
    // definimos atributos para todoa la clase
    // es la ventana de salida de la aplicacion
    // en Processing las aplicaciones se llaman sketchs
    int viewport_w = 1140; // ancho en pixels
    int viewport_h = 860; // alto en pixels

    // truco para poder ejecutar nuestro código
    // en el entorno gráfico ya creado
    public static void main(String args[]) {
        PApplet.main("Formas");
    }

    // método que tiene las configuraciones iniciales
    @Override
    public void settings() {
        size(viewport_w, viewport_h, P2D);
        smooth(8);
    }

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
        // pintamos la ventana según rgb
        // hay muchas paginas que nos dan los colores en rgb
        // esta es una de ellas https://htmlcolorcodes.com/es/
        // prueba a cambiar estos colores

        //fondo
        background(29, 155, 227);

        //persona orejas
        stroke(0);
        fill(249, 229, 247);
        ellipse(mouseX+50,mouseY+15,30,25);

        //persona cabeza
        stroke(0);
        fill(249, 229, 247);
        ellipse(mouseX,mouseY,100,95);

        //persona ojo
        stroke(0);
        fill(255, 255, 255);
        ellipse(mouseX+35,mouseY-8,28,22);

        //persona ojo iris
        stroke(0);
        fill(0, 0, 0);
        ellipse(mouseX+44,mouseY-5,9,11);

        //persona boca
        stroke(0);
        fill(246, 12, 5);
        ellipse(mouseX+29,mouseY+27,22,12);

        //persona diente pequeño
        stroke(0);
        fill(255, 255, 255);
        rect(mouseX+28,mouseY+21,7,5);

        //persona diente grande
        stroke(0);
        fill(255, 255, 255);
        rect(mouseX+24,mouseY+21,6,8);


        //objeto pistola cañon
        stroke(126, 128, 126);
        fill(126, 128, 126);
        rect(mouseX+82,mouseY+36,38,10);

        //objeto pistola empuñadura
        stroke(126, 128, 126);
        fill(126, 128, 126);
        rect(mouseX+82,mouseY+36,14,39);

        //persona mano interior
        stroke(0);
        fill(249, 229, 247);
        rect(mouseX+15,mouseY+46,80,25);

        //persona brazo interior
        stroke(0);
        fill(20, 94, 6);
        rect(mouseX-5,mouseY+46,80,25);


        //persona cuerpo
        stroke(0);
        fill(20, 94, 6);
        rect(mouseX-29,mouseY+45,60,120);

        //persona mano exterior
        stroke(0);
        fill(249, 229, 247);
        rect(mouseX-21,mouseY+52,30,80);

        //persona brazo exterior
        stroke(0);
        fill(20, 94, 6);
        rect(mouseX-21,mouseY+45,30,70);

        //cuerpo inferior pierna izquierda
        stroke(0);
        fill(109, 80, 23);
        rect(mouseX-29,mouseY+150,40,80);

        //cuerpo inferior pierna derecha
        stroke(0);
        fill(109, 80, 23);
        rect(mouseX+1,mouseY+150,30,80);

        //sustento diana
        stroke(0);
        fill(36, 25, 2);
        rect(960,600,30,200);

        //suelo
        stroke(0);
        fill(0, 179, 0);
        rect(0,700,1500,1000);

        //fondo diana
        stroke(0);
        fill(255,255,255);
        rect(900,450,150,150);

        //diana externa1 blanca
        stroke(0);
        fill(255,255,255);
        ellipse(975,525,130,130);;

        //diana externa2 blanca
        stroke(0);
        fill(255,255,255);
        ellipse(975,525,110,110);;

        //diana externa3 azul
        stroke(0);
        fill(62, 190, 225);
        ellipse(975,525,90,90);;

        //diana interna1 azul
        stroke(0);
        fill(62, 190, 225);
        ellipse(975,525,70,70);;

        //diana interna2 rojo
        stroke(0);
        fill(232, 40, 21);
        ellipse(975,525,50,50);

        //diana interna3 rojo
        stroke(0);
        fill(232, 40, 21);
        ellipse(975,525,30,30);

        //diana interna4 amarillo
        stroke(0);
        fill(246, 237, 45);
        ellipse(975,525,10,10);



    }
}