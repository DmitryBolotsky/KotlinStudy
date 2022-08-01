fun main()
{
    //форыч
    val items = listOf("apple","bannana","orange")
    //mutableListOf("apple","bannana","orange")//arraylist

    for(item in items)
        println(item)
    //while
    var index = 0
    while(index<items.size)
    {
        println("Item at ${index+1} is ${items[index]}")
        index++
    }
    //Диапозоны
    println(5 in 1..5)// true так как 5 в диапозоне

    for(i in 1..10)
        println(i)

    for(i in 1 until 10)//until позволяет не включать последний элемент из диапозона(строгое сравнение последнего элемента)
        println(i)

    println(5 in 1 until 5)// тут уже будет false

    for(i in 10 downTo 1)//обратный порядок
        println(i)

    for(i in 100 downTo 0 step 10)//добавляем шаг
        println(i)
}