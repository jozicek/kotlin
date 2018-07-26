package jozicek.playground.chapter8

fun main(args: Array<String>) {
    val calculator = getShippingCostsCalculator(Delivery.EXPEDITED)
    println("Shipping costs are: ${calculator(Order(3))}")
}

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostsCalculator(delivery: Delivery): (Order) -> Double {
    if (delivery == Delivery.EXPEDITED) {
        return { order -> 6 + 2.1 * order.itemCount }
    }
    return { order -> 1.2 * order.itemCount }
}