//    variable local
val name: String = "Baaws";
//    will be error coz variable local is read-only / immutable
//    name = "Jodi"

//mutable
var lastName: String = "The Great"

//data type in kotlin by default was non-null
//var greeting: String = null
//will be error since default was non-null

//bisa diakalin dengan tambah ? di akhir tipe data
var greeting: String? = null

//kotlin support auto detect datatype
var name1 = "name without data type"

//base function
//penulisan baku
//fun getAge(): String {
//    return "My age is"
//}

//penulisan 1 line function
fun getAge() = "My age is"

fun sayAge() {
    println(getAge())
}

//example function with param with one line
fun sayHello(greeting:String, varToGreet:String) = println("$greeting $varToGreet")

//example function with param with no one line
fun sayHello1(greeting:String, varToGreet:String) {
    val msg = greeting + " " + varToGreet
    println(msg)
}

//end of base function

//collections and iteration
fun collectionsAndIteration() {
//    contoh array
    val arrayOfThings = arrayOf("java","javascript","kotlin")
    println(arrayOfThings.size)
    println(arrayOfThings[0])   //sama aja
    println(arrayOfThings.get(0))   //sama aja

//    print by iteration
    for(arrayOfThing in arrayOfThings) {
        println(arrayOfThing)
    }

//    it is the default variable name if we didnt declare
    arrayOfThings.forEach {
        println(it)
    }

    arrayOfThings.forEach { arrayOfThing ->
        println(arrayOfThing)
    }

    arrayOfThings.forEachIndexed { index, arrayOfThing ->
        println("$arrayOfThing is at index $index")
    }
    
//    contoh list
    val listOfThings = listOf("bahasa","pemrograman","dari","spanyol")

    //contoh map
    val mapOfThings = mapOf(1 to "A",2 to "B",3 to "C",4 to "D")
    mapOfThings.forEach { key, value -> println("$key -> $value") }

//    by default array, list dan map adalah immutable, jika ingin mutable dapat pakai function lain
//    contoh
    val listOfThingsMutable = mutableListOf("asd","fgh")
    listOfThingsMutable.add("jkl")
}
//end of collections and iteration

//vararg
fun greet(greeting: String, vararg itemsToGreet:String) {
    itemsToGreet.forEach { itemToGreet ->
        println("$greeting $itemToGreet")
    }
}
//sama seperti ... pada js

//named & default value parameter
fun greetAnimal(greeting: String = "Hello", animalName: String = "Cat") = println("$greeting $animalName")

fun main() {
//    println("Hello Baaws")
    println(lastName)
    lastName = "The Noob"
    println(lastName)
    println(greeting)

//    println(greeting)

    println(name1)

    //seperti swtich case pada java
//    greeting = "hi"
//    greeting = null
    when(greeting) {
        null -> println("this is null greeting")
        else -> println(greeting)
    }

    var printGreeting = if(greeting != null) greeting else "this default null"
    println(printGreeting)

    var printGreeting1 = when(greeting) {
        null -> "this default null in when"
        else -> greeting
    }
    println(printGreeting1)

    println(getAge())
    sayAge()

    sayHello("wasap","bro")
    sayHello1("yakali","bor")

    collectionsAndIteration()

    //vararg
    greet("hi") //cara manggilnya bisa seperti ini, karna itemsToGreet dianggap array kosong jadi tidak error, dan fungsi tidak akan terpanggil
    greet("hi","baaws") //bisa juga seperti ini
    greet("hi","baaws","abau","akbar","rabka") //bisa juga seperti ini, pengaplikasiannya seperti ... pada js

    val arrayName = arrayOf("abau","akbar","rabka")
    greet("hi",*arrayName) //bisa juga seperti ini, menggunakan spread operator (*)

    //with named parameter, we can change the order of parameter
    greetAnimal(animalName = "dog", greeting = "hi")
    //default value, we can call function without the param
    greetAnimal()
    //bisa juga seperti ini
    greetAnimal(animalName = "penguin")

    //class
    //for calling empty class, you can be like this
    val emptyPerson = EmptyPerson()

    //for not empty class, you can call it like this
    val person = Person("Andi","Uhuy")
//    person.nickName = "cucay" //setter
//    person.nickName //getter
    person.printInfo()

//    karna sudah ada default values, makan dapat dipanggil tanpa harus define parameternya
    val person1 = Person()
    person1.nickName = "The Dead Eye"
    person1.printInfo()
}