fun main() {
    // For loop
    println("For loop:")
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // For loop with step
    println("\nFor loop with step:")
    for (i in 0..<10 step 2) {
        print("$i ")
    }
    println()

    // While loop
    println("\nWhile loop:")
    var counter = 5
    while (counter > 0) {
        print("$counter ")
        counter--
    }
    println()

    // Do-while loop
    println("\nDo-while loop:")
    var number = 1
    do {
        print("$number ")
        number += 2
    } while (number <= 10)
}