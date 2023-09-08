fun main(args: Array<String>) {
    saudacao(true)
    saudacao(false)
    maiorDeIdade(38)
    maiorDeIdade(10)
    println("Valor do bônus: R$ ${bonusWhen("Coordenador")}")
}

fun saudacao(dia: Boolean) = if (dia) {
    println("Bom dia")
} else
{
    println("Boa noite")
}

fun maiorDeIdade(idade: Int){

    if (idade > 18){
        println("Maior de idade")
    } else
    {
      println("Menor de idade")
    }

}

fun bonusWhen(cargo: String): Float {
    var bonus = 0f
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Engenheiro de Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f

    }
}