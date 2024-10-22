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
        //
    }
}
