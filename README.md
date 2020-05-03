# Processing Sketch
_Creado en base a la clase del repositorio de [Damian](https://github.com/damiancastelao/Processing/blob/master/src/main/java/Formas.java)_

## Contenido
_Consiste en un dibujo usando la librería de [Processing](https://mvnrepository.com/artifact/org.processing/core)._

_Contiene un paisaje ambientado en un campo de tiro (BETA) en el que con el cursor moveremos a una persona la cual posee una pistola, al presionar
el ratón aparecerá en pantalla una cruz en la diana (mientras se mantenga presionada)._

## Preview
_GIF en el que se muestra el contenido del repositorio en interfaz gráfica_


_![GIF](https://i.imgur.com/DRoxpER.gif)_


## Información a destacar
_Breve iniciación y guía general del contenido del repositorio, ya sea para documentarse o modificarlo en un futuro_

* **Método settings:**

_Método que tiene las configuraciones iniciales_

```
public void settings() {

       //contenido
       
    }
```

* **Método setup:**

_Método en el que también podemos añadir configuraciones iniciales de nuestro sketch ( no incluir background )._

```
public void setup() {

      //contenido

    }
```

* **Método draw:**

_Método principal. Aqui estará el grueso de nuestro código, el cual sería equivalente a un 'main. La diferencia principal es que se ejecuta en bucle
,es decir, se repite el código infinitamente_

```
public void draw() {

      //contenido

    }
```

_Detro de este último método irá el contenido principal (dibujos) y movimientos (acciones) que realizará nuestros objetos, los cuales explicaremos a continuación._

_**Stroke:** Se encarga de señalar los bordes del objeto que creamos, su color._

```
Ejemplo

stroke(255,255,255)

Los bordes de nuestro objeto serán de color negro, ya que aportamos un código de color tipo RGB.
    
```

_**Fill:** Se trata de indicar mediante un código RGB el color que rellena la figura que indicamos._

```
Ejemplo

fill(0,0,0)

Nuestra figura serán de color blanco.
    
```

_El siguiente apartado consistirá en los diferentes tipos de figuras que empleamos:__

_**Rect:** Creamos una figura cuadrilátera._

```
Ejemplo

rect(100,50,25,25)

Nuestra figura será un cuadrado en la que sus significados serán:

1º posición en el cuadro de las X
2º posición en el cuadro de la Y.
3º ancho de la forma.
4º altura de la forma.
    
```

_**Ellipse:** Creamos una elipse._

```
Ejemplo

ellipse(240,95,85,75)

Nuestra figura será una elipse en la que sus significados serán:

1º posición en el cuadro de las X
2º posición en el cuadro de la Y.
3º radio de la forma.
4º ancho y altura de la forma.
    
```

_Es importante destacar que la combinación de los 3 apartados, **stroke** **fill** y la **figura** correspondiente seguidos son lo que
constituyen la figura como tal_

```
Ejemplo

        stroke(0);
        fill(255,255,255);
        rect(900,450,150,150);
        
 Ejemplificado con un contenido del repositorio que se corresponde con el fondo de la diana.
    
```

_También debemos destacar como hacemos que se mueva el cursor, por lo que la información de la posición del objeto
en el eje de las X y la Y será modificada, como será ejemplificado a continuación._

```
Ejemplo

        stroke(0);
        fill(246, 12, 5);
        ellipse(mouseX+29,mouseY+27,22,12);
        
 Ejemplificado con un contenido del repositorio que se corresponde con la boca del personaje.
 
 En el indicamos que nos movemos en el eje X y eje Y mediante el ratón y le sumamos la posición 
 en contraste a la posición 0, para poder así mover todo el objeto sin que se superpongan unos
 encima de otros.
    
```

_A continuación se describe el código que hace que cuando presionemos el ratón aparezca en la diana una cruz, el cual es un condicional:_


```
Ejemplo

        if(mousePressed){

            //objetivo vertical
            stroke(0);
            fill(100, 249, 52);
            rect(972,513,5,20);

            //objetivo horizontal
            stroke(0);
            fill(100, 249, 52);
            rect(965,520,20,5);
   
        }

Consiste en que mientras se mantenga pulsado el ratón, se realice la acción de mostrar estos dos objetos 
en la posición señalada.
   
```


[README.md](README.md) de Noé Díaz Dos Santos para el repositorio [ProcessingSketch](https://github.com/ndiazdossantos/ProcessingSketch)

