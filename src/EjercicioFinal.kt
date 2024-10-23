/*
    Ejercicio Final:
    Traduce el siguiente fragmento de código Java a Kotlin, que simula un pequeño combate
    entre dos personajes, donde ambos atacan hasta que uno de los dos quede sin vida.
    Java:
    public class Combate {
    public static void main(String[] args) {
    Personaje goku = new Personaje("Goku", 100, 20);
    Personaje vegeta = new Personaje("Vegeta", 80, 25);
    while (goku.vida > 0 && vegeta.vida > 0) {
    goku.vida -= vegeta.ataque;
    vegeta.vida -= goku.ataque;
    System.out.println("Vida de Goku: " + goku.vida);
    System.out.println("Vida de Vegeta: " + vegeta.vida);
    }
    if (goku.vida <= 0) {
    System.out.println("Vegeta ha ganado el combate.");
    } else {
    System.out.println("Goku ha ganado el combate.");
    }
    }
    }
    class Personaje {
    String nombre;
    int vida;
    int ataque;
    public Personaje(String nombre, int vida, int ataque) {
    this.nombre = nombre;
    this.vida = vida;
    this.ataque = ataque;
    }
    }
 */
data class Personaje(val nombre: String, var vida: Int, val ataque: Int)

fun main() {
    fun main() {
        val goku = Personaje("Goku", 100, 20)
        val vegeta = Personaje("Vegeta", 80, 25)

        while (goku.vida > 0 && vegeta.vida > 0) {
            goku.vida -= vegeta.ataque
            vegeta.vida -= goku.ataque
            println("Vida de Goku: ${goku.vida}")
            println("Vida de Vegeta: ${vegeta.vida}")
        }

        if (goku.vida <= 0) {
            println("Vegeta ha ganado el combate.")
        } else {
            println("Goku ha ganado el combate.")
        }
    }
}