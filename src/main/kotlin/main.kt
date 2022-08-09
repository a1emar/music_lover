fun main() {
    val cost = 2000
    val regularCustomer = true

    val stDiscount = 100
    val bigDiscount = 0.05
    val regDiscount = 0.01
    println("покупка - $cost рублей →")
    val totalPrice = when (cost){
        in 0..1000 -> {
            cost
        }
        in 1001..10000 -> {
            val totalPrice1 = cost - stDiscount
            println("после применения стандартной скидки - $totalPrice1 рублей.")
            totalPrice1
        }
        in 10001..10000000 -> {
            val totalPrice2 = (cost - cost * bigDiscount).toInt()
            println("после применения 5% скидки - $totalPrice2 рублей.")
            totalPrice2
        }
        else -> {
            cost
//            println("Undefined operational") <- почему это тут выдает ошибку в 30 строке?
        }
    }

    if (regularCustomer) {
        val result = (totalPrice - (totalPrice * regDiscount)).toInt()
        println("после применения 1% скидки - $result рублей.")
    }
}