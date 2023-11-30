package model

/**
 * @author : Lex Yu
 */
// Parent class
open class Pet(val name: String, val age: Int) {
    fun makeSound() {
        println("Generic pet sound")
    }

    override fun toString(): String {
        return "Pet(name='$name', age=$age)"
    }
}

// Subclass 1
class Cat(name: String, age: Int, val color: String) : Pet(name, age) {
    fun meow() {
        println("Meow!")
    }

    fun meow2(): String {
        return "Meow!"
    }

    override fun toString(): String {
        return "Cat(name='$name', age=$age, color='$color')"
    }
}

// Subclass 2
class Dog(name: String, age: Int, val breed: String) : Pet(name, age) {
    fun bark() {
        println("Woof!")
    }

    fun bark2(): String {
        return "Woof!"
    }

    override fun toString(): String {
        return "Dog(name='$name', age=$age, breed='$breed')"
    }
}
