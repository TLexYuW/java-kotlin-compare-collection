package koans.intro

/**
 * @author : Lex Yu
 */
fun main() {
    println(start())

    println(joinOptions(arrayListOf("abc", "def", "ghk")))

    println(useFoo())

    println(tripleQuotedString)

    val dateStr = "24 AUG 1957"
    if (dateStr.matches(getPattern().toRegex())) {
        println("$dateStr is a valid date.")
    } else {
        println("$dateStr is not a valid date.")
    }

    val mailer: Mailer = MailerImpl()
    val personalInfo = PersonalInfo(email = "client@example.com")
    val client = Client(personalInfo)

    sendMessageToClient(client, "Hello!", mailer)


    checkAge(1000)
}

// 1. intro
fun start(): String = "OK"

// 2. Named arguments
fun joinOptions(options: Collection<String>) =
    options.joinToString(prefix = "[", postfix = "]")

// 3. Default arguments
fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) =
    (if (toUpperCase) name.uppercase() else name) + number

fun useFoo() = listOf(
    foo("a"),
    foo("b", number = 1),
    foo("c", toUpperCase = true),
    foo(name = "d", number = 2, toUpperCase = true)
)

// 4. Triple-quoted strings
const val question = "life, the universe, and everything"
const val answer = 42

val tripleQuotedString = """
    #question = "$question"
    #answer = $answer""".trimMargin("#")

// 5. String templates
const val month = "(JAN|FEB|MAR|APR|MAY|JUN|JUL|AUG|SEP|OCT|NOV|DEC)"
fun getPattern(): String = """\d{2} $month \d{4}"""

// 6. Nullable types
fun sendMessageToClient(
    client: Client?, message: String?, mailer: Mailer
) {
    val email = client?.personalInfo?.email
    if (email != null && message != null) {
        mailer.sendMessage(email, message)
    }
}

class Client(val personalInfo: PersonalInfo?)
class PersonalInfo(val email: String?)
interface Mailer {
    fun sendMessage(email: String, message: String)
}

class MailerImpl : Mailer {
    override fun sendMessage(email: String, message: String) {
        println("Sending email to $email with message: $message")
    }
}

// 7. Nothing type
fun failWithWrongAge(age: Int?): Nothing {
    throw IllegalArgumentException("Wrong age: $age")
}

fun checkAge(age: Int?) {
    if (age == null || age !in 0..150) failWithWrongAge(age)
    println("Congrats! Next year you'll be ${age + 1}.")
}

// 8. Lambdas
fun containsEven(collection: Collection<Int>): Boolean =
    collection.any { it % 2 == 0 }