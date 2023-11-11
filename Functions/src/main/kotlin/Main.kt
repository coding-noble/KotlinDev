fun main() {
    // Function without parameters and return type
    helloWorld()

    // Function with parameters and return type
    println("Sum: " + addNumbers(5, 7))

    // Function with default parameter
    printMessage()

    // Function with named parameters
    printUserInfo(name = "Alice", age = 30)

    // Function as an expression
    val maxNumber = getMax(10, 15)
    println("Maximum number: $maxNumber")
}

// Function without parameters and return type
fun helloWorld() {
    println("Hello World!!")
}

// Function with parameters and return type
fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

// Function with default parameter
fun printMessage(message: String = "Default Message") {
    println(message)
}

// Function with named parameters
fun printUserInfo(name: String, age: Int) {
    println("Name: $name, Age: $age")
}

// Function as an expression
fun getMax(x: Int, y: Int): Int = if (x > y) x else y