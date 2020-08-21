private fun main() {
    val person = Person {
        name = "Raj"
        id = 1
        phone = "007"
        phoneType = PhoneType.MOBILE
        cake = Person.Cake.Have(true)
    }

    when(person.cake) {
        is Person.Cake.Have -> println("Have")
        is Person.Cake.Eat -> println("Eat")
        null -> println("No cake")
    }
}