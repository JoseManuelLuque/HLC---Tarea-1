public class Main {
    public static void main(String[] args) {
        Ejercicio1();
    }

    /*
    Ejercicio 1: Declarar variables en Java y Kotlin
    En este ejercicio, compararemos cómo se declaran variables en ambos lenguajes y las
    diferencias en cuanto a la inferencia de tipos.
    Java:
    public class Main {
        public static void main(String[] args) {
            int vida = 100;
            String personaje = "Naruto";
            System.out.println("El personaje " + personaje + " tiene " + vida + " puntos de vida.");
        }
    }
    Explica las diferencias entre el uso de var y val en Kotlin frente a las variables en Java.
    */
    public static void Ejercicio1() {
        // DECLARACION DE VARIBALES
        // KOTLIN

        // var se usa para declara una variable mutable es decir que no es fija se puede editar.
        // En este caso empieza como una string vacia pero si hago VARIAVLE = "Hola" su valor cambiará
        //var VARIABLE = ""

        // val se usa para definir una variable no mutable es decir que es fija siempre haga lo que haga
        // en este caso siempre se quedara con el valor que tiene una strign que dice Hola
        //val FIJA = "Hola"

        // Tambien se pueden declarar sin valor
        // val numero: Int

        // Tambien existen las variables nullables, es decir que ppueden tener o no valor nulo
        // var mensaje: String? = null -> Nullable
        //var mensajeSeguro: String = "Hola" -> No nullable

        //JAVA
        // En Java hay que especificar el tipo al inicio de la delcaracion:
        // int numero;

        // Se pueden hacer asi sin valor o asignadole uno
        // string saludo = "Hola";
    }

    /*
    Ejercicio 2: Uso de if y operadores ternarios
    Vamos a ver cómo traducir el operador ternario en Java a Kotlin, ya que Kotlin no tiene un
    operador ternario explícito.
    Explica cómo funciona la estructura if en Kotlin en comparación con el operador ternario en
    Java.
            Kotlin:
    fun main() {
        val energia = 80
        val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"
        println(estado)
    }
    */

    public static void Ejercicio2() {
        // IF Kotlin
        /*

        val energia = 80
        val estado = if (energia > 50) "Personaje fuerte" else "Personaje débil"
        println(estado)

        */

        //En Java, el operador ternario ? : se utiliza para realizar una operación condicional en una sola línea:

        int energia = 80;
        String estado = energia > 50 ? "Personaje fuerte" : "Personaje débil";
        System.out.println(estado);
    }

    /*
    Ejercicio 3: Uso de for y while
    Vamos a practicar con bucles, que en ambos lenguajes se usan mucho, sobre todo en
    situaciones como recorrer inventarios o colecciones de objetos.
    Compara el uso del bucle for en ambos lenguajes, haciendo hincapié en cómo Kotlin
    simplifica la sintaxis.
     */
    public static void Ejercicio3() {
        //Kotlin simplifica la sintaxis, haciendo el código más conciso y legible:

        /*

            val cofres = arrayOf("Espada", "Escudo", "Poción")
            for (cofre in cofres) {
                println("Has encontrado: $cofre") }
         */

        //En Java, el bucle for puede recorrer una colección de elementos de forma explícita:
        String[] cofres = {"Espada", "Escudo", "Poción"};
        for (String cofre : cofres) {
            System.out.println("Has encontrado: " + cofre);
        }
    }


    /*
    Ejercicio 4: Control de flujo con break y continue
    Aquí veremos cómo usar break y continue en Kotlin y compararlo con su equivalente en
    Java.
    Explica la diferencia en cómo Kotlin maneja rangos y control de flujo frente a Java.
     */
    public static void Ejercicio4() {


        //En Kotlin se hace asi
        /*

        for (i in 1..5) {
        if (i == 3) {
            continue // Salta la iteración cuando i es 3
        }
        println("Número: $i")

        */

        //En Java, el control de flujo es similar, pero los rangos no son tan intuitivos
        /*

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Salta la iteración cuando i es 3
            }
            System.out.println("Número: " + i);

         */
    }

    /*
    Ejercicio 5: Definición de una clase en Java y Kotlin
    Vamos a ver cómo crear una clase simple para un personaje con atributos como nombre,
    vida y ataque.
    Explica cómo Kotlin simplifica la definición de clases y el constructor frente a Java.
         */
    public static void Ejercicio5() {


        //JAVA
        /*

        public class Personaje {
            String nombre;
            int vida;
            int ataque;
            public Personaje(String nombre, int vida, int ataque) {
                this.nombre = nombre;
                this.vida = vida;
                this.ataque = ataque;
            }
            public void mostrarInfo() {
                System.out.println("Nombre: " + nombre + ", Vida: " + vida + ", Ataque: " + ataque);
            }
            public static void main(String[] args) {
                Personaje goku = new Personaje("Goku", 100, 50);
                goku.mostrarInfo();
            }
        }

        */

        // Kotlin simplifica mucho la creacion de clases
        /*
        class Personaje(val nombre: String, var vida: Int, var ataque: Int) {
        fun mostrarInfo() {
            println("Nombre: $nombre, Vida: $vida, Ataque: $ataque")
            }
        }

        fun main() {
            val goku = Personaje("Goku", 100, 50)
            goku.mostrarInfo()
        }

         */
    }

    /*
    Ejercicio 6: Manejo de valores nulos en Kotlin
    Kotlin tiene un sistema de tipos nulos más seguro que Java. Explica cómo funciona la
    seguridad de tipos nulos en Kotlin (String?), comparándola con Java.
     */
    public static void Ejercicio6() {
    // Kotlin utiliza un sistema de tipos que distingue entre referencias que pueden ser nulas (String?) y las que no pueden serlo (String). Esto ayuda a evitar los clásicos errores de puntero nulo (NullPointerException, o NPE) que son comunes en Java
     /*
     fun main() {
        var personaje: String? = null
        if (personaje != null) {
        println("El personaje es $personaje")
        } else {
        println("No hay personaje.")
        }
       }
      */
    }

    /*
    Ejercicio 7: Funciones simples y expresiones lambda
    Vamos a explorar cómo Kotlin permite simplificar la sintaxis de las funciones y cómo se usan
    las expresiones lambda.
    Compara la simplicidad de las funciones y lambdas en Kotlin con Java, destacando cómo
    Kotlin es más conciso.
    */
    public static void Ejercicio7() {

        // En Java, definir una función requiere definir una clase, un método, y especificar los tipos de retorno y los parámetros explícitamente

        /*

        public class Main {
            public static void main(String[] args) {
                System.out.println(multiplicar(5));
                // Lambda en Java (requiere interfaz funcional)
                Operacion operacion = (a, b) -> a + b;
                System.out.println(operacion.sumar(3, 4));
                }
                public static int multiplicar(int num) {
                return num * 2;
                }
                interface Operacion {
                int sumar(int a, int b);
            }
        }

         */

        // En Kotlin, la definición de funciones es más concisa y se puede hacer directamente sin necesidad de una clase contenedora
        /*

        fun suma(a: Int, b: Int): Int {
        return a + b
        }

        fun main() {
            val resultado = suma(3, 4)
            println("Resultado: $resultado")
        }

        //LAMBDA
        fun main() {
        val numeros = listOf(1, 2, 3, 4, 5)
        numeros.forEach { numero ->
            println(numero * 2)
            }
        }

        //Utilizamos la función forEach de Kotlin para recorrer cada número en la lista. La expresión lambda { numero -> println(numero * 2) } toma cada número de la lista, lo multiplica por 2 y luego imprime el resultado.

         */

    }

}