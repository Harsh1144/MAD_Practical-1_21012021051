fun main(){
    println("Enter the numbers : ")
    val x = readln()!!.toInt()
    val y = readln()!!.toInt()
    operation(x, y)
}

fun operation(x:Int,y:Int){
    val sum = x + y
    val sub = x - y
    val div = x / y
    val mul = x * y
    println("Enter the Operation : ")
    val op = readln()

    when(op) {
        '+'.toString() -> println("$sum")
        '-'.toString() -> println("$sub")
        '/'.toString() -> println("$div")
        '*'.toString() -> println("$mul")
        else -> println("Enter valid num")
    }
}