class Person constructor(val fname:String, val age: Int){
    val firstName:String
    val perAge:Int

    init {
        firstName = fname
        perAge = age

        println("First Name = $firstName")
        println("First Name = $firstName Age: $age")
    }
}
