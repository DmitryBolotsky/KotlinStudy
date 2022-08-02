//Primary Constructor
class Person(val firstName: String, val lastName:String,var age:Int){
    var children: MutableList<Person> = mutableListOf()

    init{
        println("Person $firstName is created")
    }
    //конструктор
    constructor(firstName: String,lastName: String,age: Int,child: Person): this(firstName,lastName,age)
    {
        children.add(child)
    }
    //конструктор по умолчанию
    constructor():this("","",-1)
}
// класс с data добавляет методы tostring, hashcode, equals
data class Rectangle(var height: Double, var length: Double){
    var perimeter = (height+length)*2
    var test = 1
        get() = field+1//field == this
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }
    fun area() = height * length
}
fun main()
{
    val child = Person("Child","Child",2)
    val p1 = Person("Tom","Pearson",22)
    val p2 = Person("Father","Dad",35,child)
    println(p1.firstName)
}