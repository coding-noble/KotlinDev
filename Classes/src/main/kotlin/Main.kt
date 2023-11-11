// Define the Animal class
open class Animal(private val name: String, private val sound: String) {
    fun makeSound() {
        println("$name says $sound")
    }
}

// Define the Dog class, which is a subclass of Animal
class Dog(name: String) : Animal(name, "Woof")

// Define the Cat class, which is a subclass of Animal
class Cat(name: String) : Animal(name, "Meow")

fun main() {
    // Create instances of Dog and Cat
    val buddy = Dog("Buddy")
    val whiskers = Cat("Whiskers")

    // Call the makeSound method for each animal
    buddy.makeSound()
    whiskers.makeSound()
}