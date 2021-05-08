fun main() {
    //val idades = IntArray(4)
    val idades: IntArray = intArrayOf(25, 19, 33, 20)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20

    val maiorIdade = if (idades[0] > idades[1] && idades[0] > idades[2] && idades[0] > idades[3]) {
        println(idades[0])
    } else if (idades[1] > idades[2] && idades[1] > idades[3]) {
        println(idades[1])
    } else if (idades[2] > idades[3]) {
        println(idades[2])
    } else {
        println(idades[3])
    }
}