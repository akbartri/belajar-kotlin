interface PersonInfoProvider {
    fun printInfo(person: Person) {
        println("basicInfoProvider")
        person.printInfo()
        println("basicInfoProvider1 ${person.firstName}")
    }
}

//abstract can make class doesnt have to implement all or any func in the interface
open class BasicInfoProvider : PersonInfoProvider {

}

fun main() {
    val provider = BasicInfoProvider()

    provider.printInfo(Person())

    val provider2 = FancyInfoProvider()
    provider2.printInfo(Person())
}