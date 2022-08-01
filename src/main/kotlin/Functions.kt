
fun main()
{
    println(testSimple())//10
    println(testSimple2())//тоже 10 но намного кайфовее
    println(sumOfTwoInts(7,8))//15 добавили аргументы
    println(testString(sumOfTwoInts(4,6)))

    testNamedArguments(y = 4,z = 2,x = 5)//именованные аргументы
    testDefaultArguments()//по умолчанию
    testDefaultArguments(8,1)//заданные

    printEven(1,2,3,4,5,6,7,8)//обычный вызов
    printEven(*intArrayOf(1,2,3,4,5,6),7,8)//добавляем * чтобы передавать элементы массива
}
fun testSimple(): Int{
    return 5+5
}

fun testSimple2(): Int = 5+5
fun sumOfTwoInts(x:Int,y:Int):Int = x+y
fun testString(x: Int):String = "String is $x"
fun testNamedArguments(x: Int,y: Int,z:Int): List<Int> = listOf(x,y,z)
fun testDefaultArguments(x: Int = 1,y:Int = 2) = println(x+y)//значение по умолчанию
fun printEven(vararg numbers: Int) = numbers.forEach { e->if(e%2==0) println(e) }//трушный форыч и варарг