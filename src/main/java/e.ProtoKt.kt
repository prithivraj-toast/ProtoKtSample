import java.io.File

private fun main() {
    writeToast()
    readToast()
}

private fun writeToast() {
    val person = Person {
        name = "Raj"
        id = 1
        phone = "007"
        phoneType = PhoneType.MOBILE
    }
    val byteArray = person.serialize()
    File("google1").writeBytes(byteArray)
}

private fun readToast() {
    val readBytes = File("google1").readBytes()
    val person1 = Person.deserialize(readBytes)
    println(person1)
}