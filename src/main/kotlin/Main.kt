

fun main(args:Array<String>){
    val car1 = Car()
    val ceo1 = Ceo()
    val social1 = Social.Instagram()
    val jeff = Person("Jeff Bez so" , 45)
    val tony = Person("Tony Stack" , 50)
    val std1 = Student("Supansa")
    val natcha = Animal()
    natcha.name = "Ms.Natcha"


    car1.brand = "Ford"
    car1.model = "Mustang"
    car1.year = 1969

    ceo1.name = "Elon Mask"
    ceo1.age = "45"
    ceo1.comp = "Facebook"

    println(natcha.name)

    ceo1.printCeo()

    println(social1.hi())
    println("${car1.brand} ${car1.model} ${car1.year}")

}