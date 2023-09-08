fun main(args: Array<String>) {
    imprimaOsNumerosAteh(10)
    imprimaOsNumerosAteh(50)
}

fun imprimaOsNumerosAteh(numeroMaximo: Int){
    for (i in 1..numeroMaximo){
        println("Número: $i")
    }
}