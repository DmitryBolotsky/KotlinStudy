fun main(){
    val a = listOf(1,2,3,4,5)

    a.forEach{e-> println(e)} //лямбда
    println(a.map{e -> e * 2})
    println(a.filter {e -> e % 2 == 0 })
    println(a.reduce{sum, e -> sum + e})//sum это аккомулятор изначально равен нулю, в данном случае просумирует все элементы

    println(a.sortedByDescending{it})//сортировка по самому элементу по убыванию
    println(a.any{it > 10})//false аналог "существует на языке предикатов"
    println(a.all{it < 10})//true аналог "для любого на языке предикатов"

    val numbers = listOf(1,3,-4,2,-11)
    println(numbers.partition{it > 0})//разделение списка на подсписки по признаку
    val (positive,negative) = numbers.partition { it > 0 }//можем так сохранять

    println(positive)
    println(negative)

    val result = listOf("a","b","ba","ccc","ad").groupBy { it.length }//получим hashmap
    println(result)
}