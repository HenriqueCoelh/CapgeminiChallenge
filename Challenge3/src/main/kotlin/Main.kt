import kotlin.math.round
import kotlin.math.sqrt

/*
Observação: Esse foi o exercício em que tive mais dificuldade. Estou postando parte do raciocínio desenvolvido
para chegar até o resultado, que por via das dificuldades, eu não consegui completar.
Espero que entendam :)
 */

fun encrypt(sentence: String): String{
    var noWhiteSpace = sentence.filter { !it.isWhitespace() }
    val arraySentence: Array<String> = noWhiteSpace.toCharArray().map { it.toString() }.toTypedArray()
    val size = arraySentence.size.toDouble()
    var squareRootDouble = round(sqrt(size))
    var novoArray = arrayOf(0)
    var squareRoot = squareRootDouble.toInt()
    var arrayMulti = ArrayList<Array<String>> ()
    var line: MutableList<String> = ArrayList()

    for (aux in 0..squareRoot-1 step 1){
        line.add(arraySentence[aux])
    }
    return line.joinToString()
}

fun main(args: Array<String>) {
    var sentence = "tenha um bom dia"

    println(encrypt(sentence))
}