fun main() {
    // Arithmetic Expressions
    val sum = 10 + 5
    val difference = 20 - 8
    val product = 6 * 7
    val quotient = 15 / 3
    val remainder = 10 % 3

    println("Arithmetic Expressions:")
    println("Sum: $sum")
    println("Difference: $difference")
    println("Product: $product")
    println("Quotient: $quotient")
    println("Remainder: $remainder")

    // Comparison Expressions
    val isEqual = (sum == difference)
    val isNotEqual = (product != quotient)
    val isGreaterThan = (sum > product)
    val isLessThanOrEqual = (difference <= quotient)

    println("\nComparison Expressions:")
    println("Is Equal: $isEqual")
    println("Is Not Equal: $isNotEqual")
    println("Is Greater Than: $isGreaterThan")
    println("Is Less Than or Equal: $isLessThanOrEqual")

    // Logical Expressions
    val logicalAnd = (isEqual && isNotEqual)
    val logicalOr = (isGreaterThan || isLessThanOrEqual)
    val logicalNot = !logicalAnd

    println("\nLogical Expressions:")
    println("Logical AND: $logicalAnd")
    println("Logical OR: $logicalOr")
    println("Logical NOT: $logicalNot")

    // String Concatenation
    val firstName = "John"
    val lastName = "Doe"
    val fullName = "$firstName $lastName"

    println("\nString Concatenation:")
    println("Full Name: $fullName")

    // Elvis Operator
    val nullableString: String? = null
    val nonNullString = nullableString ?: "Default Value"

    println("\nElvis Operator:")
    println("Non-Null String: $nonNullString")
}