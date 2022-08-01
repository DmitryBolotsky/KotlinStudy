fun main() {
    var a: String = "Hello"
    //a = null // так мы сделать не можем и спасибо без nullpointer exception

    var b:String? = "Test"
    b = null // а так уже можно
    // но нельзя вызвать методы на прямую как ниже
    //b.length

    //save call можно применить к переменной которая может хранить null
    b?.length

    //Elvis оператор - ?:
    val l = b?.length ?: -1
    println(l)

    b = if((0..10).random()>5) "fiose" else null
    //!! как save call но выбрасывает NPE
    val t = b!!.length
    println(t)

}