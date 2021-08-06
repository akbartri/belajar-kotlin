class Person(val firstName: String = "Akbar", val lastName: String = "Tri") {

//    val firstName = _firstName
//    val lastName = _lastName
//    adding more variable in the class
    var nickName: String? = null

    fun printInfo() {
//        sama dengan val nickNameToPrint = if(nickName != null) nickName else "no Nickname"
//        ?: pengganti if else
        val nickNameToPrint = nickName ?: "no Nickname"
        println("$firstName '$nickNameToPrint' $lastName")
    }

//    by default in kotlin, classes, function etc. were public
}