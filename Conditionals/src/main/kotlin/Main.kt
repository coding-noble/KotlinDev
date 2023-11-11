fun main(args: Array<String>) {
    // If statement
    val number = 42

    if (number > 0) {
        println("$number is positive.")
    }

    // If-else statement
    val temperature = 25

    if (temperature > 30) {
        println("It's hot outside.")
    } else {
        println("It's not too hot.")
    }

    // If-else else-if statements
    val grade = 85

    if (grade >= 90) {
        println("A")
    } else if (grade >= 80) {
        println("B")
    } else if (grade >= 70) {
        println("C")
    } else {
        println("D")
    }

    // When expression (similar to switch in other languages)
    val dayOfWeek = 3
    val dayString = when (dayOfWeek) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day"
    }

    println("Day of the week: $dayString")

    // Conditional expression
    val isEven = if (number % 2 == 0) "even" else "odd"
    println("$number is $isEven.")
}