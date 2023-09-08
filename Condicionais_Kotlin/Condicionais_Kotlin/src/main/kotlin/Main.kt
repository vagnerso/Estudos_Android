fun main(args: Array<String>) {
    saudacao(true)
    saudacao(false)
    maiorDeIdade(38)
    maiorDeIdade(10)
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