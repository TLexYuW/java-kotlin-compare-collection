package control_demo

import model.Color
import model.Color.*
import model.Cat
import model.Dog
import model.Pet
import kotlin.random.Random

/**
 * @author : Lex Yu
 */

fun main() {
    val pet1: Pet = Cat("Whiskers", 3, "Gray")
    val pet2: Pet = Dog("Buddy", 2, "Labrador")
    checkPetType(getMyFavPet());
//    checkPetType(pet2);

    println(getSound());

    /*
    when (val pet = getMyFavPet()) {
        is Cat -> {
            println("${pet.name} is a Cat with color ${pet.color}")
            pet.meow()
        }
        is Dog -> {
            println("${pet.name} is a Dog with breed ${pet.breed}")
            pet.bark()
        }
        else -> println("${pet.name} is a generic pet")
    }
     */
}

fun choose(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(RED, ORANGE) -> ORANGE
        setOf(BLUE, YELLOW) -> BLUE
        setOf(RED, YELLOW) -> RED
        else -> throw Exception("Dirty Color")
    }

fun getSound(): String =
    when (val pet = getMyFavPet()) {
        is Cat -> pet.meow2()
        is Dog -> pet.bark2()
        else -> "----"
    }

fun checkPetType(pet: Pet) {
    when (pet) {
        is Cat -> {
            println("${pet.name} is a Cat with color ${pet.color}")
            pet.meow()
        }

        is Dog -> {
            println("${pet.name} is a Dog with breed ${pet.breed}")
            pet.bark()
        }

        else -> println("${pet.name} is a generic pet")
    }
}

fun getMyFavPet(): Pet {
    val random = Random.nextInt(2) // Generates 0 or 1
    return if (random == 0) {
        Cat("Whiskers", 3, "Gray")
    } else {
        Dog("Buddy", 2, "Labrador")
    }
}
