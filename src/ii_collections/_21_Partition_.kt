package ii_collections

fun example8() {
    val numbers = listOf(1, 3, -4, 2, -11)

    // The details (how multi-assignment works) will be explained later in the 'Conventions' task
    val (positive, negative) = numbers.partition { it > 0 }

    positive == listOf(1, 3, 2)
    negative == listOf(-4, -11)
}

fun List<Order>.deliveredCount(): Int {
    return count { it.isDelivered }
}

fun List<Order>.undeliveredCount(): Int {
    return count { !it.isDelivered }
}

fun Shop.getCustomersWithMoreUndeliveredOrdersThanDelivered(): Set<Customer> {
    // Return customers who have more undelivered orders than delivered
    val (_, undelivered) = customers.filter {
        it.orders.deliveredCount() != it.orders.undeliveredCount()
    }.partition {
        it.orders.deliveredCount() > it.orders.undeliveredCount()
    }
    return undelivered.toSet()
}
