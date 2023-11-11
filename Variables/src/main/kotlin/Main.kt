fun main() {
    // Immutable variables (val)
    val intVariable = 42
    val doubleVariable = 3.14
    val charVariable = 'A'
    val booleanVariable = true
    val stringVariable = "Hello, Kotlin!"

    println("Immutable variables:")
    println("Int: $intVariable")
    println("Double: $doubleVariable")
    println("Char: $charVariable")
    println("Boolean: $booleanVariable")
    println("String: $stringVariable")

    // Mutable variables (var)
    var mutableVariable = 10
    println("\nMutable variable (before): $mutableVariable")

    // Change the value of the mutable variable
    mutableVariable = 20
    println("Mutable variable (after): $mutableVariable")

    // Nullable variables
    val nullableVariable: String? = null
    println("\nNullable variable: $nullableVariable")
}