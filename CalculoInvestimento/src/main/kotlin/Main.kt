import kotlin.math.round

fun main(args: Array<String>) {
    val salario = 10000.00
    var patAna = 0.00
    var patPaula = 0.00
    var mes = 0
    do {
        patAna += (salario * 0.05) + (salario * 0.05) + (patAna * 0.002)
        patPaula += (salario * 0.05) + (patPaula * 0.008)
        mes++

        println("Mês: $mes | Ana : R$ ${roundOffDecimal(patAna)} || Paula: R$ ${roundOffDecimal(patPaula)}")

    } while (patAna > patPaula)

    println("======================================================")
    println("Ana R$ ${roundOffDecimal(patAna * 0.002f)}")
    println("Paula R$ ${roundOffDecimal(patPaula * 0.008f)}")
    println("Paula vai passar o patrimônio da Ana no mês $mes que equivalem a ${round((mes/12).toDouble())} anos")
}


fun roundOffDecimal(number: Double): Double {
    return round(number * 100) / 100.0
}