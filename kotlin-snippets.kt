/*
 * Kotlin Essentials - Guia de Referência
 * Inclui exemplos de sintaxe básica, funções, classes, loops, controle de fluxo, switch (when) e extensões.
 */

// 1️⃣ Sintaxe Básica e Tipagem
val message: String = "Hello, Kotlin!"
var age: Int = 25
val isActive: Boolean = true

// Inferência de tipo
val user = "Alice" // Kotlin infere como String
println("$message, Age: $age, Active: $isActive, User: $user")


// 2️⃣ Funções e Parâmetros Padrão
fun greet(name: String, age: Int = 18): String {
    return "Hello, $name. You are $age years old."
}
println(greet("Alice"))
println(greet("Bob", 30))


// 3️⃣ Classes e Herança
open class Person(val name: String, val age: Int) {
    open fun introduce() = "Hi, I'm $name and I'm $age years old."
}

class Employee(name: String, age: Int, val role: String) : Person(name, age) {
    override fun introduce() = "Hi, I'm $name, a $role, and I'm $age years old."
}

val alice = Employee("Alice", 30, "Software Engineer")
println(alice.introduce())


// 4️⃣ Controle de Fluxo - Condicionais
fun checkNumber(num: Int): String {
    return when {
        num > 0 -> "Positive"
        num < 0 -> "Negative"
        else -> "Zero"
    }
}
println(checkNumber(5))
println(checkNumber(-3))
println(checkNumber(0))


// 5️⃣ Loops (for, while, do-while)
val numbers = listOf(1, 2, 3, 4, 5)

// Loop for
for (num in numbers) {
    println("Número: $num")
}

// Loop while
var count = 3
while (count > 0) {
    println("Contagem: $count")
    count--
}

// Loop do-while
var x = 0
do {
    println("Executando: $x")
    x++
} while (x < 3)


// 6️⃣ Switch em Kotlin (Usando `when`)
fun getDayOfWeek(day: Int): String {
    return when (day) {
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Invalid day"
    }
}
println(getDayOfWeek(3))
println(getDayOfWeek(8))


// 7️⃣ Arrays e Listas
val names: List<String> = listOf("Alice", "Bob", "Charlie")
val mutableNames: MutableList<String> = mutableListOf("Dave", "Eve")

names.forEach { println("Nome: $it") }
mutableNames.add("Frank")
println("Lista mutável: $mutableNames")


// 8️⃣ Extensões de Função
fun String.toName(): String {
    return this.lowercase().replaceFirstChar { it.uppercase() }
}

val rawName = "joHN"
println("Nome formatado: ${rawName.toName()}")
