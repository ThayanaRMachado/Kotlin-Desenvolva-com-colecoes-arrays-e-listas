fun main() {
    //val idades = IntArray(4)
    val idades: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)
    idades[0] = 25
    idades[1] = 19
    idades[2] = 33
    idades[3] = 20

    var maiorIdade = Int.MIN_VALUE
    for (idade in idades) {
        if(maiorIdade < idade){
            maiorIdade = idade
        }
    }
    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade){
            menorIdade = idade
        }
    }
    println(menorIdade)
}