private fun main() {
    val person = Person {
        name = "Raj"
        id = 1
        phone = "007"
        phoneType = PhoneType.MOBILE
        cake = Person.Cake.Have(true)
    }

    println(person.cake)
}