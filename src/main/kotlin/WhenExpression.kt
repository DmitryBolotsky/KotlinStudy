fun main()
{
testWhen(1)
}
fun testWhen(input: Any)
{
    //ну это switch/case

    when(input){
        1 ->println("Единица")
        2 -> println("Двойка")
        in 10..20 -> println("От 10 до 20")
        is String -> println("Строка ${input.length}")//котлин берет на себя downcasting ( (String)object)
        else -> println("Что-то еще")

    }
}