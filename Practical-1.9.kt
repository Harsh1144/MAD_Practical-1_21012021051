fun findMax(list: List<Int>): Int? {
    return list.max()
}
fun main() {
    val list = listOf(10, 4, 2, 7, 6, 9)
    println(list)
    val max = findMax(list)
    println("Max number is: $max")
}