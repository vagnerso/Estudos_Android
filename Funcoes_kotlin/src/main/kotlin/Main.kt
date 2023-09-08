fun main(args: Array<String>) {
    val name = "Vagner Oliveira"

    println("Olá $name")

    convertYears(5)

    println("O texto $name possui ${caracteres(name)} caracteres")

}

fun convertYears(numberYears: Int){

    // escrever uma função que seja capaz de receber o ano e retornar a quandidade de meses, dias,horas, minutos segundos

    println("$numberYears anos equivalem a :")
    println("${numberYears * 12} meses")
    println("${numberYears * 365} dias")
    println("${numberYears * 365 * 24} horas")
    println("${numberYears * 365 * 24 * 60} minutos")
    println("${numberYears * 365 * 24 * 60 * 60} segundos")

}

fun caracteres(str: String): Int{
    return str.length
}

fun soma(a: Int, b:Int) = a + b
