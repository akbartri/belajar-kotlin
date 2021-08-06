//by default, classes were closed (cant be inherit from another class, to open it, type 'open' syntax in parent class)
class FancyInfoProvider : BasicInfoProvider() {
    override fun printInfo(person: Person) {
        println(person.printInfo())
    }
}